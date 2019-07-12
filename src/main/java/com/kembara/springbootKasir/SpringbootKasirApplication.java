package com.kembara.springbootKasir;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.kembara.springbootKasir.config.BeanConfig;

@EntityScan({"com.kembara.springbootKasir.model"})
@SpringBootApplication
@Import(BeanConfig.class)
@EnableJpaRepositories("com.kembara.springbootKasir.Repository")
public class SpringbootKasirApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKasirApplication.class, args);
	}

}
