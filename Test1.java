//Prim number 1 to 100



class Test{
    public static void main(String[] args){
        //System.out.println("Hello this my first program");

        int n=0;
        for(int i=1; i<=100 ; i++){
            int count = 0;
            for(int j=i ; j>0 ; j--){
                if(i%j==0){
                    count++;
                    
                }
            }
            if(count==2){
                System.out.println(i);
                n++;
            }

        }
        System.out.println("Count of prime number : "+n);
    }
}