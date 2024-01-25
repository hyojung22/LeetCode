class Solution {
    public boolean isPalindrome(String s) {
        
        String s2 = s.replaceAll("[^A-Za-z0-9]" , "").toLowerCase();
        String s3 = new StringBuilder(s2).reverse().toString();
        
        return s2.equals(s3);
        
     
        
    }
}