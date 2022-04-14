package java_programing;

import java.util.Scanner;

public class left_circular_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		int check;
		int n=0;
		num=scanner.nextInt();
		n=scanner.nextInt();
		

		System.out.println(Integer.toBinaryString(num)); //2진수로 출력

		check=0X80000000;
		
		for(int i=0;i<n;i++)
		{
			if((num&check)==0) //첫번째 비트가 0이면 그대로 shift 진행
			{
				num=num<<1;
			}
			else //첫번째 비트가 1이면 1더해줌
			{
				num=num<<1;
				num=num | 1;
			}
		}

		System.out.println(Integer.toBinaryString(num));
	}

}
