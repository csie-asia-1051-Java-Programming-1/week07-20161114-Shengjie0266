package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021040 ¬x¸t³Ç
 */
public class ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		var(n);
	}
	public static void var(int n){
		Scanner scn=new Scanner(System.in);
		int sum1=0,sum2=0,a1,a2,a3,a4,t;
		int data[]=new int [n];
		for(a1=0;a1<n;a1++){
			 data[a1]=scn.nextInt();
		}
		for(a1=0;a1<n;a1++){
			sum1+=data[a1];
		}
		a3=sum1/n;
		for(a1=0;a1<n;a1++){
			a2=a3-data[a1];
			a4=a2*a2;
			sum2+=a4;
		}
		t=sum2/n;
		System.out.println(t);
	}

}
