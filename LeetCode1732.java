import java.util.*;
class LeetCode1732 {
    public int largestAltitude(int[] gain) {
        int altitudes=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            altitudes+=gain[i];
            max=Math.max(max,altitudes);
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={-5,1,5,0,-7};
        LeetCode1732 s=new LeetCode1732();
        System.out.println(s.largestAltitude(arr));
    }
}