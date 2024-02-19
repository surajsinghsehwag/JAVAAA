//6.WAP to create the class name as InsertArrayEle with a following methods class InsertArrEle
import java.util.*;
 class InsertArrayEle
{ int c[];
    Scanner xyz = new Scanner(System.in);

void setIntArray(int ch[])
{ c=ch;
}

void insertValueOnIndex()
{ 
int i;
int index;
int value;
System.out.println("enter value and index ");
index=xyz.nextInt();
value=xyz.nextInt();
for( i=c.length-1;i>index;i--)
{
	c[i]=c[i-1];
}
	
c[i]=value;

for( i=0;i<c.length;i++)
{System.out.println("\t"+c[i]);//
	//here we need to write the manual logics for inserting value on specified index in arr }
} 
}
}
public class InsertArrEle{
	public static void main(String x[])
	{
		
	int a[]=new int[8];
	Scanner xyz=new Scanner(System.in);
	for(int i=0;i<7;i++)
	{
		a[i]=xyz.nextInt();
	}
	//here create the array with 6 six size and store only five value in it using scanner //


InsertArrayEle i1= new InsertArrayEle();
i1.setIntArray(a);
i1.insertValueOnIndex();//create the object of InsertArrEle class
//call the setIntArray function
//call the insertValueOnIndex() and write the manual logics
}
}