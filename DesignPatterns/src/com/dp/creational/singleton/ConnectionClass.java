package com.dp.creational.singleton;

public class ConnectionClass {
	private static ConnectionClass instance;
	
	public static ConnectionClass getConnection(){
		synchronized (ConnectionClass.class) {
			if(instance==null){
				instance=new ConnectionClass();
				System.out.println("New ConnectionClass instance created");
			}
			return instance;
		}
	}
}
