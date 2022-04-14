package java_programing;

import java.util.Scanner;

public class midString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			String s=scanner.next();
			String a=scanner.next();
			String b=scanner.next();
			
			String result=midstr(s,a,b);
			System.out.println(result);
		}

	public static String midstr(String ...strs) //가변길이 인수 개수는 상관없지만 모두 타입이 같아야한다.
	{
		String temp="";

		String s=strs[0];
		int a=Integer.parseInt(strs[1]);
		int b=Integer.parseInt(strs[2]);
		

		if(a>s.length())
		{
			System.out.println("a값이 범위를 벗어났습니다");
			System.exit(0);
			
		}
		else if(a+b-1>s.length())
		{
			System.out.println("b값이 범위를 벗어났습니다");
			System.exit(0);
		}
		else
		{
//			for(int j=a-1;j<a+b-1;j++) //slicing 안쓰고
//			{
//				temp+=s.charAt(j);
//			}
			temp=s.substring(a-1, a+b-1); //slicing
		}


		return temp;
	}

}
