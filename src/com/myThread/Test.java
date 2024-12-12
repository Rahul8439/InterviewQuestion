package com.myThread;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
	private int a=10;
	
	public static void main(String[] args) {
		
		
		List<String> list=new ArrayList<>();
		list.add("dev");
		list.add("test");
		
		Employee e=new Employee("Rahul",list);
		List<String> dept = e.getDept();
		e.getDept().add("prod");
		list.add("UAT");
		System.out.println(dept);
		
		
		
	}
	

	void display(){
		int x=10;
		Predicate<String> p=(str)->{
			int y=100;
			if(str.length()>1) {
				System.out.println(x);
				System.out.println(y);
				System.out.println(this.a);
				return true;
			}return false;
		};
	}
}

final class Employee{
	private final String name;
	private final List<String> dept;
	
	public List<String> getDept(){
		List<String> list =new ArrayList();
		for(String str:dept) {
			list.add(str);
		}
		return list;
	}
	
	public Employee(String name,List<String> dept){
		this.name=name;
		List<String> list =new ArrayList();
		for(String str:dept) {
			list.add(str);
		}
		this.dept=list;
	}
	
}
