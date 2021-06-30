package com.countryapp.country.controller;

import com.countryapp.country.dto.Country;
import com.countryapp.country.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CountriesInfoController {


    private final CountryService countryService;
    @Autowired
    public CountriesInfoController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public List<Country> allCountriesInfo(){
        return countryService.showCountriesAndCurrencies.get();
    }

    @GetMapping("/country/{id}")
    public Country showCountryInfo(@PathVariable("id") int id){
        return countryService.showCountriesAndCurrencies.get()
                .stream()
                .filter(country -> country.getId() == id)
                .findAny().orElseThrow(()-> new IllegalArgumentException("Country is not available"));

    }

}
