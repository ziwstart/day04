package com.atguigu.java;

public class TestArray {
	public static void main(String[] args) {
		
		
		//���ڻ��ڻ����������͵ı������������飺byte short int long float double char boolean
		//1.����byte short int long ���ԣ����������Ժ�Ĭ��ֵΪ0
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
		
		//2.����float  double���ԣ�Ĭ��ֵ��0.0
		float[] f = new float[3];
		f[0] = 1.2F;
		for(int i = 0;i < f.length;i++){
			System.out.println(f[i]);
		}
		System.out.println();
		//3.����char���ԣ�Ĭ��Ϊ�ո�
		char[] c = new char[3];
		for(int i = 0;i < c.length;i++){
			System.out.println(c[i]);
		}
		System.out.println();
		//4.����boolean���ԣ�Ĭ��Ϊfalse
		boolean[] b = new boolean[3];
		for(int i = 0;i < b.length;i++){
			System.out.println(b[i]);
		}
		//5.�����������͵ı������ɵ�������ԣ�Ĭ�ϳ�ʼ��ֵΪnull����StringΪ��
		String[] strs = new String[4];
		strs[0] = "AA";
		strs[1] = "BB";
		//strs[2] = "CC";
		strs[3] = "DD";
		//���������Ԫ��
		for(int i = 0;i < strs.length;i++){
			System.out.println(strs[i]);
		}
		System.out.println();
		//����
		Person[] pers = new Person[3];
		for(int i = 0;i < pers.length;i++){
			System.out.println(pers[i]);
		}
		//�����������ڴ��еĽṹ(��ppt)
		
		int[] myInt = {12,13,14};
		
		int[] myInt1;
		myInt1 = new int[]{12,1,3,14};
	}
}

class Person{
	
}
