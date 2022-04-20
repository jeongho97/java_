package DatatStructure;

public class array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.3,3.4},
						   {3.5,3.6},
						   {3.7,4.0},
						   {4.1,4.2}};
		
		double result[][] = new double[5][3];
		
		int s_row=score.length; //��
		int s_column=score[0].length;//��

		
		for(int year=0;year<s_row;year++)
		{
			double sum=0;
			for(int term=0; term<s_column;term++)
			{
				result[year][term]=score[year][term];
				sum+=score[year][term]; //���� �� ����
				result[year][s_column]=sum/s_column;
			}
		
		}
		int r_row=result.length;//��
		int r_column=result[0].length;//��

		for(int term=0;term<r_column;term++) //���� �� �ջ��ؾ� �ؼ� ��� �� ��ġ �ٲ㼭 ����
		{
			double sum=0;
			for(int year=0; year<r_row-1;year++)
			{
				sum+=result[year][term]; //���� �� ����
			}
			result[r_row-1][term]=sum/s_row;
		}
		
		//��� ����
		System.out.printf("%13s%9s%9s\n","1�б�","2�б�","���");
		
		for(int i=0;i<r_row;i++)
		{
			
			if(i==r_row-1)
			{
				System.out.printf("��� ");
			}
			else
			{
				System.out.printf("%d�г�",i+1);
			}
			for(int j=0; j<r_column;j++)
			{
				System.out.printf("%10.2f",result[i][j]);
			}
			System.out.println();
			System.out.println("=====================================");
		}
	}

}
