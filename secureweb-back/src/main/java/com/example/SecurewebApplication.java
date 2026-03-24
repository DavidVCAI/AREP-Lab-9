package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Collections;

@SpringBootApplication
public class SecurewebApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SecurewebApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", getPort()));
        app.run(args);
    }

    private static String getPort() {
        if (System.getenv("PORT") != null) {
            return System.getenv("PORT");
        }
        return "5000";
    }
}
