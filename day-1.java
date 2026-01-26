import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] arr = A.toCharArray();
        int right = (arr.length)-1;
        int left = 0; 
        boolean res = true;
        while(left<right){
            if(arr[left]!=arr[right])
                res = false;
            left++;
            right--;
        }    
        if(res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}



