
//Order matter
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here

        int ind  = 0;
        int[] arr2 = new int[n];
        
        for(int i = 0;i < arr.length; i++){
            int num = arr[i];
            if(num >= 0){
                arr2[ind] = num;
                ind++;
            }
        }
        
         for(int i = 0;i < arr.length; i++){
            int num = arr[i];
            if(num < 0){
                arr2[ind] = num;
                ind++;
            }
        }
        
        for(int i =0;i<arr.length;i++){
            arr[i] = arr2[i];
        }
    }
    
    public void swap(int[] arr, int left, int right){
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}

/*
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
*/
