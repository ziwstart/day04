package com.atguigu.exer;

/*
 * (1)����һ����ΪTestArray���࣬��main()����������array1��array2����������
 * ������int[]���͵����顣
 (2)ʹ�ô�����{}����array1��ʼ��Ϊ8��������2,3,5,7,11,13,17,19��
 (3)��ʾarray1�����ݡ�
 (4)��ֵarray2��������array1���޸�array2�е�ż����Ԫ�أ�ʹ���������ֵ
 (��array[0]=0,array[2]=2)����ӡ��array1��

 */
public class TestArray {
	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };

		// ����array1
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();
		System.out.println(array1);
		array2 = array1;
		System.out.println(array2);
		// �޸�array2
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = i;
			}
		}
		// ����array1
		for (int i = 0; i < array1.length; i++) {
			
			System.out.print(array1[i] + "\t");
		}

		// // ����array2
		// for (int i = 0; i < array2.length; i++) {
		// System.out.print(array2[i] + "\t");
		// }
	}
}
