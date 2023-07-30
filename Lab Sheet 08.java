//Exercise 01:
 
abstract class BankAccount {
  private String accountNumber;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
  private double interestRate = 0.12;

  @Override
  double calculateInterest() {
    return balance * interestRate;
  }
}

class CheckingAccount extends BankAccount {
  private double interestRate = 0.02;

  @Override
  double calculateInterest() {
    return balance * interestRate;
  }
}

public class Exercise01 {
  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount();
    savingsAccount.setAccountNumber("123456789");
    savingsAccount.setBalance(2000000);

    CheckingAccount checkingAccount = new CheckingAccount();
    checkingAccount.setAccountNumber("987654321");
    checkingAccount.setBalance(1000000);

    double savingsInterest = savingsAccount.calculateInterest();
    double checkingInterest = checkingAccount.calculateInterest();

    System.out.println("Interest for savings account: " + savingsInterest);
    System.out.println("Interest for checking account: " + checkingInterest);
  }
}
//Exercise 02:
 
interface Shape {
  double calculateArea();
  double calculatePerimeter();
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * Math.PI * radius;
  }
}

class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return width * height;
  }

  @Override
  public double calculatePerimeter() {
    return 2 * (width + height);
  }
}

class Triangle implements Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double calculateArea() {
    return 0.5 * base * height;
  }

  @Override
  public double calculatePerimeter() {
    return base + height + Math.sqrt(base * base + height * height);
  }
}

public class Exercise02 {
  public static void main(String[] args) {
    Circle circle = new Circle(10);
    System.out.println("Circle area: " + circle.calculateArea());
    System.out.println("Circle perimeter: " + circle.calculatePerimeter());

    Rectangle rectangle = new Rectangle(10, 20);
    System.out.println("Rectangle area: " + rectangle.calculateArea());
    System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

    Triangle triangle = new Triangle(10, 20);
    System.out.println("Triangle area: " + triangle.calculateArea());
    System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
  }
}
