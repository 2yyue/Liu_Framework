package com.liu.fatey.servlet_jsp.Dao.Impl;

import org.apache.ibatis.jdbc.SQL;

import javax.jws.Oneway;
import javax.swing.plaf.PanelUI;
import java.sql.*;

public abstract class BaseDao {
	private final String username = "root";
	private final String userpwd = "163216";
	private final String url = "jdbc:mysql://localhost:3306/liu_servlet?serverTimezone=GMT&characterEncoding=utf8$useUnicode=true";
	private final String driver = "com.mysql.cj.jdbc.Driver";

	//获取数据库连接
	public Connection getCon() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection connection = DriverManager.getConnection(url,username,userpwd);
		return connection;
	}

	//创建数据处理执行器
	public PreparedStatement createPS(Connection connection,String sql) throws SQLException {
		return connection.prepareStatement(sql);
	}

	//获取查询结果集合
	public ResultSet getResult(String sql,Object...params) {
		ResultSet resultSet = null;
		Connection connection;
		try {
			connection = getCon();
			PreparedStatement preparedStatement = createPS(connection,sql);

			for (int i = 0;i < params.length;i++) {
				preparedStatement.setObject((i+1),params[i]);
			}
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	//关闭连接
	public void close(Connection connection,Statement statement) throws SQLException {
		if(statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}

	//关闭数据库操作中打开的连接
	public void close(Connection connection,Statement statement,ResultSet resultSet) throws SQLException {
		if(resultSet != null) {
			resultSet.close();
		}
		if(statement != null) {
			statement.close();
		}
		if(connection != null) {
			connection.close();
		}
	}

	//数据更新
	public void executeUpdate(String sql,Object...params) {
		Connection connection;
		try {
			connection = getCon();
			PreparedStatement preparedStatement = createPS(connection,sql);

			for(int i = 0;i <params.length;i++) {
				preparedStatement.setObject((i+1),params[i]);
			}
			preparedStatement.executeUpdate();
			close(connection,preparedStatement);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	//添加数据
	public void add(String sql,Object...params) {
		executeUpdate(sql,params);
	}

	//修改数据
	public void update(String sql,Object...params) {
		executeUpdate(sql,params);
	}

	//删除数据
	public void delete(String sql,Object...params) {
		executeUpdate(sql,params);
	}

	//获取数据总量
	public int queryCount(String sql, Object...params) {
		int count = 0;
		ResultSet resultSet = getResult(sql,params);
		try {
			while (resultSet.next()) {
				count = resultSet.getInt("count(*)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}


}
