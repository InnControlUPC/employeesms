package com.github.inncontrol.employees.shared.infrastructure.feign;

import feign.FeignException;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileFeignConfig {
    @Bean
    public ErrorDecoder errorDecoder() {
        return (methodKey, response) -> {
            if (response.status() == 404) {
                return new Exception("Profile not found");
            }
            if (response.status() == 409) {
                return new Exception("Server conflict occurred");
            }
            return FeignException.errorStatus(methodKey, response);
        };
    }

    @Bean
    public Retryer retryer() {
        return new Retryer.Default(1000, 3000, 3);
    }
}