package cn.zucc.day01;

import java.util.Scanner;

public class thereclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入SQL成绩：");
		double SqlScore=sc.nextDouble();
		
		
		
		System.out.println("请输入JAVA成绩：");
		double JavaScore=sc.nextDouble();
		
		System.out.println("请输入ANDROID成绩：");
		double AndroidScore=sc.nextDouble();
		double cha=JavaScore-SqlScore;
		System.out.print("差为："+cha);
		double avg=(SqlScore+JavaScore+AndroidScore)/3;
		System.out.print("平均成绩为："+avg);

	}

}
