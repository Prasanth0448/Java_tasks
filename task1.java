//sort the numbers in odd position i ascending order and numbers in even position in descending order

Input:26 18 03 34 50 11
Output:03 26 50 34 18 11


import java.util.*;
class Solution {
    public static int[] sortEvenOdd(int[] nums) {
       int len = nums.length;
       var even = new int[len / 2];
       var odd = new int[len - len / 2];

    int j = 0, k = 0;
    for(int i = 0; i < len; i ++) {
        if(i % 2 == 0) odd[j ++] = nums[i];
        else even[k ++] = nums[i]; 
    }
    Arrays.sort(even); Arrays.sort(odd);
    for(int i = 0; i < odd.length; i ++) {
      nums[i] = odd[i] ;
    }
    int m = odd.length ;
    for(int l = even.length-1; l >=0 ; l--) {
      nums[m++] = even[l];
    }
    return nums;
    }
    public static void main(String args[]){
        int n;  
        Scanner sc=new Scanner(System.in);  
        n=6;
    var res = new int[6];
    int[] array = {26,18,03,34,50,11};
    res = sortEvenOdd(array);
   for(int i=0; i<n; i++)   
    {  
    System.out.print(res[i]+" ");  
    }  
}
}
