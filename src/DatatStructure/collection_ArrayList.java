package DatatStructure;

import java.util.ArrayList;
import java.util.Scanner;

public class collection_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<4; i++)
		{
			System.out.print("�̸��� �ԏ��ϼ���>>");
			String s=scanner.next();
			a.add(s);
		}
		
		for(int i=0;i<a.size();i++)
		{
			String name=a.get(i);
			System.out.print(name+" ");
		}
		int longestindex=0;
		for(int i=1;i<a.size();i++)
		{
			if(a.get(longestindex).length()<a.get(i).length())
			{
				longestindex=i;
			}
		}
		System.out.println("\n���� �� �̸��� : "+a.get(longestindex));

	}

}
