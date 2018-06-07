package com.css.test;
/**
 * 
 * @author Administrator
 * 银行类别实体类
 */
public class TestBanktype {
private int typeId;
private String bankName;
private float proportion;
private String preDescription;
private String showImg;
@Override
public String toString() {
	return "TestBanktype [typeId=" + typeId + ", bankName=" + bankName + ", proportion=" + proportion
			+ ", preDescription=" + preDescription + ", showImg=" + showImg + "]";
}
public TestBanktype() {
	super();
	// TODO Auto-generated constructor stub
}
public TestBanktype(int typeId, String bankName, float proportion, String preDescription, String showImg) {
	super();
	this.typeId = typeId;
	this.bankName = bankName;
	this.proportion = proportion;
	this.preDescription = preDescription;
	this.showImg = showImg;
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
