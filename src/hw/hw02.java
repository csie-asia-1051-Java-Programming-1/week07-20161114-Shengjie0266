package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int v=scn.nextInt();
		System.out.println(fun(v));
	}
	public static int fun(int v){
		if(v<10){
			return 1;
		}else{
			return 1+fun(v/10);
		}
	}
}
