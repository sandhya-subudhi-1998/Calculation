package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Calculation2ApplicationTests {

	 @Test
	    public void mySimpleEqualsTestAdd(){
	        assertEquals(30, Calculation2Application.add(10,20));
	    }
	 @Test
	    public void mySimpleEqualsTestSub(){
	        assertEquals(5, Calculation2Application.sub(10,5));
	    }
	 @Test
	    public void mySimpleEqualsTestMul(){
	        assertEquals(200, Calculation2Application.mul(10,20));
	    }
	 @Test
	    public void mySimpleEqualsTestDiv(){
	        assertEquals(2, Calculation2Application.div(10,5));
	    }
}
