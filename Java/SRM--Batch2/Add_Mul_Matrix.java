public class Add_Mul_Matrix {

  public static void main(String[] args) {

    	int a[][]={{1,2,4},{7,5,9},{1,0,5}};    
	int b[][]={{8,5,4},{5,7,3},{0,2,8}};           
	int c[][]=new int[3][3]; 
	int res[][]=new int[3][3]; 

	System.out.println("Addition of two matrix");   
	for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
			c[i][j]=a[i][j]+b[i][j];      
			System.out.print(c[i][j]+" ");    
		}    
		System.out.println();   
	}    
	
	int sum;
	System.out.println("Multiplication of two matrix");
	for ( int i= 0 ; i < 3 ; i++ ){
 		for (int j= 0 ; j <3;j++)
		{
			sum=0;
			for ( int k= 0 ; k <r2;k++ )
			{
				sum +=a[i][k]*b[k][j] ;
 
			}
			res[i][j]=sum;
		}

	}
	for ( int i= 0 ; i < 3; i++ )
	{
		for ( int j=0 ; j < 3;j++ )
			System.out.print(res[i][j]+" ");
 
		System.out.println();
	}

	
  }
}
