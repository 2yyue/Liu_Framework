package com.liu.fatey.servlet_jsp.Entity.stu;

public class User {
	private int id;
	private String username;
	private String pwd;
	private int type;
	private String createtime;
	private String comment;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ",username=" + username +",pwd=" + pwd + ",type=" + type + ",createtime=" + createtime + ",comment=" + comment + "]";
	}
}
