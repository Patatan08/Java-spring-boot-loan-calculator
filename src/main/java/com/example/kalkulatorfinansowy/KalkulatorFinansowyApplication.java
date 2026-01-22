package com.example.kalkulatorfinansowy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KalkulatorFinansowyApplication {

    public static void main(String[] args){
    try {
        SpringApplication.run(KalkulatorFinansowyApplication.class, args);
    System.out.println("Aplikacja uruchomiona");
    }
    catch (Exception e){
        System.err.println("Aplikacja nie zostałą poprawnie uruchomiona");
        throw e;

        }
    }
}

