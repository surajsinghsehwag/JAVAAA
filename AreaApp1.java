//3. WAP to create the class Employee with a following methods
import java.util.*;
class Employee
{
	private String name;
	private int id;
	private int basicSal;
	int totalsal;
int incresCal;
int progress;
	
	
 void setPersonalInfo(String name,int id,int basicSal)

{
this.name=name;
this.id=id;
this.basicSal=basicSal;
int progress;
	//in this function we need to store name ,id and basicSal in instance variable
}
void setProgressPer(int progress)
{ 
this.progress=progress;

if(progress>60)
{
	incresCal=(int)(basicSal*0.3);
	totalsal=basicSal+incresCal;//if progress value is greater than 60 per then increase the basic salary of
//employee with 30 percentage
}
}
void show()
{
	if(progress>60)
	{
	System.out.printf("name %s\n id %d\n %d basicSal %d\n incresCal %d\n totalsal",name,id,basicSal,incresCal,totalsal);
	}
		//in this function we need to show the all details of employee like as
//name id and basic salary as well as incremental salary and total salary of employee
else
			System.out.printf("name %s\n id %d\n basicSal %d\n",name,id,basicSal);

	
}
}

public class AreaApp1
{
public static void main(String x[])
{ 
Scanner xyz=new Scanner(System.in);
System.out.println("enetr progress value");
   int p=xyz.nextInt();     
String n;
int id;
int sal;
System.out.println("enetr the name\t and id\t sal");
xyz.nextLine();
n=xyz.next();
id=xyz.nextInt();
sal=xyz.nextInt();
 Employee e=new Employee();
e.setPersonalInfo(n,id,sal);
e.setProgressPer(p);
e.show(); // here create the object of Scanner class and accept the name id and basic salary as well
                 //progress per value not need to calculate it by using formual directly enter e.g 70
                            //means 70%
                  //create the object of Employee class and call setPersonalInfo and pass name id and salary
// in it as well as setProgressPer() and pass progress value in it
//call the show() method of Employee class.
}
}