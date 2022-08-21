package Strcalc;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCalculator {
	public int add(String number) {

		StringTokenizer st=new StringTokenizer(number,",.-");
		int sum=0,num=0;
		while(st.hasMoreTokens())
		{
			String token=st.nextToken();
			try {
				 num=Integer.parseInt(token);
				
			}
			catch(Exception e){
				
				num=(token.charAt(0)+0)-96;
			}
			sum+=num;
			
		}
		return sum;
	}
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers seprated by comma for addition");
		String input=sc.nextLine();
		StringCalculator strcalc=new StringCalculator();
		System.out.println(strcalc.add(input));
	}
}
