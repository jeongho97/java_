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
		

		System.out.println(Integer.toBinaryString(num)); //2������ ���

		check=0X80000000;
		
		for(int i=0;i<n;i++)
		{
			if((num&check)==0) //ù��° ��Ʈ�� 0�̸� �״�� shift ����
			{
				num=num<<1;
			}
			else //ù��° ��Ʈ�� 1�̸� 1������
			{
				num=num<<1;
				num=num | 1;
			}
		}

		System.out.println(Integer.toBinaryString(num));
	}

}
