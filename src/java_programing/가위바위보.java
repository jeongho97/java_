package java_programing;

import java.util.Scanner;

public class ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >> ");
		String a=s.next();
		System.out.print("���� >> ");
		String b=s.next();
		

		if(a.equals("����")) //a=="����" �̷��� ���ϸ� a�� �ּҰ��� "����"�� ���ϱ� ������ if�� ������ ���� ���Ѵ� ���� equals �Լ��� ���� ���ڿ��� ���ؾ� �Ѵ�.
		{
			if(b.equals("����"))
			{
				System.out.println("�����ϴ�");
			}
			else if(b.equals("��"))
			{
				System.out.println("���� ��");
			}
			else
			{
				System.out.println("ö�� ��");
			}
		}
		else if(a.equals("��"))
		{
			if(b.equals("��"))
			{
				System.out.println("�����ϴ�");
			}
			else if(b.equals("����"))
			{
				System.out.println("���� ��");
			}
			else
			{
				System.out.println("ö�� ��");
			}
		}
		else if(a.equals("����"))
		{
			if(b.equals("����"))
			{
				System.out.println("�����ϴ�");
			}
			else if(b.equals("����"))
			{
				System.out.println("���� ��");
			}
			else
			{
				System.out.println("ö�� ��");
			}
		}
		else
		{
			System.out.println("�ٽ� �Է�");
		}
	}

}
