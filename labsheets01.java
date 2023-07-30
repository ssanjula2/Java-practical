//01

package com. mycompany. practicals;
public class Practicals
{
Public static void main (string[] args)
{
System.out.printIn(“Hello world”);
}
}

//02

package com. mycompany. practicals;
public class Practicals
{
Public static void main (string[] args)
{
System.out.printIn(“Name: Shehan \n Degree: Software Engineering”);
}
}

//03 (for loop)

package com. mycompany. practical;
public class Practicals
{
Public static void main (string[] args)
{
For (int i=0; i<=4; i++)
{
System.out.printIn(“Executing Loop” +i);
}
}
}

//(while loop)

package com .mycompany. practicals;
public class Practicals
{
Public static void main (string[] args)
{
Int i=0;
While(i<=4);
{
System.out.printIn(“Executing Loop” +i);
i++;
}
}
}

//04
//04.1

10
20
I’m out of the loop now

//04.2

package com.mycompany.mavenproject8;
public class Mavenproject8
{
public static void main(String[] args)
{
int [] numbers = {10, 20, 30, 40, 50};
for (int x : numbers)
{
if (x == 30)
{
continue;
System.out.println(x); }
System.out.println("I’m out of the Loop now");
}
}

//output
10
20
40
50
I’m out of the Loop now

//05
//05.1

package com.mycompany. practical;
public class Practical
{
public static void main(String[] args)
{
char grade ='A';
switch(grade)
{
case 'A' :
System.out.println("Excellent!");
break;
case 'D' :
System.out.println("You passed");
case 'F' :
System.out.println("Better try again");
break;
default :
System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade);
}
}
// output
Excellent!
Your grade is A

//05.2
Excellent!
You passed
Better try again
Your grade is A

//05.3

package com.mycompany.
practical;
public class Practical {
public static void main(String[] args)
{
char grade ='A';
if (grade == 'A')
{
System.out.println("Excellent!");
}
else if (grade == 'D')
{
System.out.println("You passed");
}
else if (grade == 'F')
{
System.out.println("Better try again");
}
else
{
System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade);
}
}

//06

public class TestEnhanceForLoop
{
public static void main(String[] args)
{
int []numbers={10, 20, 30, 40, 50};
for (int x:numbers)
{
System.out.print( x );
System.out.print(",");
}
System.out.print("\n");
String []names ={"James", "Larry", "Tom", "Lacy"};
For ( String name : names )
{
System.out.print( name );
System.out.print(",");
}
}
}
//output
10,20,30,40,50,
James, Larry, Tom, Lacy,
