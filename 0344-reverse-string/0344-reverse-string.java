class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        
        // 중앙으로 이동해 나가다 겹치는 지점에서 종료
        while(start < end){
            // 임시 변수
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            
            // 앞쪽 문자는 한 칸 뒤로, 뒤쪽 문자는 한 칸 앞으로 이동
            start++;
            end--;
        }
        
    }
}