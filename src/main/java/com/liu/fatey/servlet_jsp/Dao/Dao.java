package com.liu.fatey.servlet_jsp.Dao;

public interface Dao<T> {
	//crud
	public void add(T t);
	public void update(T t);
	public void delete(T t);
	public T queryOne(int id);
}
