package com.wuyiwen.swagger.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("B")
                .apiInfo(apiInfo())
                .select()
                // RequestHandlerSelectors
                // .any none basePackage
                .apis(RequestHandlerSelectors.basePackage("com.wuyiwen.swagger.controller"))
                //.paths(PathSelectors.)
                .build()
                ;
    }

    private ApiInfo apiInfo(){
        Contact contact = new Contact("nationsky","http://www.nationsky.com","wuyiwen@nationsky.com");
        return new ApiInfo(
                "wyw Documentation",
                "wyw api  ??????",
                "1.0.1",
                "http://springfox.io",
                contact,
                "Apache 2.0",
                "http://www.nationsky.com");

    }
}
