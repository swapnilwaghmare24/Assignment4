public class EmployeeWages
{
public static void main(String[] args)
{
final int FULL_TIME=1;
final int PART_TIME=2;
final int WAGE_PER_HOUR=20;
final int FULL_DAY_HOUR=8;
final int HALF_DAY_HOUR=4;	

System.out.println("Welcome to employee wage computation program");
int empStatus=(int)(Math.random()*3);
System.out.println(empStatus);
int empHours=0;
int employeeWage=0;
switch(empStatus)
{
	case FULL_TIME:
	System.out.println("Employee is present full time");
	empHours=FULL_DAY_HOUR;
	break;
	case PART_TIME:
	System.out.println("Employee is present half day");
	empHours=HALF_DAY_HOUR;
	break;
	default:
	System.out.println("Employee is absent");
}
employeeWage=empHours*WAGE_PER_HOUR;
System.out.println("Employee Wage is $ "+employeeWage+" USD");
}
}