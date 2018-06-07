package com.css.entity;

public class Fuelcard {
	private int fuelcardId;
	private int fuelcardNumber;
	private String fuelcardPwd;
	private String fuelcardType;
	private float fuelcardBalance;
	private int userId;
	private int integral;	
	public Fuelcard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fuelcard(int fuelcardId, int fuelcardNumber, String fuelcardPwd, String fuelcardType, float fuelcardBalance,
			int userId, int integral) {
		super();
		this.fuelcardId = fuelcardId;
		this.fuelcardNumber = fuelcardNumber;
		this.fuelcardPwd = fuelcardPwd;
		this.fuelcardType = fuelcardType;
		this.fuelcardBalance = fuelcardBalance;
		this.userId = userId;
		this.integral = integral;
	}
	@Override
	public String toString() {
		return "Fuelcard [fuelcardId=" + fuelcardId + ", fuelcardNumber=" + fuelcardNumber + ", fuelcardPwd="
				+ fuelcardPwd + ", fuelcardType=" + fuelcardType + ", fuelcardBalance=" + fuelcardBalance + ", userId="
				+ userId + ", integral=" + integral + "]";
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public int getFuelcardId() {
		return fuelcardId;
	}
	public void setFuelcardId(int fuelcardId) {
		this.fuelcardId = fuelcardId;
	}
	public int getFuelcardNumber() {
		return fuelcardNumber;
	}
	public void setFuelcardNumber(int fuelcardNumber) {
		this.fuelcardNumber = fuelcardNumber;
	}
	public String getFuelcardPwd() {
		return fuelcardPwd;
	}
	public void setFuelcardPwd(String fuelcardPwd) {
		this.fuelcardPwd = fuelcardPwd;
	}
	public String getFuelcardType() {
		return fuelcardType;
	}
	public void setFuelcardType(String fuelcardType) {
		this.fuelcardType = fuelcardType;
	}
	public float getFuelcardBalance() {
		return fuelcardBalance;
	}
	public void setFuelcardBalance(float fuelcardBalance) {
		this.fuelcardBalance = fuelcardBalance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	}

