package com.dbms;

public class InvalidPremiumAmountException extends Exception {
String msg;

public InvalidPremiumAmountException(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

}
