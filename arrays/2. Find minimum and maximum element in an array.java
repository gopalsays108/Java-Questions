//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code 
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        
        for(int i = 0;i<n;i++){
            long curr = a[i];
            if(curr > max) max = curr;
            if(curr < min) min = curr;
        }
         
        return new pair(min,max);
    }
}
