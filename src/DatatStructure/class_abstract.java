package DatatStructure;

public class class_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] a= {1,2,3};
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.subtract(1, 2));
		System.out.println(calc.average(a));

	}

}
abstract class Caculator{
	public abstract int add(int a,int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a);
}
class GoodCalc extends Caculator{

	public int add(int a,int b)
	{
		return a+b;
	}
	public int subtract(int a,int b)
	{
		return a-b;
	}
	public double average(int[] a)
	{
		double sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return sum/a.length;
	}
}
