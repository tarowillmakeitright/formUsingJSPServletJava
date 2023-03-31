package models;

import java.io.Serializable;

public class User implements Serializable {
	private String name;
	private String gender;
	private String errorMsg;

	public User() {
	}

	public User(String name, String gender, String errorMsg) {
		this.name = name;
		this.gender = gender;
		this.errorMsg = errorMsg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
