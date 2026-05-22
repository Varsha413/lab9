package com.example.UnitTestingDemo;

public class AddTwoNumber {
	

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public static void main(String[] args) {

	        AddTwoNumber calc = new AddTwoNumber();

	        int result1 = calc.add(2, 3);
	        int result2 = calc.subtract(2, 3);

	        System.out.println("Addition Result: " + result1);
	        System.out.println("Subtraction Result: " + result2);
	    }
	}

