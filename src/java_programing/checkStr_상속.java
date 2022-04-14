package java_programing;

import java.util.Scanner;

public class checkStr_상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		Tr P,Q;
		
		P=new Select(s,t); //up-casting(select 클래스를 통해 부모 클래스의 객체 초기화)
		Q=((Select)P).check();//select 클래스의 check() 함수를 사용하기 위해 부모 객체 P를 Select 클래스로 down casting 해준다.
		
		System.out.println(((Select)P).connect(Q)); //Select클래스의 connect 함수를 사용하기 위해 부모 객체 P를 down casting 해준다.

	}

}

class Tr{
	
	public String s;
	public String t;

	public Tr(String s, String t)
	{
		this.s=s;
		this.t=t;
	}

}

class Select extends Tr{

	public Select(String s, String t) {
		super(s, t); //부모 객체 초기화
		// TODO Auto-generated constructor stub
	}
	public Tr check() //타입을 부모로 하여 부모를 상속받고 있는 Numcmp와 Strcmp를 Select 클래스에서 접근할 수 있다.
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
			return new Numcmp(s,t); //부모 객체를 상속받고 있는 Numcmp 객체 생성
		}
		else
		{
			return new Strcmp(s,t); //부모 객체를 상속받고 있는 Strcmp 객체 생성
		}
	}
	
	public int connect(Tr q)
	{
		int result;
		if(q instanceof Strcmp ==true)
		{
			result= ((Strcmp)q).cmp(); //부모 객체 q를 인자로 받아와서 부모객체를 통해 Strcmp 클래스로 접근할 수 있는 것이고 부모 객체를 down casting하여 Strcmp의 cmp()를 사용한다.
		}
		else
		{
			result= ((Numcmp)q).cmp(); //부모 객체 q를 인자로 받아와서 부모객체를 통해 Numcmp 클래스로 접근할 수 있는 것이고 부모 객체를 down casting하여 Numcmp의 cmp()를 사용한다.
		}
		return result;
		
	}
	
}

class Strcmp extends Tr{

	public Strcmp(String s, String t) {
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

class Numcmp extends Tr{

	public Numcmp(String s, String t) {
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
