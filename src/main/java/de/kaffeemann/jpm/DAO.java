package de.kaffeemann.jpm;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public DAO(final DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public String get() {
		return jdbcTemplate.queryForObject("select * from public.\"CREDHUBLITE\"", String.class);
	}

}
