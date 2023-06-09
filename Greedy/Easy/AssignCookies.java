package Greedy.Easy;
import java.util.Arrays;

//455.Assign Cookies
public class AssignCookies {

    public static void main(String[] args) {
        int[] child= {1,2};
        int[] cookie={1,2,3};
        int contentchildren=0;
        int i=0;
        Arrays.sort(child);
        Arrays.sort(cookie);

        for(int j=0;i<child.length && j<cookie.length;j++){
            if(cookie[j]>=child[i]){
                contentchildren++;
                i++;
            }
        }
        System.out.println(contentchildren);
    }
}
