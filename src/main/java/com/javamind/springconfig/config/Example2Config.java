package com.javamind.springconfig.config;

import com.javamind.springconfig.domain.ArticleService;
import com.javamind.springconfig.domain.ArticleService2;
import com.javamind.springconfig.domain.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Exemple de bean qui est injecté dans un autre
 * @see com.javamind.springconfig.config.Example1Config
 */
@Configuration
@ComponentScan("com.javamind.springconfig.domain")
public class Example2Config {


    @Bean
    public ArticleService2 articleService2(AuthorService authorService){
        return  new ArticleService2(authorService);
    }
}
