import java.util.*;
class SwapNumber{
  public static void main(String[] args){
    int a,b,cd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number a:");
    a=sc.nextInt();
    System.out.println("Enter number b:");
    b=sc.nextInt();
    System.out.println("Numbers before Swapping");
    System.out.println(a+" & "+b);
    cd=a;
    a=b;
    b=cd;

    System.out.println("Numbers after after Swapping");
    System.out.println(a+" & "+b);
  }
}
