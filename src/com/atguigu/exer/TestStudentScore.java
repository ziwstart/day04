package com.atguigu.exer;
/*
 *  �Ӽ��̶���ѧ���ɼ����ҳ���߷֣������ѧ���ɼ��ȼ���
	�ɼ�>=��߷�-10    �ȼ�Ϊ��A��   
	�ɼ�>=��߷�-20    �ȼ�Ϊ��B��
	�ɼ�>=��߷�-30    �ȼ�Ϊ��C��   
	����                            �ȼ�Ϊ��D��
	
	��ʾ���ȶ���ѧ��������������������int���飬���ѧ���ɼ���

 */
import java.util.Scanner;
public class TestStudentScore {
	public static void main(String[] args) {
		//1.����Scanner�Ķ���,���Ӽ��̻�ȡѧ���ĸ���n
		Scanner s = new Scanner(System.in);
		System.out.println("������ѧ���ĸ�����");
		int count = s.nextInt();//count������¼ѧ���ĸ���
		//2.���������ѧ���ĸ���n������һ������Ϊn��int�͵�����
		int[] scores = new int[count];
		int maxScore = 0;
		//3.���δӼ��̻�ȡn��ѧ���ĳɼ�����������Ӧ������Ԫ�أ�����ȡn��ѧ���е���߷�
		System.out.println("������" + count + "���ɼ���");
		for(int i = 0;i < scores.length;i++){
			int score = s.nextInt();//���δӼ��̻�ȡѧ���ĳɼ�
			scores[i] = score;
			if(scores[i] > maxScore){
				maxScore = scores[i];
			}
		}
		
		//4.����ѧ���ɼ������飬������ѧ���ɼ�����߷ֵĲ�ֵ��������Ӧ�ĵȼ��������
		System.out.println("��߷�Ϊ��" + maxScore);
		for(int i = 0;i < scores.length;i++){
			char level;
			if(scores[i] >= maxScore - 10){
				level = 'A';
			}else if(scores[i] >= maxScore - 20){
				level = 'B';
			}else if(scores[i] >= maxScore - 30){
				level = 'C';
			}else{
				level = 'D';
			}
			
			System.out.println("student " + i + " score is " + scores[i] + " grade is " + level);
		}
	}
}
