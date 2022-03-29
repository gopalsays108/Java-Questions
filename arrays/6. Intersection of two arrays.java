class Solution {
    public int[] intersection(int[] nums1, int[] num2) {
        Set<Integer> st = new HashSet<>();
        for(int i: nums1){
            st.add(i);
        }
        
        Set<Integer> st2 = new HashSet<>();

        for(int i: num2){
            if(st.contains(i)){
                st2.add(i);
            }
        }
        
        int[] res = new int[st2.size()];
        int in= 0;
        for(int i : st2){
            res[in++] = i;
        }
        return res;
    }
}
