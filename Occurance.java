import java.util.Scanner;

public class Occurance {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Finding the number of Occurrences in an array of given number !\n");
    
    int[] arr={20,30,20,44,77,23,44,24,77,44,40};
    System.out.print("The elements of an array is : ");
    display(arr);
    System.out.print("\nPlease enter a number : ");
    int num =input.nextInt();
    int occu=noOffOccurrence(arr, num);
    if (occu==0) {
      System.out.println("This number is not found in the array !");
    }else{
      System.out.println("The Occurrence of given number is: "+ occu);
    }

  }
  public static void display(int[] arr){
     int index=0;
     while (index<arr.length) {
      System.out.print(arr[index]+" ");
      index++;
    }
  }
  public static int noOffOccurrence(int[] arr,int num){
    int index=0,occu=0;
    while (index<arr.length) {
      if (num==arr[index]) {
        occu=occu+1;
      }index++;
    }
    return occu;
  }
}
