public class EmployeeWages
{
public static void main(String[] args)
{
final int FULL_TIME=1;
final int PART_TIME=2;
final int WAGE_PER_HOUR=20;
final int FULL_DAY_HOUR=8;
final int HALF_DAY_HOUR=4;	
final int TOTAL_WORKING_DAY=20;
final int TOTAL_WORKING_HOURS=100;

//System.out.println("Welcome to employee wage computation program");
int day=1;
int hours=0;
int totalWages=0;
while(day<=TOTAL_WORKING_DAY && hours<=TOTAL_WORKING_HOURS)
{
int empHours=0;
int employeeWage=0;
int empStatus=(int)(Math.random()*3);
//System.out.println(empStatus);
switch(empStatus)
{
	case FULL_TIME:
	//System.out.println("Employee is present full time");
	empHours=FULL_DAY_HOUR;
	break;
	case PART_TIME:
	//System.out.println("Employee is present half day");
	empHours=HALF_DAY_HOUR;
	break;
	default:
	//System.out.println("Employee is absent");
}
hours+=empHours;
employeeWage=empHours*WAGE_PER_HOUR;
totalWages+=employeeWage;
//System.out.println("Day number "+day);
//System.out.println(hours);

//System.out.println("<-------------------------------------------------->");
day++;
}
System.out.println("Monthly Employee Wage is $ "+totalWages+" USD");
}
}