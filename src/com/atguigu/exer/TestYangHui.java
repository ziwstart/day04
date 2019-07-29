package com.atguigu.exer;
/*
 * ʹ�ö�ά�����ӡһ�� 10 ���������.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
����ʾ��
 1. ��һ���� 1 ��Ԫ��, �� n ���� n ��Ԫ��
 2. ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض��� 1
 3. �ӵ����п�ʼ, ���ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�Ԫ��. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

 */
public class TestYangHui {
	public static void main(String[] args) {
		int[][] yangHui = new int[10][];
		//1.��ʼ����ά����
		for(int i = 0;i < yangHui.length;i++){
			yangHui[i] = new int[i + 1];
		}
		//2.��ʽ��Ϊ��ά�����ÿ��Ԫ�ظ�ֵ
		for(int i = 0;i < yangHui.length;i++){
			for(int j = 0;j < yangHui[i].length;j++){
				yangHui[i][0] = yangHui[i][i] = 1;
				
				if(i > 1 && j > 0 && j < i){
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}
	
		//������ά����
		for(int i = 0;i < yangHui.length;i++){
			for(int j = 0;j < yangHui[i].length;j++){
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}






