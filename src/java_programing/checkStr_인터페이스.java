package java_programing;

import java.util.Scanner;

public class checkStr_인터페이스 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		Tr2 P;
		Ti Q;
		
		P=new Select2(s,t);
		Q=((Select2)P).check(); //Select 클래스에 check()는 Ti 클래스의 함수로 구현 되어 있다.
		
		System.out.println(Q.cmp()); //인터페이스 Ti에 cmp()를 정의해 놨기 때문에 Q의 객체 타입에 따라 Strcmp or Numcmp 클래스의 cmp()를 호출한다.

	}

}
interface Ti
{
	int cmp();
}
class Tr2 
{
	public String s;
	public String t;

	public Tr2(String s, String t)
	{
		this.s=s;
		this.t=t;
	}
}
class Strcmp2 extends Tr2 implements Ti
{

	public Strcmp2(String s, String t) {
		super(s, t);
		// TODO Auto-generated constructor stub
	}
	public int cmp()
	{
		int result;
		result=s.compareTo(t);
		return result;
	}
	
}
class Numcmp2 extends Tr2 implements Ti
{

	public Numcmp2(String s, String t) {
		super(s, t);
		// TODO Auto-generated constructor stub
	}
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
class Select2 extends Tr2 {

	public Select2(String s, String t) {
		super(s,t);
		
	}
	public Ti check()
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
			return new Numcmp2(s,t); //부모(Tr) 객체를 상속받고 있는 Numcmp 객체 생성
		}
		else
		{
			return new Strcmp2(s,t); //부모(Tr) 객체를 상속받고 있는 Strcmp 객체 생성
		}
	}
	
}


