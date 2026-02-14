
import java.util.Scanner;
class Test{
    int linearSearch(int[] arr, int x){
        int i=0;
        while(i<arr.length){
            if(arr[i]==x)
                return 1;

            i++;
        }        
        return -1;
    }
    
    public static void main(String[] args){
        //Linear Search
        Scanner sc = new Scanner(System.in);
        int[] arr = {34,23,7,54,22,68,21,23,78,8,27,9};
        System.out.println("Enter a number which you want to find");
        int n = sc.nextInt();

        int res =new Test().linearSearch(arr, n);
        if(res==-1)
            System.out.println("Given Element is not present in Array");
        else if(res==1)
            System.out.println("Given Element is present in Array");
    }   
}