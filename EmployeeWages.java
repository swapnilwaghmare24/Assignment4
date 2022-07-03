public class EmployeeWages
{
public static void main(String[] args)
{
final int EMPLOYEE_PRESENT=1;	
System.out.println("Welcome to employee wage computation program");
int empStatus=(int)(Math.random()*2);
System.out.println(empStatus);
if(empStatus==EMPLOYEE_PRESENT)
{
	System.out.println("Employee is present");
}
else
{
	System.out.println("Employee is absent");
}
}
}