package com.nareen.executortest;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executortest {

	public static void main(String[] args) {
		Executortest e=new Executortest();
		e.executors();
	}
	
	public void runnable() {
	
		Honda H=new Honda("Accord");
		Chevy C=new Chevy("Malibu");
		Ford F=new Ford("Mustang");
		Toyota T=new Toyota("Corolla");
		Thread t=new Thread(H);
		Thread t1=new Thread(C);
		Thread t2=new Thread(F);
		Thread t3=new Thread(T);
		
	}
	public void executors() {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(new Honda("Accord"));
		executor.execute(new Chevy("Camero"));
		executor.execute(new Ford("Mustang"));
		executor.execute(new Toyota("Corolla"));
		executor.execute(new Chevy("Cruize"));
		executor.execute(new Chevy("Malibu"));
		executor.execute(new Toyota("Camry"));
		List<Runnable>waitingList=executor.shutdownNow();
		
		
		
	}
	/*public void callableImplementation() {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		List<Future<String>> list=new ArrayList<Future<String>>();
		
		Callable<String> callable=new MyCallable();
		for(int i=0;i<50;i++) {
			Future<String>
		}
		
	}*/
}
 