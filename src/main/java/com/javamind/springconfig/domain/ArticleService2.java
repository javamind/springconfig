package com.javamind.springconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Ici nous n'avons pas d'annotation Spring comme Autowired ou Component
 *
 * @author EHRET_G
 */
public class ArticleService2 {
    private AuthorService authorService;
    private String name;

    public ArticleService2(AuthorService authorService) {
        this.authorService = authorService;
    }

    public AuthorService getAuthorService() {
        return authorService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
