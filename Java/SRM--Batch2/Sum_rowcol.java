public class Sum_rowcol {

  public static void main(String[] args) {

    	int a[][]={{1,2,4},{7,5,9},{1,0,5}};    
	          
	int rows = a.length;    
        int cols = a[0].length;    
            
        int sumRow=0,sumCol=0; 
        for(int i = 0; i < rows; i++){    
            sumRow = 0;    
            for(int j = 0; j < cols; j++){    
              sumRow = sumRow + a[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        }    
            
        //Calculates sum of each column of given matrix    
        for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
	
  }
}
