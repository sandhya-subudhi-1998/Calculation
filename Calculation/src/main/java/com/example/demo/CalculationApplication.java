package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;


@SpringBootApplication
public class CalculationApplication {

	static double add(double a,double b) {
		return a+b;
	}
	
	static double sub(double a,double b) {
		return a-b;
	}
	
	static double mul(double a,double b) {
		return a*b;
	}
	
	static double div(double a,double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CalculationApplication.class, args);
		
		Scanner reader = new Scanner(System.in);
	    System.out.print("Enter two numbers: ");

	    double first = reader.nextDouble();
	    double second = reader.nextDouble();

	    System.out.print("Enter an operator (+, -, *, /): ");
	    char operator = reader.next().charAt(0);

	    double result;

	    switch (operator) {
	      case '+':
	    	  result=add(first,second);
	          break;

	      case '-':
	    	  result=sub(first,second);
	        break;

	      case '*':
	    	  result=mul(first,second);
	          break;

	      case '/':
	    	  result=div(first,second);
	          break;

	      default:
	        System.out.printf("Enter a correct operator");
	        return;
	    }

	    System.out.println(first + " " + operator + " " + second + " ==> " + result);
	  }
	}
