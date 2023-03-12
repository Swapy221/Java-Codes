class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int count =0,j=0,ans=-1;
        for(int[] a : arr){
            int idx=binary(a,m);
            int numberOfOnes=m-idx;
            // count=Math.max(count,m-idx);
            if(count<numberOfOnes){
                count =numberOfOnes;
                ans=j;
            }
            
            if(idx == 0){
            
                return j;
            }
                j++;
        }
        return ans;
        
    }
        int binary(int arr[],int m){
        int s =0;
        int e=m-1,res=m;
        while(s<=e){
            int mid=(s+e)/2;
        
            if(arr[mid]==1){
                res=mid;
                e=mid-1;
            }
            else if(arr[mid]<1) {
                s=mid+1;
                
            }
            else{
                e= mid-1;
            }
            
        }
        return res;
    }
}
