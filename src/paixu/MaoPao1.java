package paixu;

import java.util.Arrays;

public class MaoPao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {84,83,88,87,61};
		for(int i=0;i<(nums.length-1);i++) {
			for(int j=0;j<(nums.length-i-1);j++)
				if(nums[j]>nums[j+1]) {
					int m=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=m;
				}else {
					continue;
				}
			
		}
		System.out.println(Arrays.toString(nums));
	}

}
