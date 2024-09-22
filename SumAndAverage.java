public class SumAndAverage
{
  public static void main(String[] args) {
    System.out.println("Finding sum and average of all elements in the array !\n");
    int[] arr={10,20,30,40,50};
    System.out.print("The elements of an array are : ");
    displayArray(arr);
    int add=sumandavg(arr);
    System.out.println("\nThe sum of elements is : " +add);
    System.out.println("The average is : "+ add/arr.length);

  }

  public static void displayArray(int[] arr){
    int  index=0;
    while (index<arr.length) {
      System.out.print(arr[index]+" ");
      index++;
    }
  }
     public static int sumandavg(int[] arr){
      int sum=0;
      int index=0;
      while (index<arr.length) {
        sum =sum+arr[index];
        index++;
      }
      return sum;
     }

  }

