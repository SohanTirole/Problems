class Test {
    public static void main(String[] args){

        int[] arr = {7,6,5,4,3,2,1};
        System.out.println("Before Sorting");
        for(int a : arr){
            System.out.print(a+", ");
        }
          
        for(int i=1 ; i<arr.length ; i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j = j-1;
            }
            arr[j] = temp;
        }

        System.out.println("\nAfter Sorting");
        for(int a : arr){
            System.out.print(a+", ");
        }
    }
}