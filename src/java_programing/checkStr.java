package java_programing;

import java.util.Scanner;

public class checkStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		double a,b; int result;
		
		Ts P=new Ts(s,t);
		int cond=P.check();
		
		if(cond==Ts.STR)
		{
			result=s.compareTo(t);
		}
		else
		{
			a=Double.parseDouble(s);
			b=Double.parseDouble(t);
			if(a>b)
			{
				result=1;
			}
			else if(a<b)
			{
				result=-1;
			}
			else
			{
				result=0;
			}
		}
		System.out.println(result);
		

	}

}
class Ts{
	
	static final int NUM=0; //초기화
	static final int STR=1;
	private String s;
	private String t;
	
	
	public Ts(String s, String t)
	{
		this.s=s;
		this.t=t;
	}
	
	public int check()
	{
		boolean check_s=false;
		boolean check_t=false;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='-'||s.charAt(i)=='.')
			{
				continue;
			}
			else if(Character.isDigit(s.charAt(i))==true)
			{
				check_s=true; //숫자이다
			}
			else
			{
				check_s=false; //문자이다
				break;
			}

		}
		if(check_s==true)//s가 문자라면 t는 검사할 필요 x
		{
			for(int i=0;i<t.length();i++)
			{
				if(t.charAt(i)=='-'||t.charAt(i)=='.')
				{
					continue;
				}
				else if(Character.isDigit(this.t.charAt(i))==true)
				{
					check_t=true; //숫자이다
				}
				else
				{
					check_t=false; //문자이다
					break;
				}
			}
		}
		
		if(check_s==true&&check_t==true) //모두 숫자로 이루어진 문자라면
		{
			return NUM;
		}
		else
		{
			return STR;
		}
	}
}
