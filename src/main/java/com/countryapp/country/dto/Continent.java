package com.countryapp.country.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Continent {
    private String name;
    private List<Country> countries;
}
