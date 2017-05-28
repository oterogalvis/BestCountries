package com.bestcountries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jorgeotero on 5/27/17.
 */

@EnableAutoConfiguration
@ComponentScan
public class BestCountries {
    public static void main(String[] args) {
        SpringApplication.run(BestCountries.class, args);
    }
}
