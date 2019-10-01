package com.dnx.restconcepts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * SwaggerConfig
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2).select()
        .apis(RequestHandlerSelectors.basePackage("com.dnx.restconcepts.controller")).paths(PathSelectors.any())
        .build().apiInfo(apinfo());
  }

  private ApiInfo apinfo() {
    return new ApiInfoBuilder()
            .title("Demo Documentation")
            .description("Rest API that provides programming quotes")
            .termsOfServiceUrl("Some Terms of Services URL")
            .version("1.0.0")
            .license("Some License Info")
            .licenseUrl("Some License URL")
            .contact(new Contact("Diego Vieira", "https://github.com/dinixx", "diegohenrix@gmail.com"))
            .build();
}
}
