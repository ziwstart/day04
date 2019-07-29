package com.atguigu.exer;

public class TestGetSum {
	public static void main(String[] args) {
		int[][] m = new int[][]{{3,8,2},{2,7},{9,0,1,6}};
		int sum = 0;
		for(int i = 0;i < m.length;i++){
			for(int j = 0;j < m[i].length;j++){
				System.out.print(m[i][j] + "\t");
				sum += m[i][j];
			}
			System.out.println();
		}
		System.out.println("×ÜºÍÎª£º" + sum);
	}
}
