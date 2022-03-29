//In this order doesnt matter
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int right = arr.length - 1;
        int left  = 0;

        while(left <= right){
            int r = arr[right];
            int l = arr[left];
            
            if(r < 0 && l >0){
                right--;
                left++;
            }else if(l > 0 && r > 0){
                left++;
            }else if(l < 0 && r < 0){
                right--;
            }else{
                swap(arr, left,right);
                right--;
                left++;
            }
            
            System.out.println(Arrays.toString(arr));
        }
    }
    
    public void swap(int[] arr, int left, int right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}
