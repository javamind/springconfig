package com.javamind.springconfig.loadbean;

import com.javamind.springconfig.config.Example1Config;
import com.javamind.springconfig.domain.ArticleService;
import com.javamind.springconfig.domain.ArticleService2;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Utilsiation des noms et alias
 * @author EHRET_G
 */
@ContextConfiguration(classes = Example1Config.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Spring3Test {
    @Qualifier("articleServName")
    @Resource
    ArticleService2 name;

    @Qualifier("articleServAlias")
    @Resource
    ArticleService2 alias;

    @Test
     public void aliasShouldExist(){
        Assertions.assertThat(alias).isNotNull();
    }


    @Test
    public void nameShouldExist(){
        Assertions.assertThat(name).isNotNull();
    }

}
