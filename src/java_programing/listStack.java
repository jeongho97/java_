/*이정호*/
package java_programing;

import java.util.EmptyStackException;
import java.util.Scanner;

public class listStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		list new_list = new list();
		boolean start =true;
		while(start)
		{
			System.out.println("1:insert 2:delete 3:output 4:invert 5:exit");
			String s=sc.nextLine();
			int i=Integer.parseInt(s);
			switch(i)
			{
			case 1:
				System.out.println("삽입할 값을 입력하시오: ");
				String num=sc.nextLine();
				int item=Integer.parseInt(num);
				new_list.add(item);
				break;
			case 2:
				int result=0;

				try
				{
					result=(int)new_list.delete();
					System.out.println("삭제된 값: "+result);
					break;
				}
				catch(Exception e)
				{
					break;
				}
			case 3:
				new_list.print();
				break;
			case 4:
				new_list.invert();
				System.out.println("역순되었습니다");
				break;
			case 5:
				System.out.println("종료되었습니다");
				start=false;
			}
		}
	}

}
class list<T>
{
	class node<T>
	{
		private T item;
		private node<T> link;
		
		public node(T item)
		{
			this.item=item;
		}
	}
	
	private node<T> root;
	
	public void add(T item)
	{
		node<T> t = new node<T>(item);
		t.link=root;
		root=t;
		
	}
	public T delete()
	{
		if(root==null)
		{
			System.out.println("stack is empty");
			return null;
		}
		else
		{
			T item=root.item;
			root=root.link;
			return item;
		}
	}
	public void print()
	{
		node<T> temp;
		temp=this.root;
		while(temp != null)
		{
			System.out.print(temp.item+" ");
			temp=temp.link;
		}
		System.out.println();
	}
	public void invert()
	{
		node<T> trail,middle,lead;
		
		lead=this.root;
		middle=null;
		trail=null;
		while(lead != null)
		{
			trail=middle;
			middle=lead;
			lead=lead.link;
			middle.link=trail;
		}
		this.root=middle;
	}
}
