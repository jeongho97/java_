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
		

		System.out.println(Integer.toBinaryString(num)); //2������ ���

		check=0X80000000;//1000~~
		check2=0X00000001;//~~~0000001
		check3=0X7FFFFFFF;//01111111111~~
	
		for(int i=0;i<n;i++)
		{
			if(num>=0) //����϶�
			{
				if((num&check2)==0) //������ ��Ʈ�� 0�̶��
				{
					num=num>>1; //shift�� ���ش� (�� ���ڸ��� ������ 0���� ä����)
				}
				else //������ ��Ʈ�� 1�̶��
				{
					num=num>>1; //shift ���ְ�
					num=num|check; //����� �� ���ڸ��� 0�̹Ƿ� �� ���ڸ��� 1�� ���� ����
				}
			}
			else //�����϶�
			{
				if((num&check2)==0) //������ ��Ʈ�� 0�̶��
				{
					num=num>>1; //shift ���ְ�
					num=num & check3; //������ �� ���ڸ��� 1�̹Ƿ� �� ���ڸ��� 0�� ���� ����
				}
				else //������ ��Ʈ�� 0�̶��
				{
					num=num>>1; //�� ���ڸ��� ������ 0���� ä�������� shift���길 ���ش�
				}
				
			}
		}
		
		int len = Integer.toBinaryString(num).length(); //�տ� 0 ��� ���ֱ�
		System.out.println("0".repeat(32-len)+Integer.toBinaryString(num));
	}

}
