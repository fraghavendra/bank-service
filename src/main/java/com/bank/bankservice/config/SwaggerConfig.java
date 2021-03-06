package com.bank.bankservice.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

   /* @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }
    private Predicate<String> postPaths() {
        return or(regex("/api/posts.*"), regex("/api/libraryservice.*"));
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("LibraryService API")
                .description("LibraryService API reference for developers")
                .termsOfServiceUrl("http://libraryservice.com")
                .contact("libraryservice@gmail.com").license("LibraryService License")
                .licenseUrl("libraryservice@gmail.com").version("1.0").build();
    }*/

    @Bean
    public Docket studentsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(studentAPIInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(regex("/.*"))
                .build();
//                        securitySchemes(Arrays.asList(basicAuth()));
    }


}