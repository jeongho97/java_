package java_programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class reversequeeze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڿ�\n����");
		Scanner scanner =new Scanner(System.in);
		String s = scanner.nextLine();
		char c =scanner.next().charAt(0);
		
		String result=revqueeze(s,c);
		String result2=revqueeze(s.toCharArray(),c);
		System.out.println(result);
		System.out.println(result2);

	}
	public static String revqueeze(String s, char c)
	{
		String temp="";
		for(int i=s.length()-1; i>=0;i--)
		{
			if(s.charAt(i)==c)
			{
				continue;
			}
			else
			{
				temp=temp+s.charAt(i);
			}
		}
		return temp;
	}
	public static String revqueeze(char [] s, char c)
	{
		String temp="";
		
		for(char a : s) //for each�� toCharArray ���ڿ�s�� char Ÿ���� �迭 ���·� ���
		{
			if(a==c)
			{
				continue;
			}
			else
			{
				temp=temp+a;
			}
		}
		StringBuffer sb = new StringBuffer(temp); //StringBuffer�� reverse()�޼ҵ带 �����Ѵ�
		temp=sb.reverse().toString();
		
//		List<Character> list = new ArrayList(); //List�� ��ȯ �� Collections.reverse(list) �̿��Ͽ� ������
//		for(char a : s.toCharArray()) //for each�� toCharArray ���ڿ�s�� char Ÿ���� �迭 ���·� ���
//		{
//			if(a==c)
//			{
//				continue;
//			}
//			else
//			{
//				list.add(a);
//			}
//		}
//		
//		Collections.reverse(list);
//		ListIterator li=list.listIterator();
//		while(li.hasNext())
//		{
//			System.out.print(li.next());
//		}

		return temp;
	}
}
