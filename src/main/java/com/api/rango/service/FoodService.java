package com.api.rango.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.rango.dto.FoodDTO;
import com.api.rango.model.FoodModel;
import com.api.rango.repository.FoodRepository;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repository;

    public List<FoodModel> findAll(){
        return repository.findAll();
    }

    public void save(@RequestBody FoodDTO req){
        repository.save(new FoodModel(req));
    }
    
}
