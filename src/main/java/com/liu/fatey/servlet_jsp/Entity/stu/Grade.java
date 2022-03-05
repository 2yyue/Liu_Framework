package com.liu.fatey.servlet_jsp.Entity.stu;

public class Grade {
	private int graId;
	private String graName;
	private String graComm;

	public int getGraId() {
		return graId;
	}

	public void setGraId(int graId) {
		this.graId = graId;
	}

	public String getGraName() {
		return graName;
	}

	public void setGraName(String graName) {
		this.graName = graName;
	}

	public String getGraComm() {
		return graComm;
	}

	public void setGraComm(String graComm) {
		this.graComm = graComm;
	}

	@Override
	public String toString() {
		return "Grade [graId=" + graId + ",graName=" + graName + ",graComm=" + graComm + "]";
	}
}
