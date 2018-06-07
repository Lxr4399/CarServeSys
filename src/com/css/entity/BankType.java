package com.css.entity;
/**
 * 银行类别的实体类
 * @author Administrator
 *
 */
public class BankType {
private int typeId;
private String bankName;
private float proportion;
private String preDescription;
private String showImg;
public BankType(int typeId, String bankName, float proportion, String preDescription, String showImg) {
	super();
	this.typeId = typeId;
	this.bankName = bankName;
	this.proportion = proportion;
	this.preDescription = preDescription;
	this.showImg = showImg;
}
public BankType() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "bankType [typeId=" + typeId + ", bankName=" + bankName + ", proportion=" + proportion + ", preDescription="
			+ preDescription + ", showImg=" + showImg + "]";
}
public int getTypeId() {
	return typeId;
}
public void setTypeId(int typeId) {
	this.typeId = typeId;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public float getProportion() {
	return proportion;
}
public void setProportion(float proportion) {
	this.proportion = proportion;
}
public String getPreDescription() {
	return preDescription;
}
public void setPreDescription(String preDescription) {
	this.preDescription = preDescription;
}
public String getShowImg() {
	return showImg;
}
public void setShowImg(String showImg) {
	this.showImg = showImg;
}

}
