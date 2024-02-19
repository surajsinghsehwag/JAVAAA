//wap to create class name as power with two fumctions 
class Power1{
int b,index;
int p=1;
void setvalue(int x,int y)
{
b=x;
index=y;
}
int getpower()
{
for(int i=1;i<=index;i++)
{
p=p*b;
}
return p;
}
}
public class Power{
public static void main(String x[])
{
Power1 p1=new Power1();
p1.setvalue(5,3);
int res= p1.getpower();
System.out.println(""+res);
}
}
