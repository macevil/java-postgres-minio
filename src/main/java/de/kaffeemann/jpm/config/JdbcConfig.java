package de.kaffeemann.jpm.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfig {

	@Bean
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

}
