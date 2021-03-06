package com.sg.shopping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    public CorsConfig() {}

    @Bean
    public CorsFilter getCorsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:8080");
        config.addAllowedOrigin("http://nginxserver:80");
        config.addAllowedOrigin("http://nginxserver:8080");
        config.addAllowedOrigin("http://nginxserver:8088");
        config.addAllowedOrigin("http://www.mtv.com:8080");
        config.addAllowedOrigin("http://www.mtv.com");
        config.addAllowedOrigin("http://www.music.com:8080");
        config.addAllowedOrigin("http://www.music.com");
        config.addAllowedOrigin("*");
        config.setAllowCredentials(true);
        config.addAllowedMethod("*");
        config.addAllowedHeader("*");
        UrlBasedCorsConfigurationSource corsSource = new UrlBasedCorsConfigurationSource();
        corsSource.registerCorsConfiguration("/**", config);
        return new CorsFilter(corsSource);
    }
}
