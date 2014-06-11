package com.javamind.springconfig;

import com.javamind.springconfig.config.Example1Config;
import com.javamind.springconfig.config.Example2Config;
import com.javamind.springconfig.domain.ArticleService2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * {@link }
 *
 * @author EHRET_G
 */
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Example1Config.class, Example2Config.class);
        ctx.refresh();

        ArticleService2 articleService2 = (ArticleService2) ctx.getBean("articleServName");
        if(articleService2!=null){
             System.out.println("OK");
        }
    }
}
