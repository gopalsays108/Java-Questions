//In O(n) time
class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int[] arr = new int[n+m];
        int one = 0;
        int two = 0;
        int index = 0;
        while(one <n && two <m){
            if(arr1[one] < arr2[two]){
                arr[index] = arr1[one];
                index++;
                one++;
            }else{
                arr[index] = arr2[two];
                index++;
                two++;   
            }
        }
        
        while(one < n){
                arr[index] = arr1[one];
                index++;
                one++;
        }
          while(two < m){
                arr[index] = arr2[two];
                index++;
                two++;
        }
        System.out.print(Arrays.toString(arr));
    }
}
