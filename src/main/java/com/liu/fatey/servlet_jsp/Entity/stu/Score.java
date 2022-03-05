package com.liu.fatey.servlet_jsp.Entity.stu;

public class Score {
	private int eId;
	private int sId;
	private Double score;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Score [eId=" + eId + ",sId=" + sId + ",score=" + score + "]";
	}
}
