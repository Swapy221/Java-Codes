public class Main
{
	public static void main(String[] args) {
		int arr[]={4,5,1,2,3,7};
		for(int i =0;i<arr.length-1;i++){
		    
		for(int j =i;j<arr.length;j++){
		    if(arr[i]<arr[j]){
		        int temp = arr[i];
		        arr[i]=arr[j];
		        arr[j]=temp;
		    }
		}
		
		    
		}
		for(int a:arr){
		    System.out.print(a+" ");
		}
		    
		
	}
}
