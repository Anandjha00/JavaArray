import java.util.Scanner;
public class Occurrence2 {
  public static void main(String[] args) {
    int[] nums=Arrayutility.enterarray(null);
    System.out.println("Please enter the no you want to search !");
    Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    int occu=occurrence(nums, number);
    if (occu==0) {
      System.out.println("This number is not found in the Array !");
    }else{
      System.out.println("The total number of occurrence is:" +occu);
    }
  }


  public static int occurrence(int[] arr , int num){
    int occu=0,i=0;
    while (i<arr.length) {
      if (arr[i]==num) {
        occu+=1;
        
      }i++;
      
    }
    return occu;

  }
}
