package com.leo.paribas.challenge.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="movimento_manual")
public class MovimentoManual {
    //TODO verificar o mapeamento das variáveis com o nome na tabela
    private Long numLancamento;
    private Integer datMes;
    private Integer datAno;
    private String codProduto;
    private String codCosif;
    private String desDescricao;
    private LocalDateTime datMovimento;
    private String codUsuario;
    private BigDecimal valValor;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getNumLancamento() {
        return numLancamento;
    }

    public void setNumLancamento(long numLancamento) { this.numLancamento = numLancamento; }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public void setNumLancamento(Long numLancamento) {
        this.numLancamento = numLancamento;
    }

    public Integer getDatMes() {
        return datMes;
    }

    public void setDatMes(Integer datMes) {
        this.datMes = datMes;
    }

    public Integer getDatAno() {
        return datAno;
    }

    public void setDatAno(Integer datAno) {
        this.datAno = datAno;
    }

    public String getCodCosif() {
        return codCosif;
    }

    public void setCodCosif(String codCosif) {
        this.codCosif = codCosif;
    }

    public String getDesDescricao() {
        return desDescricao;
    }

    public void setDesDescricao(String desDescricao) {
        this.desDescricao = desDescricao;
    }

    public LocalDateTime getDatMovimento() {
        return datMovimento;
    }

    public void setDatMovimento(LocalDateTime datMovimento) {
        this.datMovimento = datMovimento;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public BigDecimal getValValor() {
        return valValor;
    }

    public void setValValor(BigDecimal valValor) {
        this.valValor = valValor;
    }
}
