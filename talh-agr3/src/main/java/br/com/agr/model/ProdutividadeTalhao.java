package br.com.agr.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection = "produtividadeTalhao")
public class ProdutividadeTalhao {
    @Id
    private String id;

    private String nomeProduto;
    private String descricao;
    private Boolean disponivel;
    private Double valor;

    public String getId(){
        return id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }



    //Ainda verificando a necessidade de composição
    // private Talhao talhao
    //private Fazenda fazenda

    public ProdutividadeTalhao(){}

    public ProdutividadeTalhao(String nomeProduto, String descricao, Boolean disponivel, Double valor){
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.disponivel = disponivel;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Produtividade Talhão: id = " + id +
                ", Nome Produto = "+ nomeProduto +
                ", Descrição = "+ descricao +
                ", Disponibilidade = "+ disponivel +
                ", Valor Produto = "+ valor;
    }

}
