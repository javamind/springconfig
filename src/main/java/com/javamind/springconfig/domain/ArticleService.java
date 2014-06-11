package com.javamind.springconfig.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Un service utilsiant   @Service et @Autowired
 *
 * @author EHRET_G
 */
@Service
public class ArticleService {
    @Autowired
    private AuthorService authorService;

    public AuthorService getAuthorService() {
        return authorService;
    }

    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }


}
