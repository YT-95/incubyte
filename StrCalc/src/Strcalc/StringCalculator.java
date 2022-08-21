package Strcalc;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringCalculator {
	public int add(String number) throws Exception {

		StringTokenizer st = new StringTokenizer(number, ",.;\n");
		int sum = 0, num = 0, i = 0, flag = 0;
		String allNum[] = new String[st.countTokens()];
		Integer allNeg[] = new Integer[st.countTokens()];
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			allNum[i] = token;
			i++;
		}
		i = 0;
		for (String tok : allNum) {
			try {
				try {
					num = Integer.parseInt(tok);

				} catch (Exception e) {
					num = (tok.charAt(0) + 0) - 96;

				}
				if (num < 0) {
					flag = 1;
					throw new Exception();
				}
				if(num>0 && num<1000) {
				sum += num;
				}
			} catch (Exception e) {
				allNeg[i] = Integer.parseInt(tok);
				i++;
			}
		}
		try {
			if (flag == 1) {
				throw new Exception();
			}

		} catch (Exception e) {
			
			for(int j=0;j<i;j++)
			{
				System.out.print(allNeg[j]+" ");
			}
			return -1;
		}

		return sum;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers seprated by comma for addition");
		String input=sc.nextLine();
		StringCalculator strcalc=new StringCalculator();
		if(strcalc.add(input)!=-1)
		
		{
			System.out.println("Ans :");
			System.out.println(strcalc.add(input)); 	
		}
	}
}


