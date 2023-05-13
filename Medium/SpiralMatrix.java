package Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
   
    public static void main(String[] args){
                                    /*Right */
        int[][] matrix={/*top->*/{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}/*Bottom */};
                    /*left */
    
    //1st loop- prints element from left to right
    //2nd loop - prints elements from top to bottom
    //3rd loop-prints elements from right to left
    //4th loop - prints elements from bottom to top
    
    /*Print the top row - column index left to right - increase the count of top - move to the next row
     * Print the right column - rightmost column from row index top to bottom - decrease the count of right
     * Print the bottom row - if top<=bottom, print bottom row from column right to left - decrease the count of bottom
     * Print the left column - if left<=right, print left column from the bottom row to the top row - increase the count of left
     * Run a loop until all the squares of loops are printed.
     */
        List<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;

        //Initialise the pointers required from traversal
        int top=0, left=0, bottom=n-1, right=m-1;

        //loop until all elements are not traversed
        while(top<=bottom && left<=right){
            //For moving left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //For moving top to bottom
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //For moving right to left
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom --;
            }

            //For moving bottom to top
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+ ",");
        }
    }

}
