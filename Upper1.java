//5. create the class name as ConvertToUpper with a following methods
class ConvertToUpper
{ char c[]=new char[10];
void setCharArray(char ch[])
{ //here accept the character array and store in instance variable in character array
for(int i=0;i<c.length&&ch.length;i++)
{
c[i]=ch[i];
}
}
void convertToUpperCase()
{ 
 for (int i = 0; c[i] != '\0'; i++)
	 {
        if (c[i] >= 'a' && c[i] <= 'z') {
            c[i] = c[i] - ('a' - 'A');
        }
	 }//here we need to write the manual logics for converting lower case array
//to upper case
System.out.print("Uppercase equivalent: ");
        for (int i = 0; i < c.length && c[i] != '\0'; i++) {
            System.out.print(c[i]);
}
	 
}
public class Upper1
{
public static void main (String x[])
{
char chh[]=new char[]{'g','o','o','d'};
ConvertToUpper c1=new ConvertToUpper();
c1.setCharArray(chh);
c1.convertToUpperCase();
}
}
//here declare the fix array with a some character e.g char ch[]=new char[]={"good"}; //here create

//call setCharArray() function and pass ch array in setCharArray() function
//call convertToUpperCase() function and see the result