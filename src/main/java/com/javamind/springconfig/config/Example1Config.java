package com.javamind.springconfig.config;

import com.javamind.springconfig.domain.ArticleService;
import com.javamind.springconfig.domain.ArticleService2;
import com.javamind.springconfig.domain.AuthorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.HashMap;
import java.util.Map;

/**
 * Exemple de déclaration de beans via Java config
 */
@Configuration
@Import(Example2Config.class)
public class Example1Config {

    @Bean
    public AuthorService authorService(){
        AuthorService service =  new AuthorService();
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        service.setMaMapExemple(map);
        return service;
    }


}
