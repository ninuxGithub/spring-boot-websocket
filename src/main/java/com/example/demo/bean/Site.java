package com.example.demo.bean;

import java.io.Serializable;

public class Site implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3982726714230559229L;
	private String name;
	private String url;
	private String country;

	public Site(String name, String url, String country) {
		this.name = name;
		this.url = url;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
