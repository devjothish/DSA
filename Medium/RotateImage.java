package Medium;

//48. Rotate Image

public class RotateImage{

    public static void Rotate90(int[][] mat){
        //Transpose the matrix - Swapping
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        /* Current state of matrix is [1,4,7]
         *                            [2,5,8]
                                      [3,6,9] */
        //Reverse each row of the matric
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                int temp=0;
                temp=mat[i][j];
                mat[i][j]=mat[i][mat.length - j -1];
                mat[i][mat.length - j -1]=temp;
            }
        }
    }
    public static void main(String[] args){
        int[][] mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        Rotate90(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}