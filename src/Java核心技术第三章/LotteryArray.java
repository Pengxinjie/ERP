package Java���ļ���������;

/**
 * ��ӡ����������
 * Java�еĶ�ά���� -->����C�����е�ָ������   �����е�ÿ��Ԫ������һ��ָ�룬ָ��ͬ�����飬�ҳ��ȿ��Բ�ͬ
 * 1                     
 * 1	1
 * 1	2 	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1	5	10	10	5	1
 * cn0  cn1 cn2 cn3 cn4
 *��n-k+1��!/k!
 *
 *һ.��������
 *��.��ʼ������
 */

public class LotteryArray {
	public static void main(String[] args) {
		final int NMAX=10;//���峣��
		
		int [][]arr1=new int[NMAX+1][];
		//��������һά����Ĵ�С
		for (int i = 0; i < NMAX+1; i++) {
			arr1[i]=new int[i+1];//��0����1��Ԫ�أ���һ����2��Ԫ�أ��Դ�����
		}
		
		for (int n = 0; n < arr1.length; n++) {//iȡ0��10
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
