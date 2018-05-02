package com.test.demo;

/**
 * @author ：qixuewei@jinlianchu.com
 * @Description ：
 * @ClassName ：Demo5
 * @date ：2018/4/11 22:26
 */
public class Demo5 {

	public static void main(String[] args) {

		int [] arr ={1,2,3,7,14,5,6,4};
		/*for (int a=0;a<arr.length-1;a++){

			for (int b=a+1;b<arr.length;b++){

				if (arr[a]+arr[b]==5) {
					System.out.println(arr[a]);
					System.out.println(arr[b]);
				}
			}
		}*/

		//选出最小的
		System.out.println("交换之前：");
		for(int num:arr){
			System.out.print(num+" ");
		}
		//选择排序的优化
		for(int i = 0; i < arr.length - 1; i++) {// 做第i趟排序
			int k = i;
			for(int j = k + 1; j < arr.length; j++){// 选最小的记录
				if(arr[j] < arr[k]){
					k = j; //记下目前找到的最小值所在的位置
				}
			}
			//在内层循环结束，也就是找到本轮循环的最小的数以后，再进行交换
			if(i != k){  //交换a[i]和a[k]
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
			}
		}
		System.out.println();
		System.out.println("交换后：");
		for(int num:arr){
			System.out.print(num+" ");
		}
	}
}
