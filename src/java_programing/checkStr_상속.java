package java_programing;

import java.util.Scanner;

public class checkStr_��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String t=sc.nextLine();
		
		Tr P,Q;
		
		P=new Select(s,t); //up-casting(select Ŭ������ ���� �θ� Ŭ������ ��ü �ʱ�ȭ)
		Q=((Select)P).check();//select Ŭ������ check() �Լ��� ����ϱ� ���� �θ� ��ü P�� Select Ŭ������ down casting ���ش�.
		
		System.out.println(((Select)P).connect(Q)); //SelectŬ������ connect �Լ��� ����ϱ� ���� �θ� ��ü P�� down casting ���ش�.

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
		super(s, t); //�θ� ��ü �ʱ�ȭ
		// TODO Auto-generated constructor stub
	}
	public Tr check() //Ÿ���� �θ�� �Ͽ� �θ� ��ӹް� �ִ� Numcmp�� Strcmp�� Select Ŭ�������� ������ �� �ִ�.
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
			return new Numcmp(s,t); //�θ� ��ü�� ��ӹް� �ִ� Numcmp ��ü ����
		}
		else
		{
			return new Strcmp(s,t); //�θ� ��ü�� ��ӹް� �ִ� Strcmp ��ü ����
		}
	}
	
	public int connect(Tr q)
	{
		int result;
		if(q instanceof Strcmp ==true)
		{
			result= ((Strcmp)q).cmp(); //�θ� ��ü q�� ���ڷ� �޾ƿͼ� �θ�ü�� ���� Strcmp Ŭ������ ������ �� �ִ� ���̰� �θ� ��ü�� down casting�Ͽ� Strcmp�� cmp()�� ����Ѵ�.
		}
		else
		{
			result= ((Numcmp)q).cmp(); //�θ� ��ü q�� ���ڷ� �޾ƿͼ� �θ�ü�� ���� Numcmp Ŭ������ ������ �� �ִ� ���̰� �θ� ��ü�� down casting�Ͽ� Numcmp�� cmp()�� ����Ѵ�.
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
