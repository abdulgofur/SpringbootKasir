package com.kembara.springbootKasir.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.kembara.springbootKasir.dao.ItemsDao;
import com.kembara.springbootKasir.dao.PelangganDao;
import com.kembara.springbootKasir.dao.TransaksiDao;
import com.kembara.springbootKasir.dao.UserDao;
import com.kembara.springbootKasir.dao.implement.ItemDaoImpl;
import com.kembara.springbootKasir.dao.implement.PelangganDaoImpl;
import com.kembara.springbootKasir.dao.implement.TransaksiDaoImpl;
import com.kembara.springbootKasir.dao.implement.UserDaoImpl;

public class BeanConfig {
	
	@Bean
	public UserDao userService() {
		return new UserDaoImpl();
	}
	
	@Bean
	public TransaksiDao transaksiService() {
		return new TransaksiDaoImpl();
	}
	
	@Bean
	public PelangganDao pelangganService() {
		return new PelangganDaoImpl();
	}
	
	@Bean
	public ItemsDao itemService() {
		return new ItemDaoImpl();
	}
	
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
			}
		};
	}
}
