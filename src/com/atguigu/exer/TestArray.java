package com.atguigu.exer;

/*
 * (1)创建一个名为TestArray的类，在main()方法中声明array1和array2两个变量，
 * 他们是int[]类型的数组。
 (2)使用大括号{}，把array1初始化为8个素数：2,3,5,7,11,13,17,19。
 (3)显示array1的内容。
 (4)赋值array2变量等于array1，修改array2中的偶索引元素，使其等于索引值
 (如array[0]=0,array[2]=2)。打印出array1。

 */
public class TestArray {
	public static void main(String[] args) {
		int[] array1, array2;
		array1 = new int[] { 2, 3, 5, 7, 11, 13, 17, 19 };

		// 遍历array1
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + "\t");
		}
		System.out.println();
		System.out.println(array1);
		array2 = array1;
		System.out.println(array2);
		// 修改array2
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = i;
			}
		}
		// 遍历array1
		for (int i = 0; i < array1.length; i++) {
			
			System.out.print(array1[i] + "\t");
		}

		// // 遍历array2
		// for (int i = 0; i < array2.length; i++) {
		// System.out.print(array2[i] + "\t");
		// }
	}
}
