package br.evertonsantos.com.WebI;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "br.evertonsantos.com.WebI.Repository")
@Configuration

public class PersistenceConfig {

}
