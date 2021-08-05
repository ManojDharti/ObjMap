package com.emp.project.m1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	public static ObjectMapper map;
	static {
		map = new ObjectMapper();
	}

	public static String convertObjectToJson(Object ob) {
		String val="";
		try {
			val= map.writeValueAsString(ob);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val;
	}
	public static <T>T convertToObect(String json,Class<T> cls) {
		T val2=null;
		try {
			val2= map.readValue(json,cls);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return val2;
	}
}
