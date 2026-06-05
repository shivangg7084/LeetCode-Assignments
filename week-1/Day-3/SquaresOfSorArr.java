public class SquaresOfSorArr {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i =0, j=n-1, k =n-1;

        while(i<=j){
            int square = arr[i]*arr[i];
            int square1 = arr[j]*arr[j];
            if(square>square1){
                ans[k]= square;
                i++;
            }else{
                ans[k]=square1;
                j--;
            }
            k--;
        }
        return ans;
    }
}

