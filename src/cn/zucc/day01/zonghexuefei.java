package cn.zucc.day01;

import java.util.Scanner;

public class zonghexuefei {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--��ӭ�����Ĵ����--");
System.out.println("�Ĵ�γ̷���");
System.out.print("1.JAVA�������ʦ��ѵ");
System.out.println("\t\t��ѧ�ѣ�20RMB��");
System.out.print("2.Android�ֻ�������ѵ��");
System.out.println("\t\t��ѧ�ѣ�30RMB��");
System.out.print("3.�Ա�����Ӫ����ѵ��");
System.out.println("\t\t��ѧ�ѣ�10RMB��");
System.out.print("4.Ƕ��ʽ����ʦ��ѵ��");
System.out.println("\t\t��ѧ�ѣ�40RMB��");

Scanner sc=new Scanner(System.in);
System.out.println("������μ�JAVA�������ʦ��ѵ��ѧԱ������");
int JavaPeople=sc.nextInt();

System.out.println("������μ�Android�ֻ�������ѵ��ѧԱ������");
int AndroidPeople=sc.nextInt();

System.out.println("������μ��Ա�����Ӫ����ѵ��ѧԱ������");
int TaobaoPeople=sc.nextInt();

System.out.print("������μ�Ƕ��ʽ����ʦ��ѵ��ѧԱ������");
int GongPeople=sc.nextInt();

System.out.println("�����������ܵ��ǰ����Żݣ�����");

int FirstXuefei=JavaPeople*20+AndroidPeople*30+TaobaoPeople*10+GongPeople*40;

System.out.println("�����ǰ֧������ѧ�ѣ�"+FirstXuefei);
Double SecondXuefei;

SecondXuefei=0.8*FirstXuefei;

System.out.println("����ۺ�֧������ѧ�ѣ�"+SecondXuefei);

System.out.println("��֧����");
Scanner input=new Scanner(System.in);

double PayMoney=input.nextDouble();

System.out.println("ʵ��֧����"+PayMoney);

double zhaoling=PayMoney-SecondXuefei;
System.out.println("���㣺"+zhaoling);

double ji=SecondXuefei/100;
int Jifeng=(int)ji;

System.out.println("���û��֣�"+Jifeng);

System.out.print("ף��ѧϰ��죡");










	}

}
