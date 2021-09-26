package com.example.demo;

//import com.sun.tools.javac.jvm.ClassReader;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    @ConditionalOnProperty(value = "com.example.demo",havingValue = "true",matchIfMissing = true)
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "com.example.demo",havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
