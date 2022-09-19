package Study;

import java.util.Arrays;

public class BubbleSort {	//如果一次循环,数据位置没有发生改变则已经排好序,break结束循环减少次数
	public static void sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			boolean sorted=true;
			for (int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					sorted=false;
					}
				}
		if(sorted) {
			break;
		}
	
	}
		System.out.println(Arrays.toString(arr));
}


	public static void main(String[] args) {
		int[] arr ={9,6,8,5,7};	
		sort(arr);
	}

}
