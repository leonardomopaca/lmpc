package com.energybox.backendcodingchallenge.controller;

import com.energybox.backendcodingchallenge.domain.Gateway;
import com.energybox.backendcodingchallenge.domain.Sensor;
import com.energybox.backendcodingchallenge.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/sensors")
public class SensorController {

    @Autowired
    private SensorService sensorService;

    @GetMapping
    public Iterable<Sensor> findAll(){
        return sensorService.getSensors();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> getSensorById(@PathVariable Long id){
        return sensorService.getSensorById(id);
    }

    @GetMapping("/gateway/{id}")
    public Iterable<Optional<Sensor>> getSensorByGateway(@PathVariable Gateway gateway){
        return sensorService.getSensorByGateway(gateway);
    }


}
