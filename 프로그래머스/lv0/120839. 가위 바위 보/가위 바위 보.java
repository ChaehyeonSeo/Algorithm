import java.util.*;
class Solution {
    public String solution(String rsp) {
        String arr[] = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("2")) {
                sb.append("0");
            } else if(arr[i].equals("0")) {
                sb.append("5");
            } else if(arr[i].equals("5")) {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}