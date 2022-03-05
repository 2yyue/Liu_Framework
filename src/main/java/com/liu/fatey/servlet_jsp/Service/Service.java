package com.liu.fatey.servlet_jsp.Service;

public interface Service<T> {
	public void add(T t);
	public void update(T t);
	public void delete(T t);
	public T getOne(int id);
}
