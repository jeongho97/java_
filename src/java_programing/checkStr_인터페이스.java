package java_programing;

import java.util.Scanner;

public class checkStr_�������̽� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		Tr2 P;
		Ti Q;
		
		P=new Select2(s,t);
		Q=((Select2)P).check(); //Select Ŭ������ check()�� Ti Ŭ������ �Լ��� ���� �Ǿ� �ִ�.
		
		System.out.println(Q.cmp()); //�������̽� Ti�� cmp()�� ������ ���� ������ Q�� ��ü Ÿ�Կ� ���� Strcmp or Numcmp Ŭ������ cmp()�� ȣ���Ѵ�.

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
			return new Numcmp2(s,t); //�θ�(Tr) ��ü�� ��ӹް� �ִ� Numcmp ��ü ����
		}
		else
		{
			return new Strcmp2(s,t); //�θ�(Tr) ��ü�� ��ӹް� �ִ� Strcmp ��ü ����
		}
	}
	
}


