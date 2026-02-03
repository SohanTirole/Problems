//   BUBBLE SHORT
class Test{
    public static void main(String[] args){
        int[] arr = {1,3,2,4,6,5,32,1,34,27,95};
        int i=0;


        System.out.println("Original Array");
        for( i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n");
        for(i=0 ; i<arr.length-1 ; i++){
            int flag = 0;
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag==0)
                break;
        }


        System.out.println("Sorted Array");
        for( i = 0; i<arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
    }
}