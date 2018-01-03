package shiyan5_4;

abstract class Employee
{
   public abstract double earnings();
}

class YearWorker extends Employee
{
	public double earnings()//重写earnings()方法，按年结算工资
	{
		return 100000;
	}
}

class MonthWorker extends Employee
{
	public double earnings()//重写earnings()方法，按月结算工资。
	{
		return 100000;
	}
}

class WeekWorker extends Employee
{
	public double earnings() //重写earnings()方法，按周结算工资。
	{
		return 100000;
		
	}
}

class Company
{
   Employee[] employee;
   double salaries=0;
   Company(Employee[] employee)
   {
      this.employee=employee;
   }
   
   public double salariesPay()
   {
      salaries=0;
     for(int i = 0; i<employee.length; i++) //计算salaries。
     {
    	 salaries = salaries + employee[i].earnings();
     }
      return salaries;
   }    
}
public class S3
{
   public static void main(String args[])
   {
      Employee[] employee=new Employee[20];
      for(int i=0;i<employee.length;i++)
       {
           if(i%3==0)
             employee[i]=new WeekWorker();
           else if(i%3==1)
             employee[i]=new MonthWorker();
           else if(i%3==2)
             employee[i]=new YearWorker();
       } 
     Company company = new Company(employee);
     System.out.println("公司年工资总额:"+company.salariesPay());
   }
}

