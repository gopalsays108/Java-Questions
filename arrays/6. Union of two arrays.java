class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> st = new HashSet<>();
        
        for(int i =0; i<n;i++){
            st.add(a[i]);
        }
        
        
        for(int i =0; i<m;i++){
            st.add(b[i]);
        }
        
        return st.size();
    }
}
