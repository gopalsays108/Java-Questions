class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        
        /*Methods 1 known as 
         Dutch National flag algorithm
         TC: O(N)
         Space:O(3)
         
        */
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid <= high){
            switch(a[mid]){
                case 0:
                    swap(a,low,mid);
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a,mid,high);
                    high--;
                    break;
            }
        }
        
    }
    
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
        
//---------------------------------------------------------------------------------------------
        
        /*Methods Two 
         TC: O(n) +  O(n) => O(2n)
         Space: O(3) aux
  
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        for(int i =0; i<n;i++){
            int curr = a[i];
            if(curr == 0) count0++;
            else if (curr == 1) count1++;
            else count2++;
        }
        // 0-2 1-1 2-2
        
        for(int i = 0;i <count0;i++){
            a[i] = 0;
        }
        
        
        for(int i = count0;i < (count1 + count0);i++){
            a[i] = 1;
        }
        
        
        for(int i = count1+count0;i < n;i++){
            a[i] = 2;
        }
        */
        
//---------------------------------------------------------------------------------------------
        
        /* Methdos 3 Use .sort methods from Arrays
            Arrays.sort(a);
        */
    //}
}
