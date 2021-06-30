package com.countryapp.country.services;

import com.countryapp.country.dto.Country;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Service
public class CountryService {

    List<Country> countries = Arrays.
                asList(
                        new Country(1, "Somalia","Shilling Somali"),
                        new Country(2, "Kenya","Kenyan shilling"),
                        new Country(3, "Ethiopia","Ethiopian birr"),
                        new Country(4, "Djibouti","Djiboutian franc\n"),
                        new Country(5, "egypt","Egyptian pound")
                        );

    public Supplier<List<Country>> showCountriesAndCurrencies =  ()-> countries;

}
