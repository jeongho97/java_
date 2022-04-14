package java_programing;

import java.util.Scanner;

public class right_circular_shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
		
		int num=0;
		int check;
		int check2;
		int check3;
		int n=0;
		num=scanner.nextInt();
		n=scanner.nextInt();
		

		System.out.println(Integer.toBinaryString(num)); //2진수로 출력

		check=0X80000000;//1000~~
		check2=0X00000001;//~~~0000001
		check3=0X7FFFFFFF;//01111111111~~
	
		for(int i=0;i<n;i++)
		{
			if(num>=0) //양수일때
			{
				if((num&check2)==0) //마지막 비트가 0이라면
				{
					num=num>>1; //shift만 해준다 (맨 앞자리는 어차피 0으로 채워짐)
				}
				else //마지막 비트가 1이라면
				{
					num=num>>1; //shift 해주고
					num=num|check; //양수는 맨 앞자리가 0이므로 맨 앞자리에 1이 들어가게 해줌
				}
			}
			else //음수일때
			{
				if((num&check2)==0) //마지막 비트가 0이라면
				{
					num=num>>1; //shift 해주고
					num=num & check3; //음수는 맨 앞자리가 1이므로 맨 앞자리에 0이 들어가게 해줌
				}
				else //마지막 비트가 0이라면
				{
					num=num>>1; //맨 앞자리는 어차피 0으로 채워짐으로 shift연산만 해준다
				}
				
			}
		}
		
		int len = Integer.toBinaryString(num).length(); //앞에 0 출력 해주기
		System.out.println("0".repeat(32-len)+Integer.toBinaryString(num));
	}

}
