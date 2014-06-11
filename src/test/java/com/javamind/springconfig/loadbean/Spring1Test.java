package com.javamind.springconfig.loadbean;

import com.javamind.springconfig.domain.ArticleService;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * A la mode Spring 1
 * @author EHRET_G
 */
@ContextConfiguration("/example1Context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Spring1Test {
    @Autowired
    ArticleService articleService;

    @Test
    public void shouldLoadBeans(){
        Assertions.assertThat(articleService).isNotNull();
        Assertions.assertThat(articleService.getAuthorService()).isNotNull();
        Assertions.assertThat(articleService.getAuthorService().getMaMapExemple()).containsKeys("key1","key2");
    }
}
