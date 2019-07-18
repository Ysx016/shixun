package paixu;

import java.util.Arrays;

public class Charu {

	public static void main(String[] args) {
		int[] nums= {84,83,88,87,61};
		for(int i=1;i<nums.length;i++) {
			for(int j=i;j>0;j--) {
				if(nums[j]<nums[j-1]) {
					int temp=nums[j-1];
					nums[j-1]=nums[j];
					nums[j]=temp;
					
				}else {
					continue;
				}
			}
		}System.out.println(Arrays.toString(nums));
	}
}
