package com.learning;

class ManipulationOnFinalClass {
	public static final String name;
	static {
		name="Rahul";
	}
	
	public static void main(String[] args) {
		//name="Sharma";Compile time error
	}

}
