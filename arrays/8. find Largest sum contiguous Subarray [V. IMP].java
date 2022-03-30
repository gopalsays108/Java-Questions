class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        // Your code here
        long currBest = arr[0];
        long overBest = arr[0];
        
        for(int i = 1; i< n;i++){
            long temp = currBest + Long.valueOf(arr[i]);
            if(temp > Long.valueOf(arr[i])){
               currBest += Long.valueOf(arr[i]);
            }else{
               currBest = Long.valueOf(arr[i]);
            }
            overBest = Math.max(currBest, overBest);
        }
        
        return overBest;
    }
}
