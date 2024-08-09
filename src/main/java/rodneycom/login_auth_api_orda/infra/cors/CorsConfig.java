package rodneycom.login_auth_api_orda.infra.cors;
/*
*   Classe para implementar as regras de CORS para permitir o acesso do forntend a api
*
* */

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") //permitindo o acesso do frontend Angular (projeto logon-page)
                .allowedMethods("GET","POST");
    }
}
