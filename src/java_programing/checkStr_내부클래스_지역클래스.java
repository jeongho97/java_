package java_programing;

import java.util.Scanner;

public class checkStr_����Ŭ����_����Ŭ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		Tr5 P;
		
		Tii Q;
		
		
		P=new Select5(s,t);
		
		Q=(Tii)((Select5)P).check();
		
		System.out.println(Q.cmp());

	}

}
interface Tii
{
	int cmp();
}
class Tr5{
	
	public String s;
	public String t;
	
	public Tr5(String s, String t)
	{
		this.s=s;
		this.t=t;
	}
	
}
class Select5 extends Tr5{

	public Select5(String s, String t) {
		super(s, t);
		// TODO Auto-generated constructor stub
	}

	
	public Object check()
	{
		class Numcmp5 implements Tii {

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
		class Strcmp5 implements Tii{

			public int cmp()
			{
				int result;
				result=s.compareTo(t);
				return result;
			}
		}
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
				check_s=true; //�����̴�
			}
			else
			{
				check_s=false; //�����̴�
				break;
			}

		}
		if(check_s==true)//s�� ���ڶ�� t�� �˻��� �ʿ� x
		{
			for(int i=0;i<t.length();i++)
			{
				if(t.charAt(i)=='-'||t.charAt(i)=='.')
				{
					continue;
				}
				else if(Character.isDigit(this.t.charAt(i))==true)
				{
					check_t=true; //�����̴�
				}
				else
				{
					check_t=false; //�����̴�
					break;
				}
			}
		}
		
		if(check_s==true&&check_t==true) //��� ���ڷ� �̷���� ���ڶ��
		{
			return new Numcmp5(); //���� Ŭ���� Numcmp ��ü �����ѵ� cmp�Լ� ȣ��
		}
		else
		{
			return new Strcmp5(); //���� Ŭ���� Strcmp ��ü �����ѵ� cmp�Լ� ȣ��
		}
	}
}
