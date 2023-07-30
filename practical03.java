 package com.mycompany.excer31;
public class Employee 
{
    // private instance variables
  private String name;
  private int age;
  private double salary;

  // getters and setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }


}
package com.mycompany.excer31;
public class Excer31
{

    public static void main(String[] args)
    {
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setAge(30);
        employee.setSalary(100000);
    }
}
//Now modify the same code by  trying to replace the setters using  a constructor. 


package com.mycompany.excer31;
 class Employee {

  // private instance variables
  private String name;
  private int age;
  private double salary;

  // constructor
  public Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

}

package com.mycompany.excer31;
public class Excer31
{

    public static void main(String[] args)
    {
        Employee employee = new Employee("John Doe", 30, 100000);
    }
}

//02

public class Employee{
private String empName;
private double basicSalary;
private double bonus;
//Constructor
public Employee(String en,double bSalary,double b){
empName = en;
basicSalary = bSalary;
bonus = b;
}
//Getter and Setter methods for Name
public String getEmpName(){
return empName;
}
public void setEmpName(String en){
empName = en;
}
//Getter and Setter methods for basic salary
public double getBasicSalary(){
return basicSalary;
}
public void setBasicSalary(String bSalary){
basicSalary = bSalary;
}
//Getter method for bonus
public double getBonus(){
return bonus;
}
//Method for get bonus amount
public double getBonusAmount(){
return basicSalary + bonus;
}
}
public class EncapsTest{
public static void main(String args[]){
Employee e = new Employee("Bogdan",50000,10000);
//display values using the getter and setter methods
System.out.println("Employee Name: " +e.getEmpName());
System.out.println("Employee Basic Salary: " +e.getbasicSalary());
System.out.println("Employee Bonus: " +e.getBonus());
System.out.println("Employee Bonus Amount: "
+e.getBonusAmount());
}
}
