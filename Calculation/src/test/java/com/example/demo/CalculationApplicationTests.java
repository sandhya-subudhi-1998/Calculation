package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculationApplicationTests {

	 @Test
	    public void mySimpleEqualsTestAdd(){
	        assertEquals(30, CalculationApplication.add(10,20));
	    }
	 @Test
	    public void mySimpleEqualsTestSub(){
	        assertEquals(5, CalculationApplication.sub(10,5));
	    }
	 @Test
	    public void mySimpleEqualsTestMul(){
	        assertEquals(200, CalculationApplication.mul(10,20));
	    }
	 @Test
	    public void mySimpleEqualsTestDiv(){
	        assertEquals(2, CalculationApplication.div(10,5));
	    }
}
