package com.atguigu.java;

public class TestException {
	public static void main(String[] args) {
		//1.�����±�Խ����쳣:java.lang.ArrayIndexOutOfBoundsException
		int[] i = new int[10];
//		i[0] = 90;
//		i[10] = 99;
		
//		for(int m = 0;m <= i.length;m++){
//			System.out.println(i[m]);
//		}
		//2.��ָ����쳣��NullPointerException
		//��һ�֣�
//		boolean[] b = new boolean[3];
//		b = null;
//		System.out.println(b[0]);
		
		//�ڶ��֣�
//		String[] str = new String[4];
//		//str[3] = new String("AA");//str[3] = "AA";
//		System.out.println(str[3].toString());
		
		//�����֣�
		int[][] j = new int[3][];
		j[2][0] = 12;
	}
}
