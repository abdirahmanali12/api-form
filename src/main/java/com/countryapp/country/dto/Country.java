package com.countryapp.country.dto;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Country {
    private int id;
    private String name;
    private String currency;
}


