package br.com.agr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



import java.util.Date;

@Document(collection="produtividade")
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class ProdutividadeTalhao {

    @Id
    private String id;

    @NotBlank
    private String title;

    private Boolean completed = false;

    private Date createdAt = new Date();


}
