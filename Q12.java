import java.util.Scanner;

class Q12
 
{
      public static void main(String args[])
{
      System.out.println("Take value from user");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first num ");
      int a= sc.nextInt();
      System.out.println("Enter second num");
      int b= sc.nextInt();
      System.out.println("Enter third num");
      int c= sc.nextInt();
      int sum=a+b+c;
      int Avg=sum/3;
      System.out.println("Avarage value "+Avg);     
}
}