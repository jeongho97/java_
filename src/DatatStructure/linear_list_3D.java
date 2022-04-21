package DatatStructure;

public class linear_list_3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sale[][][]=new int [][][] {{{63,84,140,130},
										{157,80,130,135}},
										{{59,80,130,135},
											{149,187,239,310}}
										};
		for(int i=0;i<2;i++) {
			System.out.printf("<< %d ÆÀ >> %n", i+1);
			for(int j=0; j<2; j++) {
				for(int k=0;k<4;k++) {
					System.out.printf("%d/4ºÐ±â : sale[%d][%d][%d]=%d %n", k+1,i,j,k,sale[i][j][k]);
				}
				System.out.printf("------------------------------\n");
			}
			System.out.println();
		}

	}

}
