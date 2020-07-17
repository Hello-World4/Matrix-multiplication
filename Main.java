public class Main {
    public static void main(String [] args){
       int [][] A = { {2,8,1},
                      {-3,5,0},

                          };

        int [][] B = { {2,-4},
                       {0,2},
                        {1,5},

                            };

        Matrix a = new Matrix();
        a.display(a.multiplication(A,B));



    }

}
