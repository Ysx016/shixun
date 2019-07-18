package paixu;

import java.util.Arrays;

public class Xuanze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {84,83,88,87,61};
		for(int i=0;i<nums.length;i++) {
			int minIndex=i;
			for(int j=i;j<nums.length;j++) {
				if(nums[i]<nums[minIndex]) {
					minIndex=j;}
			}
			int temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}System.out.println(Arrays.toString(nums));
	}
}
