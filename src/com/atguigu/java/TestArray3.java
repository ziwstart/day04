package com.atguigu.java;

import java.util.Arrays;

/*
 *  1.������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵�

 2.����ĸ��ơ���ת

 3.����Ԫ�ص�����

 */
public class TestArray3 {

	public static void main(String[] args) {
		int[] arr = new int[] { 12, 43, 9, 0, -65, -99, 100, 9 };

		// ���ֵ
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("��������ֵΪ��" + max);

		// ��Сֵ
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�������СֵΪ��" + min);

		// �ܺ�
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("�ܺ�Ϊ��" + sum);

		// ƽ����
		int avg = 0;
		avg = sum / arr.length;
		System.out.println("ƽ��ֵΪ��" + avg);

		// ����ĸ���
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		// ����Ԫ�صķ�ת
		// for(int i = 0;i < arr.length/2;i++){
		// int temp = arr[i];
		// arr[i] = arr[arr.length-1 - i];
		// arr[arr.length - 1 - i] = temp;
		// }
		for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
		}
		System.out.println("��ת�Ժ�");
		// ����
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
//		// ʹ��ð������ʹ����Ԫ�ش�С��������
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//		//ʹ��ֱ��ѡ������ʹ����Ԫ�ش�С��������
//		for(int i = 0; i < arr.length - 1; i++){
//			int t = i;//Ĭ��i������С��
//			for(int j = i;j < arr.length;j++){
//				//һ����i���ִ��ڱ���С��Ԫ�أ��ͼ�¼�Ǹ�Ԫ�ص��½Ǳ�
//				if(arr[t] > arr[j]){
//					t = j;
//				}
//			}
//			if(t != i){
//				int temp = arr[t];
//				arr[t] = arr[i];
//				arr[i] = temp;
//			}
//		}
		Arrays.sort(arr);
		
		System.out.println("�����Ժ�");
		// ����
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
}
