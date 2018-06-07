package com.css.entity;

public class Bank {
private int bankId;
private int bankNumber;
private String bankPwd;
private int userId;
private String cardType;
private float balance;


public Bank() {
	super();
	// TODO Auto-generated constructor stub
}
public Bank(int bankId, int bankNumber, String bankPwd, int userId, String cardType, float balance) {
	super();
	this.bankId = bankId;
	this.bankNumber = bankNumber;
	this.bankPwd = bankPwd;
	this.userId = userId;
	this.cardType = cardType;
	this.balance = balance;
}
@Override
public String toString() {
	return "Bank [bankId=" + bankId + ", bankNumber=" + bankNumber + ", bankPwd=" + bankPwd + ", userId=" + userId
			+ ", cardType=" + cardType + ", balance=" + balance + "]";
}
public int getBankId() {
	return bankId;
}
public void setBankId(int bankId) {
	this.bankId = bankId;
}
public int getBankNumber() {
	return bankNumber;
}
public void setBankNumber(int bankNumber) {
	this.bankNumber = bankNumber;
}
public String getBankPwd() {
	return bankPwd;
}
public void setBankPwd(String bankPwd) {
	this.bankPwd = bankPwd;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getCarType() {
	return cardType;
}
public void setCarType(String cardType) {
	this.cardType = cardType;
}
public float getBalance() {
	return balance;
}
public void setBalance(float balance) {
	this.balance = balance;
}

}
