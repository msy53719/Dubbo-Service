package com.dubbopro.core.api.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String name;
	private String sex;
	private String age;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
