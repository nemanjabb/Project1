package main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.elasticsearch.annotations.Document;

@Document (indexName="document")
public class DocumentM {
	@Transient
	private String title;
	@Id
	private Integer name;
	
	public DocumentM(){}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}
}
