package in.dropcodes;
/*

Author : Sagar D B (iamSagarDB)
github: https://github.com/iamsagardb

Problem 905. Sort Array By Parity

Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

Example 1:
Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Note:
1 <= A.length <= 5000
0 <= A[i] <= 5000
 */

public class P905_Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] res = sortArrayByParity(new int[]{2,5,8,7});
        for (int x : res){
            System.out.print(x+" ");
        }
    }
    // LeetCode Function
    public static int[] sortArrayByParity(int[] A) {
        for(int i = 0 ; i < A.length ; i++ ){
            for(int j = 0 ; j < A.length; j++){
                if(A[j] % 2 != 0){
                    int temp = 0;
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    temp = 0;
                }
            }
        }
        return A;
    }
}
