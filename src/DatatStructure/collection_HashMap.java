package DatatStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class collection_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> dic= new HashMap<String,String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과");
		
		//Set<String> keys=dic.keySet();//모든 key를 set 컬렉션에 받아옴
		//Iterator<String> it =keys.iterator();//set에 접근하는 Iterator 리턴
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
			System.out.print("찾고싶은 단어는?");
			String eng=scanner.next();
			
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+"는 없는 단어 입니다.");
			else
				System.out.println(kor);
		}
	}

}
