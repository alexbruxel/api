package br.com.grazielabruxel.api;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API CRUD Graziela Bruxel")
                        .version("v1")
                        .description("REST API para CRUD de Clientes")
                ).externalDocs(new ExternalDocumentation()
                        .description("Documentação de fluxos da API")
                        .url("http://localhost:8001/swagger-ui.html")
                );
    }
}