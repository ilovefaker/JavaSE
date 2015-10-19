package cn.zucc.day01;

import java.util.Scanner;

public class zonghexuefei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--欢迎来到文达教育--");
System.out.println("文达课程服务：");
System.out.print("1.JAVA软件工程师培训");
System.out.println("\t\t（学费：20RMB）");
System.out.print("2.Android手机开发培训。");
System.out.println("\t\t（学费：30RMB）");
System.out.print("3.淘宝开店营销培训。");
System.out.println("\t\t（学费：10RMB）");
System.out.print("4.嵌入式工程师培训。");
System.out.println("\t\t（学费：40RMB）");

Scanner sc=new Scanner(System.in);
System.out.println("请输入参加JAVA软件工程师培训的学员人数：");
int JavaPeople=sc.nextInt();

System.out.println("请输入参加Android手机开发培训的学员人数：");
int AndroidPeople=sc.nextInt();

System.out.println("请输入参加淘宝开店营销培训的学员人数：");
int TaobaoPeople=sc.nextInt();

System.out.print("请输入参加嵌入式工程师培训的学员人数：");
int GongPeople=sc.nextInt();

System.out.println("！！！你享受的是八折优惠！！！");

int FirstXuefei=JavaPeople*20+AndroidPeople*30+TaobaoPeople*10+GongPeople*40;

System.out.println("你打折前支付的总学费："+FirstXuefei);
Double SecondXuefei;

SecondXuefei=0.8*FirstXuefei;

System.out.println("你打折后支付的总学费："+SecondXuefei);

System.out.println("请支付：");
Scanner input=new Scanner(System.in);

double PayMoney=input.nextDouble();

System.out.println("实际支付："+PayMoney);

double zhaoling=PayMoney-SecondXuefei;
System.out.println("找零："+zhaoling);

double ji=SecondXuefei/100;
int Jifeng=(int)ji;

System.out.println("你获得积分："+Jifeng);

System.out.print("祝你学习愉快！");










	}

}
