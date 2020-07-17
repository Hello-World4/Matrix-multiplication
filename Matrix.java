public class Matrix {

    public int [][] multiplication(int [][] A, int [][] B){
       int columnA = A[0].length;
        int rowA = A.length;

        int columnB = B[0].length;
        int rowB = B.length;

        if(columnA != rowB){
            System.out.println(("STOP"));

        }

        int [][] c = new int [rowA][columnB]; // matrix result multiplication

        for(int i = 0; i<rowA; i++){
            for(int j = 0; j<columnB;j++){
                for(int k = 0; k<columnA; k++){
                    c[i][j] += A[i][k]*B[k][j];

                }
            }

        }
       return c;

    }

    public void display(int [][] tab){
        for(int i = 0; i<tab.length; i++){
            for(int j = 0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println(" ");
        }
    }






}
