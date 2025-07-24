package oops;

import java.util.Scanner;

public class Calculater {
public static int powerInt(int num1,int num2) {
	return (int)Math.pow(num1, num2);
}
public static double powerDouble(double num1,int num2) {
	return (int)Math.pow(num1, num2);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	double dnum=sc.nextDouble();
	int pnum=sc.nextInt();
	System.out.println(powerInt(num1,num2));
	System.out.println(powerDouble(dnum,pnum));
}
}
