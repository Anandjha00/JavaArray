import java.util.Scanner;

public class Arrayutility {
  public static int[] enterarray(int[] arr){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Please enter the no of elements :");
    int size=scanner.nextInt();
    int[] num= new int[size];
     int i=0; 
     while (i<size) {
      System.out.print("Enter the element no "+(i+1)+ ":" );
      num[i]=scanner.nextInt();
      i++;
    }
    return num;
  }
}
