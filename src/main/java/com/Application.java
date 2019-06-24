package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Mikolaj on 25.02.2017.
 */
@SpringBootApplication
@ComponentScan
public class Application {

    //private static final Logger log = LoggerFactory.getLogger(com.Application.class);

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);

    }

}