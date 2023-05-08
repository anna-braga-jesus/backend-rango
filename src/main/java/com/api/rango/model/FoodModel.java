package com.api.rango.model;

import com.api.rango.dto.FoodDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class FoodModel {
    public FoodModel(FoodDTO req){
        this.title = req.title();
        this.image = req.image();
        this.price = req.price();

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String title;
     private String image;
     private Integer price;
}
