package de.kaffeemann.jpm.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.kaffeemann.jpm.DAO;

@Service
public class JPMService {

	private DAO dao;

	@Autowired
	public JPMService(DAO dao) {
		this.dao = dao;
	}

	public String get() {
		return this.dao.get();
	}
}
