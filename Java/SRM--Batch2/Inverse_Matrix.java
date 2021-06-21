public class Inverse_matrix {

  public static void main(String[] args) {

    	int mat[][]={{1,2,4},{7,5,9},{1,0,5}}; 
	int det,temp;   
	          
	det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		
		System.out.println("\ndeterminant = " + det);
		
		temp = mat[0][0];
		mat[0][0] = mat[1][1];
		mat[1][1] = temp;
		
		mat[0][1] = - mat[0][1];
		mat[1][0] = - mat[1][0];
		
		System.out.println("\nInverse of matrix is:");
		for(i = 0; i < 2; ++i) {
			for(j = 0; j < 2; ++j)
				System.out.print((mat[i][j]/det) + " ");
			
			System.out.print("\n");
		}
	
  }
}