package com.wangzhp.model;

public class Demo1 {
             
	

	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]";
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	private int age;
	
}
