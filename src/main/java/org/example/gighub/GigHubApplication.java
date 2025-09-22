package org.example.gighub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class GigHubApplication {

    public static void main(String[] args) {
        SpringApplication.run(GigHubApplication.class, args);
    }

}
