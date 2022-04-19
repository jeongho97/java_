package java_programing;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String a=s.next();
		System.out.print("영희 >> ");
		String b=s.next();
		

		if(a.equals("바위")) //a=="바위" 이렇게 비교하면 a의 주소값과 "바위"를 비교하기 때문에 if문 안으로 들어가지 못한다 따라서 equals 함수를 통해 문자열을 비교해야 한다.
		{
			if(b.equals("바위"))
			{
				System.out.println("비겼습니다");
			}
			else if(b.equals("보"))
			{
				System.out.println("영희 승");
			}
			else
			{
				System.out.println("철수 승");
			}
		}
		else if(a.equals("보"))
		{
			if(b.equals("보"))
			{
				System.out.println("비겼습니다");
			}
			else if(b.equals("가위"))
			{
				System.out.println("영희 승");
			}
			else
			{
				System.out.println("철수 승");
			}
		}
		else if(a.equals("가위"))
		{
			if(b.equals("가위"))
			{
				System.out.println("비겼습니다");
			}
			else if(b.equals("바위"))
			{
				System.out.println("영희 승");
			}
			else
			{
				System.out.println("철수 승");
			}
		}
		else
		{
			System.out.println("다시 입력");
		}
	}

}
