package com.atguigu.java;

public class TestArray {
	public static void main(String[] args) {
		
		
		//对于基于基本数据类型的变量创建的数组：byte short int long float double char boolean
		//1.对于byte short int long 而言：创建数组以后，默认值为0
		int[] scores = new int[4];
		
		scores[0] = 89;
		scores[3] = 90;
		for(int i = 0;i < scores.length;i++){
			System.out.println(scores[i]);
		}
		
		byte[] scores1 = new byte[4];
		scores1[0] = 89;
		scores1[3] = 90;
		for(int i = 0;i < scores1.length;i++){
			System.out.println(scores1[i]);
		}
		
		//2.对于float  double而言：默认值是0.0
		float[] f = new float[3];
		f[0] = 1.2F;
		for(int i = 0;i < f.length;i++){
			System.out.println(f[i]);
		}
		System.out.println();
		//3.对于char而言：默认为空格
		char[] c = new char[3];
		for(int i = 0;i < c.length;i++){
			System.out.println(c[i]);
		}
		System.out.println();
		//4.对于boolean而言：默认为false
		boolean[] b = new boolean[3];
		for(int i = 0;i < b.length;i++){
			System.out.println(b[i]);
		}
		//5.对于引用类型的变量构成的数组而言：默认初始化值为null。以String为例
		String[] strs = new String[4];
		strs[0] = "AA";
		strs[1] = "BB";
		//strs[2] = "CC";
		strs[3] = "DD";
		//遍历数组的元素
		for(int i = 0;i < strs.length;i++){
			System.out.println(strs[i]);
		}
		System.out.println();
		//另例
		Person[] pers = new Person[3];
		for(int i = 0;i < pers.length;i++){
			System.out.println(pers[i]);
		}
		//关于数组在内存中的结构(看ppt)
		
		int[] myInt = {12,13,14};
		
		int[] myInt1;
		myInt1 = new int[]{12,1,3,14};
	}
}

class Person{
	
}
