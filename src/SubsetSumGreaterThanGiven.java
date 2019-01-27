import java.util.Arrays;

public class SubsetSumGreaterThanGiven {
	public static void main(String[] args) {
		int[] arr={2,5,1,3,4};
		int k = 4;
		Arrays.sort(arr);
		int j = arr.length;
		int len=0;
		int left = 0;
		int right = j-1;
		while(left<right){
			if(arr[right]<=k){
				len++;
			}else{
				right--;
			}
			
			if(arr[right]+arr[left]<=k){
				len++;
			}else{
				right--;
			}
		}
		System.out.println(len);
		
	}
}
