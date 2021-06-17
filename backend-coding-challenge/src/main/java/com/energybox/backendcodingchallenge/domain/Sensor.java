package com.energybox.backendcodingchallenge.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Map;

@NodeEntity
public class Sensor {

    @Id
    @GeneratedValue
    private Long id;

    private Map details;

    @Relationship(type = "CONNECTED_TO")
    private Gateway gateway;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map getDetails() {
        return details;
    }

    public void setDetails(Map details) {
        this.details = details;
    }

    public Gateway getGateway() {
        return gateway;
    }

    public void setGateway(Gateway gateway) {
        this.gateway = gateway;
    }
}
