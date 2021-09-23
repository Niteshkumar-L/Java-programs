public class matrixmultiply{
    public static void main(String []args){
        int x[][]={{1,3},{2,3}};
        int y[][]={{2,2},{2,3}};
        int z[][]= new int[2][2];
        for(int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                for(int k=0;k<2;k++)
                z[i][j]=x[i][k]*y[k][j];
                System.out.print(z[i][j] +"  " ) ;
                }
        }
    }
}
