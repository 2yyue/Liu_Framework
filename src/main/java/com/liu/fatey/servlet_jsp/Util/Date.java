package com.liu.fatey.servlet_jsp.Util;

import java.text.SimpleDateFormat;

public class Date {
	public static final String DATETIME_DEFAULT_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static SimpleDateFormat getDateFormat(String format) {
		return new SimpleDateFormat(format);
	}

	public static String formatDateTime(Date date,String format) {
		return getDateFormat(format).format(date);
	}

	public static String getNowDate() {
		return formatDateTime(new Date(),DATETIME_DEFAULT_FORMAT);
	}
}
