package com.capgemini.java8.lambdaExpression;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		
		/*Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				
				for(int i = 0 ; i < 3 ;i++){
					System.out.println(
							"Hello World form Thread (" +Thread.currentThread().getName() +")"	
							
							);
				}
				
			}
		};*/
		
//LambdaExpression starts here
		Runnable runnablelambda = () -> {
				for(int i = 0 ; i < 3 ;i++){
					System.out.println(
							"Hello World form Thread (" +Thread.currentThread().getName() + ")");
							
				}
		};
		
		Thread t = new Thread(runnablelambda);
		t.start();
		t.join();
			}
		};		


