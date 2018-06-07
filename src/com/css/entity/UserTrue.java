package com.css.entity;

public class UserTrue {
private int utrueId;
private int userId;
private String userCardId;
private String userTrueName;
private String userSex;
private String userAddress;
private String userPhone;
private int bankId;


@Override
public String toString() {
	return "UserTrue [utrueId=" + utrueId + ", userId=" + userId + ", userCardId=" + userCardId + ", userTrueName="
			+ userTrueName + ", userSex=" + userSex + ", userAddress=" + userAddress + ", userPhone=" + userPhone
			+ ", bankId=" + bankId + "]";
}

public UserTrue() {
	super();
	// TODO Auto-generated constructor stub
}

public UserTrue(String userCardId, String userTrueName, String userSex, String userAddress, 
		String userPhone,int userId) {
	super();
	this.userId = userId;
	this.userCardId = userCardId;
	this.userTrueName = userTrueName;
	this.userSex = userSex;
	this.userAddress = userAddress;
	this.userPhone = userPhone;
}
public UserTrue(int utrueId, int userId, String userCardId, String userTrueName, String userSex, String userAddress,
		String userPhone) {
	super();
	this.utrueId = utrueId;
	this.userId = userId;
	this.userCardId = userCardId;
	this.userTrueName = userTrueName;
	this.userSex = userSex;
	this.userAddress = userAddress;
	this.userPhone = userPhone;
}

public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public int getUtrueId() {
	return utrueId;
}
public void setUtrueId(int utrueId) {
	this.utrueId = utrueId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserCardId() {
	return userCardId;
}
public void setUserCardId(String userCardId) {
	this.userCardId = userCardId;
}
public String getUserTrueName() {
	return userTrueName;
}
public void setUserTrueName(String userTrueName) {
	this.userTrueName = userTrueName;
}
public String getUserSex() {
	return userSex;
}
public void setUserSex(String userSex) {
	this.userSex = userSex;
}
public String getUserAddress() {
	return userAddress;
}
public void setUserAddress(String userAddress) {
	this.userAddress = userAddress;
}
public String getUserPhone() {
	return userPhone;
}
public void setUserPhone(String userPhone) {
	this.userPhone = userPhone;
}

}
