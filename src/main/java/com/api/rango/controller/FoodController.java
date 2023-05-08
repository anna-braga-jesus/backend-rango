package com.api.rango.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.api.rango.dto.FoodDTO;
import com.api.rango.model.FoodModel;
import com.api.rango.repository.FoodRepository;
import com.api.rango.service.FoodService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;
    
    
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public String saveFood(@RequestBody FoodDTO data){
        service.save(data);
        return "Receita criada!";
    }


    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<FoodModel> getAll(){
         return service.findAll();
    }


   
}
