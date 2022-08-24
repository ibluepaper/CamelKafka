package ir.ghazavi.camelkafka.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class RandomNumberConfig {
    @Bean
    public Random random(){
        return new Random();
    }
}
