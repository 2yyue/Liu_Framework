package com.liu.fatey.servlet_jsp.Entity.stu;

public class Exam {
	private int eId;
	private String eName;
	private String eTime;
	private String eIntro;
	private int epId;
	private int etId;
	private int egId;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteTime() {
		return eTime;
	}

	public void seteTime(String eTime) {
		this.eTime = eTime;
	}

	public String geteIntro() {
		return eIntro;
	}

	public void seteIntro(String eIntro) {
		this.eIntro = eIntro;
	}

	public int getEpId() {
		return epId;
	}

	public void setEpId(int epId) {
		this.epId = epId;
	}

	public int getEtId() {
		return etId;
	}

	public void setEtId(int etId) {
		this.etId = etId;
	}

	public int getEgId() {
		return egId;
	}

	public void setEgId(int egId) {
		this.egId = egId;
	}

	@Override
	public String toString() {
		return "Exam [eId= "+ eId + ",eName=" + eName + ",eTime=" + eTime + ",eIntro=" + eIntro + ",epId=" + epId + ",etId=" + etId + ",egId=" + egId +"]";
	}
}
