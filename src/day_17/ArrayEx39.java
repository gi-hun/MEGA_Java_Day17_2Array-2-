package day_17;

//# 2�����迭 �⺻����[1�ܰ�]

public class ArrayEx39 {
	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j] = 10 *k;
				k++;
				System.out.print(arr[i][j] + " ");
				
			}
		}
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		System.out.println();
		int sum = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		        sum = sum + arr[i][j];
			}
		}
		System.out.println("sum = " + sum);
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80 
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		        if(arr[i][j]%4 == 0)
		        {
		        	System.out.print(arr[i][j] + " ");
		        }
			}
		}
		
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		System.out.println();
		sum = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		        if(arr[i][j]%4 == 0)
		        {
		        	sum = sum + arr[i][j];
		        }
			}
		}
		System.out.println("sum = "+sum);
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		int count = 0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
		        if(arr[i][j]%4 == 0)
		        {
		        	count++;
		        }
			}
		}
		System.out.println("count = " + count);
	}
}
