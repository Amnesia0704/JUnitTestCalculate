package com.test.calculate;

import java.math.BigDecimal;

public class Calculate {
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}

	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	public static double div(double v1, double v2) {
		 if(v2 == 0){  
		   System.out.println("被除数不能为0");  
		     return 0.00;  
		    }  
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, 10, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	 public static void main(String[] args) {
         System.out.println("加法运算：" +
                Calculate.add(10,3.333));
         System.out.println("乘法运算：" +
               Calculate.mul(10.345,0));
         System.out.println("除法运算：" +
        		 Calculate.div(10.345, 0));
         System.out.println("减法运算：" +
        		 Calculate.sub(10.345,3.333));
     }


}
