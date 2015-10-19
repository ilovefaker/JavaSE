package cn.zucc.day01;

import java.util.Scanner;

public class bijiaochengji {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Lisi=80;
Scanner input=new Scanner(System.in);
boolean isBig;
System.out.print("请输入张三成绩：");
int Zhangsan=input.nextInt();
isBig=Zhangsan>Lisi;
System.out.print("张三的成绩比李四高吗？"+isBig);
	}

}
