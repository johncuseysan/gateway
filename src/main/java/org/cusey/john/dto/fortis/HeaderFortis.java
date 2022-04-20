package org.cusey.john.dto.fortis;

public class HeaderFortis {
	
	public String token;					
	public String tokenIP; 					
	public String application;				
	public int collegeId;					
	public String data;						
	
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
