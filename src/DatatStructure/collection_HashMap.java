package DatatStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class collection_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic= new HashMap<String,String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		//Set<String> keys=dic.keySet();//��� key�� set �÷��ǿ� �޾ƿ�
		//Iterator<String> it =keys.iterator();//set�� �����ϴ� Iterator ����
		Iterator<String> it=dic.keySet().iterator();
		
		while(it.hasNext())
		{
			String key=it.next();
			String value=dic.get(key);
			System.out.print("("+key+","+value+")");
		}
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<3;i++)
		{
			System.out.print("ã����� �ܾ��?");
			String eng=scanner.next();
			
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"�� ���� �ܾ� �Դϴ�.");
			else
				System.out.println(kor);
		}
	}

}
