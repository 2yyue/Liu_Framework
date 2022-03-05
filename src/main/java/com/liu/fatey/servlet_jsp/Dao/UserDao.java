package com.liu.fatey.servlet_jsp.Dao;

import com.liu.fatey.servlet_jsp.Entity.stu.User;
import com.liu.fatey.servlet_jsp.Util.Page;

public interface UserDao extends Dao<User> {
	public User queryUserByName(String userName);

	public Page queryPageUser(int pageIndex, int pageSize);

	public Page queryPageUser(int pageIndex, int pageSize,String userName);
}
