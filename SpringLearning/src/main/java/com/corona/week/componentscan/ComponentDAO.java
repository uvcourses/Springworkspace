package com.corona.week.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	private static Logger log = LoggerFactory.getLogger(ComponentDAO.class);

	@Autowired
	ComponentJDBCConnection jdbcConnection;

	public ComponentJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComponentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

	@PostConstruct
	private void postConstruct() {
       log.info("{Hello}",jdbcConnection);
	}

	@PreDestroy
	private void preDesctroy() {
	       log.info("{Hello1}",jdbcConnection);

	}
}
