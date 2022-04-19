package org.cusey.john.dto.fortis;

public class HeaderFortis {
	
	public String token;					//1
	public String tokenIP; 					//2
	public String application;				//3 Allowed values: A-Z, 0-9, a-z Min and Max length is 2
	public int collegeId;					//4 UUID Format
	public String data;						//5
	
	public void setAll(String token, String tokenIP, String application, int collegeId, String data) {

		this.token = token;
		this.tokenIP = tokenIP;
		this.application = application;
		this.collegeId = collegeId;
		this.data = data;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTokenIP() {
		return tokenIP;
	}
	public void setTokenIP(String tokenIP) {
		this.tokenIP = tokenIP;
	}
	public String getApplication() {
		return application;
	}
	public void setApplication(String application) {
		this.application = application;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		return "Header [token=" + token + ", tokenIP=" + tokenIP + ", application=" + application + ", collegeId="
				+ collegeId + ", data=" + data + "]";
	}
	

}
