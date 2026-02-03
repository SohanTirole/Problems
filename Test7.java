//SELECTION SORT
class Test{
    public static void main(String[] args){


        int[] arr = {38,52,9,18,6,62,13};

        // for(int i=0 ; i<arr.length-1 ; i++){
        //     for(int j=i+1 ; j<arr.length; j++){
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        int min;
        for(int i=0 ; i<arr.length-1 ; i++){
            min = i;
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[min]>arr[j]){ 
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
    }
}