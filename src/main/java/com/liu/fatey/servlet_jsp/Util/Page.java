package com.liu.fatey.servlet_jsp.Util;

import java.util.List;
import java.util.Map;

public class Page {
	private int pageIndex;
	private int pageSize;
	private int pageTotal;
	private int count;
	private List<Map<String, Object>> data;

	public int getPageIndex() {
		return pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public int getPageTotal() {
		return pageTotal;
	}

	public int getCount() {
		return count;
	}

	public List<Map<String, Object>> getData() {
		return data;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public void setPageTotal(int pageTotal) {
		this.pageTotal = pageTotal;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setData(List<Map<String, Object>> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Page [pageIndex=" + pageIndex + ",pageSize=" + pageSize + ",pageTotal=" + pageTotal + ",Count=" + count + ",data=" + data + "]";
	}
}
