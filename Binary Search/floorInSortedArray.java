/* 
Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined
 as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

 */
class Solution {

    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x) {
        int s = 0, result = -1;
        int e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                s = mid + 1;
                result = mid;
            } else {
                e = mid - 1;
            }
        }
        return result;
    }

}
