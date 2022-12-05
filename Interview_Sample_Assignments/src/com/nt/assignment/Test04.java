package com.nt.assignment;
								// Problem 4
public class Test04 {

    // Function to find the minimum sum
    public static int findMinRec(int arr[], int i, int sumCalculated,int sumTotal) {
        if (i == 0)
            return Math.abs((sumTotal - sumCalculated)
                            - sumCalculated);
 
        return Math.min(
            findMinRec(arr, i - 1,
                       sumCalculated + arr[i - 1],
                       sumTotal),
            findMinRec(arr, i - 1, sumCalculated,
                       sumTotal));
    }//findMinRec
 
    // Returns minimum possible difference between sums of two subsets
    public static int findMin(int arr[], int n) {
        // Compute total sum of elements
        int sumTotal = 0;
        for (int i = 0; i < n; i++)
            sumTotal += arr[i];
 
        // Compute result using recursive function
        return findMinRec(arr, n, 0, sumTotal);
    }//findMin

    public static void main(String[] args) {
        int arr[] = { 1,2,2,4 };
        int n = arr.length;
        System.out.print("The minimum difference"
                         + " between two sets is "
                         + findMin(arr, n));
    }//main
}//class
