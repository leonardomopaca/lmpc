package br.com.agr.controller;

import br.com.agr.model.ProdutividadeTalhao;
import br.com.agr.repository.ProdutividadeTalhaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:8081")
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProdutividadeTalhaoController {

    @Autowired
    ProdutividadeTalhaoRepository produtividadeTalhaoRepository;

    /*Buscando toda produção*/
    @GetMapping("/produtividadeTalhao")
    public ResponseEntity<List<ProdutividadeTalhao>> getAllProdutividadeTalhao
            (@RequestParam(required=false) String nomeProduto){
        try {
            List<ProdutividadeTalhao> produtividadesTalhao = new ArrayList<ProdutividadeTalhao>();

            if(nomeProduto == null)
                produtividadeTalhaoRepository.findAll().forEach(produtividadesTalhao::add);
            else
                produtividadeTalhaoRepository.encontrarPorNomeProduto(nomeProduto).forEach(produtividadesTalhao::add);

            if(produtividadesTalhao.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(produtividadesTalhao, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /*Buscando produção por Id de Produto*/
    @GetMapping("/produtividadeTalhao/{id}")
    public ResponseEntity<ProdutividadeTalhao> getProdutividadeTalhaoPeloID
            (@PathVariable("id") String id){
        Optional<ProdutividadeTalhao> produtividadeTalhaoData = produtividadeTalhaoRepository.findById(id);

        if(produtividadeTalhaoData.isPresent()){
            return new ResponseEntity<>(produtividadeTalhaoData.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*Buscando produção por Disponibilidade*/
    @GetMapping("/produtividadeTalhao/disponivel")
    public ResponseEntity<List<ProdutividadeTalhao>> findByDisponivel(){
        try{
            List<ProdutividadeTalhao> produtividadesTalhao = produtividadeTalhaoRepository.encontraPorDisponibilidade(true);

            if (produtividadesTalhao.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(produtividadesTalhao, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /* Criando uma Produtividade*/
    @PostMapping("/produtividadeTalhao")
    public ResponseEntity<ProdutividadeTalhao> createProdutividadeTalhao
            (@RequestBody ProdutividadeTalhao produtividadeTalhao){

        try {
            ProdutividadeTalhao _prodTalhao = produtividadeTalhaoRepository.save
                    (new ProdutividadeTalhao(produtividadeTalhao.getNomeProduto(),
                            produtividadeTalhao.getDescricao(),
                            false,//produtividadeTalhao.getDisponivel(),
                            produtividadeTalhao.getValor()));
                    return new ResponseEntity<>(_prodTalhao, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.EXPECTATION_FAILED);
        }
    }

    @PutMapping("/produtividadeTalhao/{id}")
    public ResponseEntity<ProdutividadeTalhao> updateProdutividadeTalhao
            (@PathVariable("id") String id, @RequestBody ProdutividadeTalhao produtividadeTalhao){
        Optional<ProdutividadeTalhao> produtividadeTalhaoData = produtividadeTalhaoRepository.findById(id);

        if (produtividadeTalhaoData.isPresent()){
            ProdutividadeTalhao _prodTalhao = produtividadeTalhaoData.get();
            _prodTalhao.setNomeProduto(produtividadeTalhao.getNomeProduto());
            _prodTalhao.setDescricao(produtividadeTalhao.getDescricao());
            _prodTalhao.setDisponivel(produtividadeTalhao.getDisponivel());
            _prodTalhao.setValor(produtividadeTalhao.getValor());
            return new ResponseEntity<>(produtividadeTalhaoRepository.save(_prodTalhao), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/produtividadeTalhao/{id}")
    public ResponseEntity<HttpStatus> deleteProdutividadeTalhao
            (@PathVariable("id") String id){
        try{
            produtividadeTalhaoRepository.deleteById(id);
            return  new ResponseEntity<>(HttpStatus.NO_CONTENT);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }

    @DeleteMapping("/produtividadeTalhao")
    public ResponseEntity<HttpStatus> deleteAllProdutividadeTalhao(){
        try{
            produtividadeTalhaoRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
        }
    }
}
