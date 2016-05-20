package com.wangzhp.model;

import java.util.Date;

public class user {
    private String userId;

    private String userName;

    private Date userBirthday;

    private Double userSalary;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public user(String userId, String userName, Date userBirthday, Double userSalary) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userBirthday = userBirthday;
		this.userSalary = userSalary;
	}

	public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    @Override
	public String toString() {
		return "user [userId=" + userId + ", userName=" + userName + ", userBirthday=" + userBirthday + ", userSalary="
				+ userSalary + "]";
	}

	public Double getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(Double userSalary) {
        this.userSalary = userSalary;
    }
}