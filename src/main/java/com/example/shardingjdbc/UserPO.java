package com.example.shardingjdbc;

import java.util.Date;

public class UserPO {
	private Long userId;
	private String idNumber;
	private String name;
	private Integer age;
	private Integer gender;
	private Date birthDate;
	
	public UserPO(String idNumber, String name, Integer age, Integer gender, Date birthDate) {
		this.idNumber = idNumber;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
	}
	
	public UserPO(Long userId, String idNumber, String name, Integer age, Integer gender, Date birthDate) {
		this(idNumber, name, age, gender, birthDate);
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
