public class Transpose    
{    
    public static void main(String[] args) {    
        int rows, cols;    
            
        //Initialize matrix a    
          int a[][] = {    
                          {16, 29, 53},    
                          {74, 90, 55},    
                          {97, 68, 12}    
                       };    
              
          //Calculates number of rows and columns present in given matrix    
          rows = a.length;    
        cols = a[0].length;    
            
        //Declare array t with reverse dimensions    
        int t[][] = new int[cols][rows];    
            
        //Calculates transpose of given matrix    
        for(int i = 0; i < cols; i++){    
            for(int j = 0; j < rows; j++){    
                //Converts the row of original matrix into column of transposed matrix    
                t[i][j] = a[j][i];    
            }    
        }    
        
        System.out.println("Transpose of given matrix: ");    
        for(int i = 0; i < cols; i++){    
            for(int j = 0; j < rows; j++){    
               System.out.print(t[i][j] + " ");    
            }    
            System.out.println();    
        }    
    }    
}  
