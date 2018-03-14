package com.cn.sort;

import java.util.Random;

public class QuickQort {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		for (int i : arr) {
			System.out.print("");
			System.out.print(i);
		}
		System.out.println();
		sort(0,99,arr);
		for (int i : arr) {
			System.out.print(" ");
			System.out.print(i);
		}
	}
	private static void sort(int start,int end,int[] arr){
		if(start > end){
			return;
		}
		int middle = getMiddle(start,end,arr);
		sort(start,middle-1,arr);
		sort(middle + 1,end,arr);
	}

	private static int getMiddle(int start, int end, int[] arr) {
		int base = arr[0];
		int left = start + 1;
		int right = end;
		while(true){
			while(right > start && arr[right] >= base){
				right--;
			}
			if(right == start){
				break;
			}
			while(left <= end && arr[left] <= base){
				left++;
			}
			if(left < right){
				int a = arr[left];
				arr[left] = arr[right];
				arr[right] = a;
			}else{
				arr[start] = arr[right];
				arr[right] = base;
				break;
			}
		}
		return right;
	}
}
