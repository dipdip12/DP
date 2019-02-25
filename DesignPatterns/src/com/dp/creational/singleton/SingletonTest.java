package com.dp.creational.singleton;

public class SingletonTest extends Thread{
	
	@Override
	public void run(){
		ConnectionClass in=ConnectionClass.getConnection();
	}
	public static void main(String args[]) throws InterruptedException{
		Thread t1= new SingletonTest();
		Thread t2= new SingletonTest();
		Thread t3= new SingletonTest();
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
	}
}
