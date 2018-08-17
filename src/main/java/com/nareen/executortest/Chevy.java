package com.nareen.executortest;

import java.util.concurrent.TimeUnit;

public class Chevy implements Runnable {
	private String name;

	public Chevy(String name) {
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
			
	}

}
}