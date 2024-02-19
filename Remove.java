public class Remove{
public static void main(String x[])
{
int a[]=new int[]{10,20,20,30,30,40,50,50};
int temp[]=new int[a.length];
int n=a.length;
int k=0;
for(int i=0;i<n;i++)
{
int flag=0;
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
flag=1;
break;

}
}
if(flag==0)
{
temp[k]=a[i];
k++;
}
}

for(int i=0;i<k;i++)
{
System.out.printf("%d",temp[i]);
}
}
}
