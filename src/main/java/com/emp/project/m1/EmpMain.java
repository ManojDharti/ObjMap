package com.emp.project.m1;

public class EmpMain {

	public static void main(String[] args) {

		Employee e=new Employee();
		e.setEid(120);
		e.setEname("Rama");
		e.setEsal(20000);
		System.out.println(JsonUtil.convertObjectToJson(e));
		
		String temp="{\"eid\":1020,\"ename\":\"Rama\",\"esal\":20000}";
		System.out.println(JsonUtil.convertToObect(temp,Employee.class));
		
	}

}
