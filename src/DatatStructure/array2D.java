package DatatStructure;

public class array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[][]= {{3.3,3.4},
						   {3.5,3.6},
						   {3.7,4.0},
						   {4.1,4.2}};
		
		double result[][] = new double[5][3];
		
		int s_row=score.length; //행
		int s_column=score[0].length;//열

		
		for(int year=0;year<s_row;year++)
		{
			double sum=0;
			for(int term=0; term<s_column;term++)
			{
				result[year][term]=score[year][term];
				sum+=score[year][term]; //행을 다 더함
				result[year][s_column]=sum/s_column;
			}
		
		}
		int r_row=result.length;//행
		int r_column=result[0].length;//열

		for(int term=0;term<r_column;term++) //열을 다 합산해야 해서 행과 열 위치 바꿔서 접근
		{
			double sum=0;
			for(int year=0; year<r_row-1;year++)
			{
				sum+=result[year][term]; //열을 다 더함
			}
			result[r_row-1][term]=sum/s_row;
		}
		
		//출력 포맷
		System.out.printf("%13s%9s%9s\n","1학기","2학기","평균");
		
		for(int i=0;i<r_row;i++)
		{
			
			if(i==r_row-1)
			{
				System.out.printf("평균 ");
			}
			else
			{
				System.out.printf("%d학년",i+1);
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
