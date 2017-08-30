package org.kgp.domain.zoo;

import java.io.Serializable;

public class Animal implements Serializable{

	private static final long serialVersionUID = 616537937465225686L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
