import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Stron Number
        int temp = n;
        int res=0;
        while(temp>0){
            int rem = temp%10;
            res = rem*rem*rem + res;
            temp = temp/10;
        }
        if(res == n)
            System.out.println(res+" is Strong Number");
        else
            System.out.println(res+" is not a Strong Number");
    }
}