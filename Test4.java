class Test4{
    public static void main(String[] args){

        int a = -1;
        int b = 1;
        int c = 0,i=0;

        while(i<=10){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
    }
}