package Array;
/*
 * LeetCode : 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * 
 */

public class removeDuplicateSortedArray {
    
        public int removeDuplicates(int[] arr) {
            int i=1,k=1,n=arr.length;
            while(i<n){
                if(arr[i-1]!=arr[i]){
                    arr[k]=arr[i];
                    k++;
                }
                i++;
    
            }
            return k;
    
        }
    }

