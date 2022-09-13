package com.example.demo.configuration;

import com.example.demo.client.ProductClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;


@Configuration
public class AppConfig {

    @Bean
    public ProductClient productClient() throws Exception {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://dummyjson.com")
                .build();

        HttpServiceProxyFactory factory = new HttpServiceProxyFactory(WebClientAdapter.forClient(webClient));
        factory.afterPropertiesSet();
        return factory.createClient(ProductClient.class);
    }
}
