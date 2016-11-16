package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int v=scn.nextInt();
		System.out.println(fun(v));
	}
	public static String fun(int v){
		if(v<10){
			return Integer.toString(v);
		}else{
			return Integer.toString(v%10) + fun(v/10);
		}
	}
}
