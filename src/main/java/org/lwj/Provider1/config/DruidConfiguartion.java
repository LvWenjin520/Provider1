package org.lwj.Provider1.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DruidConfiguartion {
	@ConfigurationProperties(prefix="spring.datasource")
	@Bean
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}
}
