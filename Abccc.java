class Abc
{
int no;
void setvalue(int x)
{
no=x;
}
int getsquare()
{
return no*no;
}
Abc getinsatnce()
{
return this;
}
}
public class Abccc
{
public static void main(String x[])
{
new Abc.setvalue(10);
Abc a1=new Abc().getinsatnce();
a1.setvalue(5);
int res=a1.getinsatnce().getsquare();
System.out.println(""+res);
}
}
