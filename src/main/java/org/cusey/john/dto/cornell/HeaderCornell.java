package org.cusey.john.dto.cornell;

public class HeaderCornell {
	
	public String token;					
	public String tokenIP; 					
	
	public int collegeId;					
	public int projectId;					
	
	public String data;						
	public String tokenAuth; 				
	
	
	public void setAll(String token, String tokenIP, int collegeId, int projectId, String data, String tokenAuth) {
		this.token = token;
		this.tokenIP = tokenIP;
		this.collegeId = collegeId;
		this.projectId = projectId;
		this.data = data;
		this.tokenAuth = tokenAuth;
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
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTokenAuth() {
		return tokenAuth;
	}
	public void setTokenAuth(String tokenAuth) {
		this.tokenAuth = tokenAuth;
	}
	
	@Override
	public String toString() {
		return "Header [token=" + token + ", tokenIP=" + tokenIP + ", collegeId=" + collegeId + ", projectId="
				+ projectId + ", data=" + data + ", tokenAuth=" + tokenAuth + "]";
	}
	

	

}
