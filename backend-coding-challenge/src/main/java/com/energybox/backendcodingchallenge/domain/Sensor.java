package com.energybox.backendcodingchallenge.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Map;

import lombok.Data;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sensor {

    @Id
    @GeneratedValue
    private Long id;

//    private Map details;
    private String type;

    @Relationship(type = "CONNECTED_TO", direction = Relationship.INCOMING)
    private Gateway gateway;

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Map getDetails() {
//        return details;
//    }
//
//    public void setDetails(Map details) {
//        this.details = details;
//    }
//
//    public Gateway getGateway() {
//        return gateway;
//    }
//
//    public void setGateway(Gateway gateway) {
//        this.gateway = gateway;
//    }
}
