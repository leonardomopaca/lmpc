package br.com.agr.controller;

import br.com.agr.model.ProdutividadeTalhao;
import br.com.agr.repository.ProdutividadeTalhaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProdutividadeTalhaoController {

    @Autowired
    ProdutividadeTalhaoRepository produtividadeTalhaoRepository;

    @GetMapping("/produtividadeTalhao")
    public List<ProdutividadeTalhao> getAllProdutividadeTalhao(){
        //Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC);  //Sort(Sort.Direction.DESC, "createdAt");
        //return produtividadeTalhaoRepository.findAll(sortByCreatedAtDesc);
        return null;
    }

    @PostMapping("/produtividadeTalhao")
    public ProdutividadeTalhao createProdutividadeTalhao(@Valid @RequestBody ProdutividadeTalhao produtividadeTalhao){
        produtividadeTalhao.setCompleted(false);
        return (ProdutividadeTalhao) produtividadeTalhaoRepository.save(produtividadeTalhao);
    }

    @GetMapping(value = "/produtividadeTalhao/{id}")
    public ResponseEntity<ProdutividadeTalhao> getProdutividadeTalhaoPorId(@PathVariable("id") String id){
        return (ResponseEntity<ProdutividadeTalhao>) produtividadeTalhaoRepository.findById(id)
                .map(produtividadeTalhao -> ResponseEntity.ok().body(produtividadeTalhao))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value = "/produtividadeTalhao/{id}")
    public ResponseEntity<ProdutividadeTalhao> updateProdutividadeTalhao(@PathVariable("id") String id,
                                                                         @Valid @RequestBody ProdutividadeTalhao
                                                                         produtividadeTalhao){
        return (ResponseEntity<ProdutividadeTalhao>) produtividadeTalhaoRepository.findById(id)
                .map(produtividadeTalhaoData -> {
                    produtividadeTalhao.setTitle(produtividadeTalhao.getTitle());
                    produtividadeTalhao.setCompleted(produtividadeTalhao.getCompleted());
                    ProdutividadeTalhao updateProdutividadeTalhao = (ProdutividadeTalhao)
                            produtividadeTalhaoRepository.save(produtividadeTalhaoData);
                    return ResponseEntity.ok().body(updateProdutividadeTalhao);
                }).orElse(ResponseEntity.notFound().build());

    }

    @DeleteMapping(value = "/produtivididadeTalhao/{id}")
    public ResponseEntity<?> deleteProdutividadeTalhao(@PathVariable("id") String id){
        return (ResponseEntity<?>) produtividadeTalhaoRepository.findById(id)
                .map(produtividadeTalhao -> {
                    produtividadeTalhaoRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
