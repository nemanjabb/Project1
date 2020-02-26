package main.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="user")
public class User {
	@Id
	private String userId;
	@Transient
	private String name;
	@Transient
	private Date creationDate = new Date();
	@Transient
	private Map<String, String> userSettings = new HashMap<>();
	
	public User(){}
//	--getter/
//	setter methods
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Map<String, String> getUserSettings() {
		return userSettings;
	}
	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
	}
}