package DatatStructure;

class Circle1{
	int radius;
	public Circle1(int radius) {
		this.radius=radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class Circle_classArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle1 [] c;
		c=new Circle1[5];
		
		for(int i=0; i<c.length;i++)
		{
			c[i]=new Circle1(i);
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print((int)(c[i].getArea())+" ");
		}

	}

}
