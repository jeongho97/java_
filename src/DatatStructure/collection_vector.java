package DatatStructure;

import java.util.Vector;

public class collection_vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v =new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100); //4�� -1���̿� ���� 100 ����
		System.out.println("���� ���� ��� ��ü �� : "+v.size());
		System.out.println("������ ���� �뷮 : "+v.capacity());
		
		for(int i=0; i<v.size();i++)
		{
			int n = v.get(i);
			System.out.println(n);
		}
		int sum=0;
		for(int i=0;i<v.size();i++)
		{
			int n=v.elementAt(i);
			sum+=n;
		}
		System.out.println("���Ϳ� �ִ� ���� ��: "+sum);

	}

}
