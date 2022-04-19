package org.cusey.john.dto.cornell;

public enum ProductCategoryCornell {
	
	PC100("Books"),
	PC200("Cloths"),
	PC300("Course");
	
	private String value;

	ProductCategoryCornell(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
