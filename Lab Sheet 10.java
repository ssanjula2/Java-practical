// Question 01
 
package com.mycompany.dividenum;

import java.util.Scanner;

public class DivideNum
{
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    int number1 = scanner.nextInt();

    System.out.println("Enter the second number: ");
    int number2 = scanner.nextInt();

    try {
      int result = number1 / number2;
      System.out.println("The result of the division is: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero error.");
    }
  }
  }



//Question 02
 

package com.mycompany.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionExample
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println(array[5]);
            } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
        }
    }
}



 
// Question 03
 

package com.mycompany.FileNotFoundExceptionExample;
public class FileNotFoundExceptionExample {

    public static void main(String[] args) {
        String fileName = "some_file.txt";

        try {
            File file = new File(fileName);
            System.out.println(file.readLines());
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
