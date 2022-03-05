package com.liu.fatey.servlet_jsp.Entity.stu;

public class ExamProject {
	private int epId;
	private String epName;
	private String epComm;

	public int getEpId() {
		return epId;
	}

	public void setEpId(int epId) {
		this.epId = epId;
	}

	public String getEpName() {
		return epName;
	}

	public void setEpName(String epName) {
		this.epName = epName;
	}

	public String getEpComm() {
		return epComm;
	}

	public void setEpComm(String epComm) {
		this.epComm = epComm;
	}

	@Override
	public String toString() {
		return "ExamProject [epid=" + epId + ",epName=" + epName + ",epComm=" + epComm + "]";
	}
}
