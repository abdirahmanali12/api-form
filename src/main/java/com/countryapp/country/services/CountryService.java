package com.countryapp.country.services;


import com.countryapp.country.dto.Continent;
import com.countryapp.country.dto.Country;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Service
public class CountryService {

    List<Continent> continents = Arrays.asList(
            new Continent(
                    "Africa",
                        Arrays.asList(
                                new Country(1, "Somalia","Shilling Somali"),
                                new Country(2, "Kenya","Kenyan shilling"),
                                new Country(3, "Ethiopia","Ethiopian birr"),
                                new Country(4, "Djibouti","Djiboutian franc"),
                                new Country(5, "Egypt","Egyptian pound")
                        )
            ),
            new Continent(
                    "Asia",
                    Arrays.asList(
                            new Country(6, "India","Indian Rupee"),
                            new Country(7, "Pakistan","Pakistani Rupee"),
                            new Country(8, "South korea","South Korean won "),
                            new Country(9, "Bangladesh","Bangladeshi taka"),
                            new Country(10, "Saudi","Saudi riyal")
                    )
            )

    );

   public Supplier<List<Country>> showCountriesAndCurrencies = ()-> getCountries(continents
           .stream()
           .map(Continent::getCountries).collect(Collectors.toList())
   );

   public Function<String, List<Country>> searchCountryByContinent = continent-> getCountries(continents
               .stream()
               .filter(continent1 -> continent.trim().equalsIgnoreCase(continent1.getName().trim()))
               .map(Continent::getCountries).collect(Collectors.toList()));


    public Supplier<List<Continent>> showContinents = ()->continents;

   private List<Country> getCountries(List<List<Country>> lists){
       List<Country> countries = new ArrayList();
       for(List<Country> countries1 : lists)
           countries.addAll(countries1);
       return countries;
   }

}


