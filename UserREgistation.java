package com.samlab.practiceapp;

import java.time.LocalDate;
import java.util.Date;

public class UserREgistation {
private String Password;
private String UName;
private int Id=0;
public LocalDate CurrentDate() {
	 LocalDate MyDate = LocalDate.now(); // Create a date object
	  return MyDate;
}
public int AutoId() {
	
	Id++;
	return Id;
	}

public void setUName(String uName) {
	
	UName = uName;
	}


public String getUName() {

	return UName;
}


public void setPassword(String password) {
	Password = password;
}


public String getPassword() {
	return Password;
}





@Override
public String toString() {
	return "UserREgistation [UName=" + UName + ", Password=" + Password + "]";
}

}
