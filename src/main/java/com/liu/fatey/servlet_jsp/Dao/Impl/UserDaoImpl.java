package com.liu.fatey.servlet_jsp.Dao.Impl;

import com.liu.fatey.servlet_jsp.Dao.UserDao;
import com.liu.fatey.servlet_jsp.Entity.stu.User;
import com.liu.fatey.servlet_jsp.Util.Page;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User queryUserByName(String userName) {
		String sql = "select stu_id, stu_username, stu_pwd, stu_type, stu_createtime, stu_comment from stu_user where stu_username = ?";
		ResultSet resultSet = getResult(sql,userName);
		User user = null;
		try {
			while(resultSet.next()) {
				user = new User();
				user.setUsername(resultSet.getString("stu_username"));
				user.setPwd(resultSet.getString("stu_pwd"));
				user.setType(resultSet.getInt("stu_type"));
				user.setCreatetime(resultSet.getString("stu_createtime"));
				user.setComment(resultSet.getString("stu_comment"));
				user.setUsername(resultSet.getString("stu_username"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public Page queryPageUser(int pageIndex, int pageSize) {
		Page page = new Page();
		String sql = "select stu_id, stu_username, stu_pwd, stu_type, stu_createtime, stu_comment from stu_user limit ?, ?";
		ResultSet resultSet = getResult(sql,(pageIndex - 1)*pageSize,pageSize);
		List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();

		try {
			while (resultSet.next()) {
				Map<String,Object> map = new HashMap<String, Object>();
				map.put("stu_id", resultSet.getInt("stu_id"));
				map.put("stu_username", resultSet.getString("stu_username"));
				map.put("stu_pwd", resultSet.getString("stu_pwd"));
				map.put("stu_type", resultSet.getInt("stu_type"));
				map.put("stu_createtime", resultSet.getString("stu_createtime"));
				map.put("stu_comment", resultSet.getString("stu_comment"));

				list.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String countSql = "select count(*) from stu_user";
		int count = queryCount(countSql);
		int pageTotal = count % pageSize == 0 ? (count / pageSize) : (count / pageSize + 1);
		page.setCount(count);
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		page.setPageTotal(pageTotal);
		page.setData(list);

		return page;
	}

	@Override
	public Page queryPageUser(int pageIndex, int pageSize, String userName) {
		return null;
	}

	@Override
	public void add(User user) {
		String sql = "insert into stu_user (stu_username,stu_pwd,stu_type,stu_createtime,stu_comment) values (?,?,?,?,?)";
		add(sql,user.getUsername(),user.getPwd(),user.getType(),user.getCreatetime(),user.getComment());
	}

	@Override
	public void update(User user) {
		String sql = "update stu_user set stu_username = ?, stu_pwd = ?, stu_type = ?, stu_createtime = ?, stu_comment = ? where stu_id = ?";
		update(sql,user.getUsername(),user.getPwd(),user.getType(),user.getCreatetime(),user.getComment(),user.getId());
	}

	@Override
	public void delete(User user) {
		String sql = "delete from stu_user where stu_id = ?";
		delete(sql,user.getId());
	}

	@Override
	public User queryOne(int id) {
		String sql = "select stu_id, stu_username, stu_pwd, stu_type, stu_createtime, stu_comment from stu_user where stu_id = ?";
		ResultSet resultSet = getResult(sql,id);
		User user = null;
		try {
			while(resultSet.next()) {
				user = new User();
				user.setUsername(resultSet.getString("stu_username"));
				user.setPwd(resultSet.getString("stu_pwd"));
				user.setType(resultSet.getInt("stu_type"));
				user.setCreatetime(resultSet.getString("stu_createtime"));
				user.setComment(resultSet.getString("stu_comment"));
				user.setId(resultSet.getInt("stu_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
}
