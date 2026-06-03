public class MoveZeroes {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int j=0;
        for(int i =0; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
    }

}


