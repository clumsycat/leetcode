public class Solution {
    public String reverseString(String s) {
        char[] array=s.toCharArray();
        int start = 0;
        int end = array.length-1;
        while(start<end){
            char temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        return new String(array);
    }
}