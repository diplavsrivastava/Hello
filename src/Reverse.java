
public class Reverse {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9};
	for(int index=0;index<arr.length;index=index+3*2){
		int end = Math.min((index+3)-1, arr.length-1);
		reverse(arr,index,end);
	}
	System.out.println(arr);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
	}
}

private static void reverse(int[] arr,int start,int end){
	int left = start;
	int right = end;
	int temp = 0;
	while(left<right){
		temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		right--;
		left++;
	}
}
}
