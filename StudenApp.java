//4. WAP to create the class name as Student with a following methods
import java.util.*;
class Student
{
int marks[]=new int[5];

float per;
int sum=0;


 void setSubMarks(int s[])
{
for(int i=0;i<marks.length;i++)
{
marks[i]=s[i];
System.out.println(""+marks[i]);	//here we need to store the array in instance variable
}
}
void calculatePer()
{
for(int i=0;i<marks.length;i++)
{sum=sum+marks[i];
}
per = (float) sum / 500 * 100;
	//here we need to call the aggregate of six subjects marks through the array and calculate its per and store in instance variable.
}
void checkGrades()
{
if(per>75&&per<=100)
{System.out.println("Student is distinct");
}
else if(per>60&&per<=75)

{System.out.println("Student is first divsison");
}
else if(per>=50&&per<=60)

	{System.out.println("Student is 2nd dicsion");
	}
	else if(per>40&&per<=50)
	
		{
			System.out.println("Student is Third");
		}
		else
		{System.out.println("Student is fail");
		}



	
	//here we need to check grades means per>75 && per<=100 then student in distinction if per>60 &&per<=75 then in first division if per>=50 && per<=60 then second division and if per>40 && per<=50then in third division and if per <40 then student failed
}
}
public class StudenApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		int st[]=new int[5];
			
				for(int i=0;i<st.length;i++)
				{
					st[i]=xyz.nextInt();
					
					if(st[i]>100 ||st[i]<0)
					{
						                System.out.println("Marks should be between 0 and 100. Enter valid marks.");
										i--;
					}

					
					
				}
				Student s=new Student();
				s.setSubMarks(st);
				s.calculatePer();
				s.checkGrades();
			
			
	}
}


			