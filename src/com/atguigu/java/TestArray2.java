package com.atguigu.java;

public class TestArray2 {
	public static void main(String[] args) {
		int[] scores1 = new int[10];
		int[][] scores2;
		String[][] names;
		//1.��ά����ĳ�ʼ��
		scores2 = new int[][]{{1,2,3},{3,4,5},{6}};//��̬��ʼ��
		
		names = new String[6][5];//��̬��ʼ���ķ�ʽһ
		names = new String[6][];//��̬��ʼ���ķ�ʽ��
		names[0] = new String[5];
		names[1] = new String[4];
		names[2] = new String[7];
		names[3] = new String[5];
		names[4] = new String[8];
		names[5] = new String[5];
		
		//����ĳ�ʼ����ʽ
		//names = new String[][];
		//names = new String[][5];
		
		//2.��������þ����ĳһ��Ԫ��
		int[][] i = new int[3][2];//int[] i[] = new int[3][2];
		i[1][0] = 90;
		i[2][1] = 100;
		//3.����ĳ���
		//��ά����ĳ��ȣ�length����
		System.out.println(i.length);//3
		//��ά������Ԫ�صĳ���
		System.out.println(i[0].length);//2
		System.out.println(names.length);//6
		System.out.println(names[4].length);//8
		System.out.println();
		//4.��α�����ά����
		for(int m = 0;m < scores2.length;m++){//��������
			for(int n = 0;n < scores2[m].length;n++){
				System.out.print(scores2[m][n] + "  ");
			}
			System.out.println();
		}
		//5.�ڴ�ṹ
		
		int[] x,y[];
		//int[] x;//һά
		//int[] y[];//��ά
		y = new int[3][2];
		x = y[0];
		x[0] = y[1][2];
	}
}
