package com.learning;

public class Test implements Cloneable{
	private String name="Rahul";
	public Test(String string) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}



	public static void main(String[] args) throws CloneNotSupportedException {
		
		StringBuffer a= new StringBuffer("Rahul");
		System.out.println(a);
		StringBuffer b=a;
		a.append("Rahul");
		
		System.out.println(a);
		System.out.println(b);
		
		
		Test t=new Test("Rahul");
		System.out.println(t);
		Test clone = (Test)t.clone();
		
		t.name="Amit";
		System.out.println(t);
		System.out.println(clone);
		System.out.println(t==clone);
	}
}	
