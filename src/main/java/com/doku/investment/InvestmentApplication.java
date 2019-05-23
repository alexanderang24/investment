package com.doku.investment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Laurence
 * @see EnableAutoConfiguration, ComponentScan, EnableJpaRepositories, EnableTransactionManagement, EntityScan
 * <p>
 * Run Main Investment Application
 * <p>
 * Anotation SpringBootApplication is newer annotation for enable auto-configuration three features anotation 
 * EnableAutoConfiguration, ComponentScan, Configuration.
 * <p>
 * Configure manually : Component, Entities, and Repositories Package will be used, this is forsecure project.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.doku.investment"})
@EnableJpaRepositories(basePackages="com.doku.investment.repositories")
@EntityScan(basePackages="com.doku.investment.entities")
public class InvestmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentApplication.class, args);
	}

}
