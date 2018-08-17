package com.nareen.executortest;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallable implements Callable<String>{

	public String call() throws Exception {
		TimeUnit.MILLISECONDS.sleep((long) (Math.random()*1000));
		return Thread.currentThread().getName();
	}
	

}
