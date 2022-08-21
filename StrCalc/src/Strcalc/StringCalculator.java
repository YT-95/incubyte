package Strcalc;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCalculator {
	public int add(String number) throws Exception {

		StringTokenizer st=new StringTokenizer(number,",.");
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
			
				if (num<0) {
					System.out.println("Negative Number");
					System.out.println(num);
					throw new Exception("Negetive number not allowed");
				}
				else{
					sum+=num;
				}
			
		}
		System.out.println("Ans :");
		return sum;
	}
	public static void main(String args[]) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers seprated by comma for addition");
		String input=sc.nextLine();
		StringCalculator strcalc=new StringCalculator();
		System.out.println(strcalc.add(input)); 	
	}
}
