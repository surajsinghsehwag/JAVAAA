/*Assignment 2 : Sort an array of 0s, 1s and 2s
Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
Example 1:
Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s  1s and 2s are segregated  into ascending order. */
import java.util.*;
public class Sortingg
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner (System.in);
		System.out.println("enter the size of array the arary");
		int n=xyz.nextInt();

		int a[]=new int[n];// we check dynamicall also after 
System.out.println("recived the arary");
for(int i=0;i<n;i++)
{
	a[i]=xyz.nextInt();
}

int j=0;
int temp[]=new int[n];

for(int i=0;i<n;i++)
{
if(a[i]==0 || a[i]==1 || a[i]==2)
{
 temp[j]=a[i];
j++;
}
}

for(int i=0;i<j;i++)
{
	System.out.println(""+temp[i]);
}
	}
}

