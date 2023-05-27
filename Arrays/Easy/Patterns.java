
package Arrays.Easy;

import java.util.*;

public class Patterns {

    /* Pattern 1
     *****
     *****
     *****
     *****
     *****
     */
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 2
     *
     **
     ***
     ****
     *****
     */
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 3
    1
    12
    123
    1234
    12345
     */
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* Pattern 4
    1
    22
    333
    4444
    55555
     */
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    /* Pattern 5
     *****
     ****
     ***
     **
     *
     */
    public static void pattern5(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 6
    12345
    1234
    123
    12
    1
     */
    public static void pattern6(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    /* Pattern 7
    n-i-1 - space
    2*i+1; - star
    n-i-1 - star
        *
       ***
      *****
     *******
    *********
     */
    public static void pattern7(int n){
        for(int i=0;i<n;i++){
            //print spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Pattern 8
    for space - j<i
    For stars - 2*n - (2 * i + 1)
    For spaces - j<i
    *********
     *******
      *****
       ***
        *
     */
    public static void pattern8(int n){
        for(int i=0;i<n;i++){
            //print spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j< 2*n - (2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Pattern 9
        *
       ***
      *****
     *******
    *********
    *********
     *******
      *****
       ***
        *
      For this, combine pattern 7 and 8 .
     */

    /* Pattern 10
    For printing stars - 2*n-1
    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
     */
    public static void pattern10(int n){

        for(int i=1;i<=2*n-1;i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* Pattern 11
    1
    01
    101
    0101
    10101
     */
    public static void pattern11(int n){
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }

    /* Pattern 12
    1      1
    12    21
    123  321
    12344321
     */
    public static void pattern12(int n){
        int space = 2*(n-1);
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //spaces
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
            space=space-2;
        }
    }

    /* Pattern 13
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
     */
    public static void pattern13(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    /* Pattern 14
    A
    AB
    ABC
    ABCD
    ABCDE
     */
    public static void pattern14(int n){

        for(int i=0;i<n;i++){
            for(char ch='A';ch<='A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /* pattern 15
    ABCDE
    ABCD
    ABC
    AB
    A
     */
    public static void pattern15(int n){
        for(int i=n;i>0;i--)
        {
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /* Pattern16
    A
    BB
    CCC
    DDDD
    EEEEE
     */
    static void pattern16(int n){
        for(int i=0;i<n;i++){
            char ch= (char) ('A' + i);
          //  System.out.println(ch);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    /* Pattern 17
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
     */
    static void pattern17(int n){
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            //characters
            char ch='A';
            int breaker=(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++){
                System.out.print(ch);
                if(j<=breaker)
                    ch++;
                else
                    ch--;
            }
            //spaces
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");

            System.out.println();
        }



    }

    /* Pattern 18
    E
    D E
    C D E
    B C D E
    A B C D E
     */
    static void pattern18(int n){
        for (int i=0;i<n;i++){
            for(char ch= (char)('E' - i);ch<='E';ch++){
                System.out.print(ch+ " ");
            }
            System.out.println();
        }
    }

    /* Pattern 19
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     */
    static void pattern19(int n){
        int space=0;
        for(int i=0;i<n;i++){
            //stars
            for(int j=0;j<n-i;j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=space;j++)
                System.out.print(" ");
            //stars
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            space+=2;
            System.out.println();
        }
        // 2nd part
        int spaces=2*n-2;
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=spaces;j++)
                System.out.print(" ");
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            spaces-=2;
            System.out.println();
        }
    }

    /* Pattern 20
     *        *
     **      **
     ***    ***
     ****  ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *
     */
    static void pattern20(int n){
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n) stars=2*n-i;
            //stars
            for(int j=1;j<=stars;j++)
                System.out.print("*");
            //space
            for(int j=1;j<=space;j++)
                System.out.print(" ");
            //stars
            for(int j=1;j<=stars;j++)
                System.out.print("*");

            System.out.println();
            if(i<n) space-=2;
            else space+=2;
        }
    }

    /* Pattern 21
     ****
     *  *
     *  *
     ****
     */
    static void pattern21(int n) {
        for(int i=0;i<n;i++){
            //stars on boundaries
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    /* Pattern 22

     */
    static void pattern22(int n){

        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int bottom=(2*n-2)-i;
                System.out.print(n - Integer.min(Integer.min(top,bottom),
                        Integer.min(left,right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //n-i-1 - space
        // 2*i+1; - star
        // n-i-1 - space
        pattern22(n);
    }
}
