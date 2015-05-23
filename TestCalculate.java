package com.test.calculate;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestCalculate {

	@Test
	public void testAdd() {

		Assert.assertEquals(Calculate.add(2,8),10.0);
	}
	
	@Test
	public void testMul() {

		Assert.assertEquals(Calculate.mul(2,2.2),4.4);
	}
	@Test
	public void testdiv() {

		Assert.assertEquals(Calculate.div(10,2.5),4);
//		Assert.assertEquals(Calculate.div(10,0),0);
	}
	@Test
	public void testSub() {

		Assert.assertEquals(Calculate.sub(10,0),10.0);
	}
}
