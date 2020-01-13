package Java核心技术第三章;

/**
 * 打印不规则数组
 * Java中的二维数组 -->类似C语言中的指针数组   数组中的每个元素亦是一个指针，指向不同的数组，且长度可以不同
 * 1                     
 * 1	1
 * 1	2 	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1	5	10	10	5	1
 * cn0  cn1 cn2 cn3 cn4
 *（n-k+1）!/k!
 *
 *一.创建数组
 *二.初始化数组
 */

public class LotteryArray {
	public static void main(String[] args) {
		final int NMAX=10;//定义常量
		
		int [][]arr1=new int[NMAX+1][];
		//决定各个一维数组的大小
		for (int i = 0; i < NMAX+1; i++) {
			arr1[i]=new int[i+1];//第0行有1个元素，第一行有2个元素，以此类推
		}
		
		for (int n = 0; n < arr1.length; n++) {//i取0到10
			for (int k = 0; k < arr1[n].length; k++) {
				int temp=1;
				
				for (int i = 1;i<=k; i++) {
					temp=temp*(n-i+1)/i;
				}
				arr1[n][k]=temp;
			}
		}
		 
		for (int[] row : arr1) {
			for (int odd : row) {
				System.out.printf("%4d",odd);
			}
			System.out.println();
		}
		
	}
}
