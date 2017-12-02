package org.mybatis.example;


import java.io.Serializable;

public class Blog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1904757279091601077L;

	private int id ;
	
	private String username;
	private String password;
	private int age;
	private String sex;
	
	
	
	@Override
	public String toString() {
		return "Blog [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age + ", sex=" + sex
				+ "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
}
