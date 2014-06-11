package com.javamind.springconfig.loadbean;

import com.javamind.springconfig.config.Example1Config;
import com.javamind.springconfig.domain.ArticleService;
import com.javamind.springconfig.domain.ArticleService2;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Avec de la Java config
 * @author EHRET_G
 */
@ContextConfiguration(classes = Example1Config.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Spring2Test {
    @Autowired
    ArticleService articleService;

    @Autowired
    ArticleService2 articleService2;

    @Test
     public void shouldLoadBeansInArticleService(){
        Assertions.assertThat(articleService).isNotNull();
        Assertions.assertThat(articleService.getAuthorService()).isNotNull();
        Assertions.assertThat(articleService.getAuthorService().getMaMapExemple()).containsKeys("key1","key2");
    }

    @Test
    public void shouldLoadBeansInArticleService2(){
        Assertions.assertThat(articleService2).isNotNull();
        Assertions.assertThat(articleService2.getAuthorService()).isNotNull();
        Assertions.assertThat(articleService2.getAuthorService().getMaMapExemple()).containsKeys("key1","key2");
    }
}
