package com.javamind.springconfig.config;

import com.javamind.springconfig.domain.ArticleService;
import com.javamind.springconfig.domain.ArticleService2;
import com.javamind.springconfig.domain.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import javax.annotation.Resource;

/**
 * Exemple de bean qui est injecté dans un autre
 * @see com.javamind.springconfig.config.Example1Config
 */
@Configuration
@ComponentScan("com.javamind.springconfig.domain")
@PropertySource(value = "classpath:application.properties")
public class Example2Config {

    @Resource
    private Environment env;

    @Bean(name = {"articleServName", "articleServAlias"})
    public ArticleService2 articleService2(AuthorService authorService){
        ArticleService2 service =  new ArticleService2(authorService);
        service.setName(env.getProperty("blogname"));
        return service;
    }
}
