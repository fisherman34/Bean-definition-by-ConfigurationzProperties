package com.deviro.configuration.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sam
 * @create 2024-06-25 10:34 PM
 */

@Configuration
@ConfigurationProperties(prefix = "pizza")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PizzaConfig {
    private String sauce;
    private String topping;
    private String crust;
}
