package com.nareen.executortest;

import java.util.concurrent.TimeUnit;

public class Ford implements Runnable{
	private String name;

	public Ford(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {
			System.out.println(this.name+" :is Running");
			try {
				TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		
	}


}
