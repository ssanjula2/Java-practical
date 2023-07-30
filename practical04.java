// Exercise 01:

 package com.mycompany.practical4;
public class Employee 
{
    int empID;
    String empName, empDesignation;
    //Getter and Setter methods for empID
    public int getEmpID()
    {
        return empID;
    }
    
    public void setEmpID(int empID)
    {
        this.empID = empID;
    }
    //Getter and Setter methods for empName
    public String getEmpName()
    {
        return empName;
    }
    
    public void setEmpName(String empName)
    {
        this.empName = empName;
    }
    //Getter and Setter methods for empDesignation
    public String getEmpDesignation()
    {
        return empDesignation;
    }
    
    public void setEmpDesignation(String empDesignation)
    {
        this.empDesignation= empDesignation;
    }
}

package com.mycompany.practical4;
public class Practical4 
{
    public static void main(String[] args) 
    {
        //Create object for Mr.Bogdan
        Employee bogdan = new Employee();
        bogdan.setEmpID(28353);
        bogdan.setEmpName("Mr.Bogdan");
        bogdan.setEmpDesignation("Software Engineer");
        
        //Create object for Ms.Bird
        Employee bird = new Employee();
        bird.setEmpID(28522);
        bird.setEmpName("Ms.Bird");
        bird.setEmpDesignation("Developer");
        
        //print details
        System.out.println("Employee ID: "+bogdan.getEmpID());
        System.out.println("Employee Name: "+bogdan.getEmpName());
        System.out.println("Designation: "+bogdan.getEmpDesignation());
        
        System.out.println("Employee ID: "+bird.getEmpID());
        System.out.println("Employee Name: "+bird.getEmpName());
        System.out.println("Designation: "+bird.getEmpDesignation());
        
        
    }
}

//Exercise 02:

package com.mycompany.testinheritence;
public class SuperB 
{
    int x;
    void setIt(int n)
    { 
        x=n;
    }
    void increase() 
    { 
        x=x+1;
    }
    void triple() 
    {
        x=x*3;
    }
    int returnIt() 
    {
        return x;
    }
}

package com.mycompany.testinheritence;
public class SubC extends SuperB
{
    // override existing method
void triple() 
    {
        x=x+3;
    } 
    // new method
    void quadruple() 
    {
        x=x*4;
    } 
}
package com.mycompany.testinheritence;
public class TestInheritence 
{
    public static void main(String[] args) 
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 
    }
}

// Exercise 03:

package com.mycompany.testscenario;
public class Person 
{
    private String Name;
    private int ID;
    //constructor
    public Person(String Name, int ID)
{
        this.Name=Name;
        this.ID=ID;
    }
    //Setter method
    public void setName(String Name)
    {
        this.Name=Name;
    }
    public void setId(int ID)
    {
        this.ID=ID;
    }
    //Getter method
    public String getName()
    {
        return Name;
    }
    public int getID()
    {
        return ID;
    }
}


package com.mycompany.testscenario;
public class Student extends Person
{
    private String Course;
    //constructor
    public Student(String Name,int ID,String Course)
    {
        super(Name, ID);
        this.Course=Course;
    }
    //setter and getter method
    public void setCourse(String course)
    {
        this.Course=Course;
    }
    public String getCourse()
    {
        return Course;
    }
}

package com.mycompany.testscenario;
public class Lecturer extends Person
{
    private String Programme;
   // Constructor
    public Lecturer(String Name, int ID, String Programme) 
super(Name, ID);
        this.Programme = Programme;
    }
    // Getter and Setter for programme
    public void setProgramme(String Programme) 
    {
        this.Programme = Programme;
    }
    public String getProgramme() 
    {
        return Programme;
    }
}


package com.mycompany.testscenario;
public class TestScenario 
{
    public static void main(String[] args) 
    {
        // Create a Student object
        Student st = new Student("Saman Perera", 28748, "Computer Science");
        System.out.println("Student Name: " + st.getName());
        System.out.println("Student ID: " + st.getID());
        System.out.println("Student Course: " + st.getCourse());
      // Create a Lecturer object
        Lecturer lec = new Lecturer("Dr.Kamal Fernando", 1001, "Software Engineering");
        System.out.println("\nLecturer Name: " + lec.getName());
        System.out.println("Lecturer ID: " + lec.getID());
        System.out.println("Lecturer Programme: " + lec.getProgramme());
    }
}


//Exercise 04:
true
true
true


