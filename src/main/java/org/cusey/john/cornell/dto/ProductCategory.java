package org.cusey.john.cornell.dto;

public enum ProductCategory {
	
	PC100("Books"),
	PC200("Cloths"),
	PC300("Course");
	
	private String value;

	ProductCategory(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
