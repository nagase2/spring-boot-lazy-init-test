package com.naggi.springboot.lazyinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
//@ComponentScan(basePackageClasses = LazyApplication.class,lazyInit=true)
//@ComponentScan(basePackageClasses = LazyApplication.class)
public class LazyApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(LazyApplication.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(LazyApplication.class, args);
    }
    
//    @Configuration
//    @Profile("local")
//    @ComponentScan(lazyInit = true)
//    static class LocalConfig {
//    }
}
