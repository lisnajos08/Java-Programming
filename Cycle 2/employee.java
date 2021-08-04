import java.util.Scanner;
public class Employee
{
public static void main(String[] args)
{
int count,flag = 0, i;
Scanner scan = new Scanner(System.in);
System.out.print("How many employees information you want enter :");
count = scan.nextInt();
String eName[] = new String[count];
int eSalary[] = new int[count];
int eNo[] = new int[count];
Scanner scan2 = new Scanner(System.in);
Scanner scan3 = new Scanner(System.in);
Scanner scan4 = new Scanner(System.in);

for( i = 0; i < count; i++)
{
System.out.println("Enter the eNo of Employee "+(i+1)+ ":");
eNo[i] = scan2.nextInt();

System.out.println("Enter the name :");
eName[i] = scan3.nextLine();
System.out.println("Enter the salary :");
eSalary[i] = scan4.nextInt();
}
Scanner s = new Scanner(System.in);
System.out.print("Enter the employee number you want to find:");
int x = s.nextInt();
for( i = 0; i < count; i++)
{
if(eNo[i] == x)
{
flag = 1;
break;
}
}
if(flag == 1)
{
int t = i;
System.out.println("Employee id "+x+" found");
System.out.println("Employee name : "+eName[t]);
System.out.println("Employee salary : "+eSalary[t]);
}
else
{
System.out.println("Employee id not found");
}

scan.close();
scan2.close();
scan3.close();
scan4.close();
s.close();
}
}