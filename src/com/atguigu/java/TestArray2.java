package com.atguigu.java;

public class TestArray2 {
	public static void main(String[] args) {
		int[] scores1 = new int[10];
		int[][] scores2;
		String[][] names;
		//1.二维数组的初始化
		scores2 = new int[][]{{1,2,3},{3,4,5},{6}};//静态初始化
		
		names = new String[6][5];//动态初始化的方式一
		names = new String[6][];//动态初始化的方式二
		names[0] = new String[5];
		names[1] = new String[4];
		names[2] = new String[7];
		names[3] = new String[5];
		names[4] = new String[8];
		names[5] = new String[5];
		
		//错误的初始化方式
		//names = new String[][];
		//names = new String[][5];
		
		//2.如何来引用具体的某一个元素
		int[][] i = new int[3][2];//int[] i[] = new int[3][2];
		i[1][0] = 90;
		i[2][1] = 100;
		//3.数组的长度
		//二维数组的长度：length属性
		System.out.println(i.length);//3
		//二维数组中元素的长度
		System.out.println(i[0].length);//2
		System.out.println(names.length);//6
		System.out.println(names[4].length);//8
		System.out.println();
		//4.如何遍历二维数组
		for(int m = 0;m < scores2.length;m++){//控制行数
			for(int n = 0;n < scores2[m].length;n++){
				System.out.print(scores2[m][n] + "  ");
			}
			System.out.println();
		}
		//5.内存结构
		
		int[] x,y[];
		//int[] x;//一维
		//int[] y[];//二维
		y = new int[3][2];
		x = y[0];
		x[0] = y[1][2];
	}
}
