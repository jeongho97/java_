package java_programing;

import java.util.Scanner;

public class checkStr_내부클래스_Object객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		Tr4 P;
		
		Object Q;
		
		
		P=new Select4(s,t);
		
		Q=((Select4)P).check();
		
		if(Q instanceof Select4.Numcmp4)
		{
			System.out.println(((Select4.Numcmp4)Q).cmp());
		}
		else
		{
			System.out.println(((Select4.Strcmp4)Q).cmp());
		}

	}

}
class Tr4{
	
	public String s;
	public String t;
	
	public Tr4(String s, String t)
	{
		this.s=s;
		this.t=t;
	}
	
}
class Select4 extends Tr4{

	public Select4(String s, String t) {
		super(s, t);
		// TODO Auto-generated constructor stub
	}

	class Numcmp4 {

		public int cmp()
		{
			double a,b;
			int result;
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
			
			return result;
		}
	}
	class Strcmp4{

		public int cmp()
		{
			int result;
			result=s.compareTo(t);
			return result;
		}
	}
	public Object check()
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
			return new Numcmp4(); //내부 클래스 Numcmp 객체 생성한뒤 cmp함수 호출
		}
		else
		{
			return new Strcmp4(); //내부 클래스 Strcmp 객체 생성한뒤 cmp함수 호출
		}
	}
}
