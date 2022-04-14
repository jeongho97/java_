package java_programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class reversequeeze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문자열\n문자");
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
		
		for(char a : s) //for each문 toCharArray 문자열s를 char 타입의 배열 형태로 사용
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
		StringBuffer sb = new StringBuffer(temp); //StringBuffer는 reverse()메소드를 제공한다
		temp=sb.reverse().toString();
		
//		List<Character> list = new ArrayList(); //List로 변환 후 Collections.reverse(list) 이용하여 뒤집기
//		for(char a : s.toCharArray()) //for each문 toCharArray 문자열s를 char 타입의 배열 형태로 사용
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
