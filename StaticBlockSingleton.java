package com.creational;
/**
 * Static block initialization implementation is similar to eager initialization, 
 * except that instance of the class is created in the static block that provides the option for exception handling.
 * Both eager initialization and static block initialization create the instance even before it’s being used and that is not the best practice to use.
 * 
 */
public class StaticBlockSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getInstance();
	}
	private StaticBlockSingleton() {}

	private static StaticBlockSingleton instance;
	
	
		static {
			try {
				instance =new StaticBlockSingleton();
	}catch(Exception e) {
		
	}
}
		public static StaticBlockSingleton getInstance() {
			
			System.out.println("welcome to StaticBlockSingleton");
			return instance;
		}
}
