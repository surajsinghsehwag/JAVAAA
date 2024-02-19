//8.WAP to create the class name as Seller with a following functions
import java.util.Scanner;
class Seller
{int sp,cp;
float profit,loss;
int total,sum;
void acceptSellingCostPrice(int sp,int cp)
{ 
this.sp=sp;
this.cp=cp;
}//here we need to store the sp and sp values in instance variable }
void showProfitLoss()
{ 
if(cp>sp)
{
	loss=cp-sp;
	System.out.println("loss\t"+loss);//here we need to write the logics for profit and loss
}
else
{
	profit=sp-cp;
	System.out.println("profit\t"+profit);
}
}
}
class SI
{
	public static void main(String x[])
	{
		Scanner r=new Scanner(System.in);
		System.out.println("enter cp and sellin price ");
		int c=r.nextInt();
		int s=r.nextInt();
		Seller s1=new Seller();
		s1.acceptSellingCostPrice(s,c);
		s1.showProfitLoss();
		
	
		
//create the object of Seller class
//call its acceptSellingCostPrice function and pass two values in it
//call the showProfitLoss() function
}
}