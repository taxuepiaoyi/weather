package com.bruce.weather.autoconfigure;

import com.bruce.weather.service.WeatherService;
import com.bruce.weather.service.impl.WeatherServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(OpenWeatherProperties.class)
public class OpenWeatherAutoConfiguration {
    public OpenWeatherAutoConfiguration() {
    }

    @Bean
    @ConditionalOnMissingBean
    public WeatherService openWeatherService(OpenWeatherProperties properties) {
        return new WeatherServiceImpl(properties.getApiKey(), properties.getBaseUrl()) ;
    }
}
