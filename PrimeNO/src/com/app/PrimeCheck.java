package com.app;

public class PrimeCheck {
	public PrimeCheck(){}
public static void main(String[] args) {
	int num=13;
	int count=0;
	for(int i=2;i<num;i++){
		if(num%i==0){
			count++;
			break; 
		}
	}
	if(count==0){
		System.out.println("This is prime number");
	}else{
		System.out.println("This is not prime number");
		System.out.println("ram aam khata hai");
	
	}
}
}
