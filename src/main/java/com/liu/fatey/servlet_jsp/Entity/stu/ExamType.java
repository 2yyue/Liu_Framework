package com.liu.fatey.servlet_jsp.Entity.stu;

public class ExamType {
	private int eId;
	private String examName;
	private String examComm;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamComm() {
		return examComm;
	}

	public void setExamComm(String examComm) {
		this.examComm = examComm;
	}

	@Override
	public String toString() {
		return "ExamType [eId=" + eId + ",examName=" + examName + ",examComm=" + examComm + "]";
	}
}
