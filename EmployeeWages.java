public class EmployeeWages
{
public static void main(String[] args)
{
final int EMPLOYEE_PRESENT=1;
final int WAGE_PER_HOUR=20;
final int FULL_DAY_HOUR=8;	
System.out.println("Welcome to employee wage computation program");
int empStatus=(int)(Math.random()*2);
System.out.println(empStatus);
int empHours=0;
int employeeWage=0;
if(empStatus==EMPLOYEE_PRESENT)
{
	System.out.println("Employee is present");
	empHours=FULL_DAY_HOUR;
}
else
{
	System.out.println("Employee is absent");
}
employeeWage=empHours*WAGE_PER_HOUR;
System.out.println("Employee Wage is $ "+employeeWage+" USD");
}
}