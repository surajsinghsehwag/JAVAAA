//1). WAP to create the class name as Circle with a following methods
import java.util.*;
class Circle
{
private float r,area,pi=3.14f;

public void setRadius(float radius)//accept the radius
{
	r=radius;
}
void showArea()
{ 
    area=pi*r*r;
System.out.println("Area of circle"+area);	//write here calculation logics of circle area and display it
}
}
public class Area
{
public static void main(String x[])
{
Scanner xyz=new Scanner(System.in);
float b=xyz.nextInt();
Circle c=new Circle();
c.setRadius(b);
c.showArea();

//create here object of scanner and accept the radius as input
//create the object of area and call setRadius and pass radius input as parameter
//call showArea() for display the display the area
}
}