package com.liu.fatey.servlet_jsp.Entity.stu;

public class Student {
	private int stuId;
	private String stuName;
	private int stuSex;
	private int stuAge;
	private String stuComm;
	private int stuGraId;

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuSex() {
		return stuSex;
	}

	public void setStuSex(int stuSex) {
		this.stuSex = stuSex;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public void setStuComm(String stuComm) {
		this.stuComm = stuComm;
	}

	public String getStuComm() {
		return stuComm;
	}

	public int getStuGraId() {
		return stuGraId;
	}

	public void setStuGraId(int stuGraId) {
		this.stuGraId = stuGraId;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ",stuName=" + stuName + ",stuSex=" + stuSex + ",stuAge=" + stuAge + ",stuComm=" + stuComm + ",stuGraId=" + stuGraId + "]";
	}
}
