import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("nice to meet you.");

    int a = 15;
    int b = 0;
    
    System.out.println(a + a);
    
    Scanner scan = new Scanner(System.in);

    System.out.println("num1 = ");
    int num1 = scan.nextInt();
    System.out.println("num2 = ");
    int num2 = scan.nextInt();

    b = num1 + num2;
    
    System.out.println(num1);
    System.out.println(num2);

    scan.close();

    System.out.println(String.format("b = %d, b*b = %d",b,b*b));
  }
}