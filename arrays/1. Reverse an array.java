class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1; i >= 0;i--){
            sb.append(str.charAt(i));
        }
        
        return sb.toString();
    }
}
