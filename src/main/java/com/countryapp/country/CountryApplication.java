package com.countryapp.country;

import com.countryapp.country.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryApplication {

	public static void main(String[] args) { SpringApplication.run(CountryApplication.class, args); }

}
