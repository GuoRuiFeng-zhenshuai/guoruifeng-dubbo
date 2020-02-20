package com.guoruifeng.entity;

public class Tocp {
private String tiaojian;

private String s1;


private String s2;

public Tocp(String tiaojian, String s1, String s2) {
	super();
	this.tiaojian = tiaojian;
	this.s1 = s1;
	this.s2 = s2;
}

public String getS1() {
	return s1;
}

public void setS1(String s1) {
	this.s1 = s1;
}

public String getS2() {
	return s2;
}

public void setS2(String s2) {
	this.s2 = s2;
}

public String getTiaojian() {
	return tiaojian;
}

public void setTiaojian(String tiaojian) {
	this.tiaojian = tiaojian;
}

public Tocp(String tiaojian) {
	super();
	this.tiaojian = tiaojian;
}

public Tocp() {
	super();
}

}
