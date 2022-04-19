package org.cusey.john.dto.fortis;

public enum ProductCategoryFortis {
	
	PC100("Books"),
	PC200("Cloths"),
	PC300("Course");
	
	private String value;

	ProductCategoryFortis(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
