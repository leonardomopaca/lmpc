package com.energybox.backendcodingchallenge.service;

import com.energybox.backendcodingchallenge.domain.Gateway;
import com.energybox.backendcodingchallenge.domain.Sensor;
import com.energybox.backendcodingchallenge.repository.GatewayRepository;
import com.energybox.backendcodingchallenge.repository.SensorRepository;
import org.neo4j.annotations.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@Service
public class SensorService {

    @Autowired
    private SensorRepository sensorRepository;

    @Autowired
    private GatewayRepository gatewayRepository;

    public Iterable<Sensor> getSensors(){
        return sensorRepository.findAll();
    }

    public Optional<Sensor> getSensorById(Long id){
        return sensorRepository.findById(id);
    }

    public Iterable<Optional<Sensor>> getSensorByGateway(Gateway gateway){
        return sensorRepository.getSensorsByGateway(gateway);
    }


    public Sensor saveSensor(Sensor sensor){
        return sensorRepository.save(sensor);
    }

}
