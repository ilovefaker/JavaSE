package cn.zucc.day01;

import java.util.Scanner;

public class thereclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("������SQL�ɼ���");
		double SqlScore=sc.nextDouble();
		
		
		
		System.out.println("������JAVA�ɼ���");
		double JavaScore=sc.nextDouble();
		
		System.out.println("������ANDROID�ɼ���");
		double AndroidScore=sc.nextDouble();
		double cha=JavaScore-SqlScore;
		System.out.print("��Ϊ��"+cha);
		double avg=(SqlScore+JavaScore+AndroidScore)/3;
		System.out.print("ƽ���ɼ�Ϊ��"+avg);

	}

}
