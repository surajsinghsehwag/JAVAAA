//2.Create the Class Name as Rectangle with a following methods and write its logics.
import java.util.*;
class Rectangle{
private int len,wid,area;
 void setLengthWidth(int len,int wid)//accept the radius
{
	this.len=len;
	this.wid=wid;
}
void showArea()
{ 
area=2*(len+wid);
System.out.println("area of rectangle\t"+area);//write here calculation logics of circle area and display it
}
}
public class AreaApp
{
	public static void main(String x[])
{ Scanner xyz= new Scanner(System.in);
int a,b;
System.out.println("enter len and breadth");
a=xyz.nextInt();
b=xyz.nextInt();
Rectangle r=new Rectangle();
r.setLengthWidth(a,b);
r.showArea();

	//create here object of scanner and accept the length and width as input
//create the object of Rectangle and call setLengthWidth and pass radius input as parameter
//call showArea() for display the display the area
}
}	