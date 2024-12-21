package org.cepapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"org.cepapplication"})
public class CepApplication {
    public static void main(String[] args) {
        SpringApplication.run(CepApplication.class, args);
    }
}
