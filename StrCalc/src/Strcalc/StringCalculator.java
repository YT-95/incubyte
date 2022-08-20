package Strcalc;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCalculator {
	public int add(String number) {

		StringTokenizer st=new StringTokenizer(number,",");
		int sum=0;
		while(st.hasMoreTokens())
		{
			int num=Integer.parseInt(st.nextToken());
			sum+=num;
			
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers seprated by comma to addition");
		String input=sc.nextLine();
		StringCalculator strcalc=new StringCalculator();
		System.out.println(strcalc.add(input));
	}
}
