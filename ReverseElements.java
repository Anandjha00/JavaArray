public class ReverseElements {
  public static void main(String[] args) {
    System.out.println("Reverse the element of an Array !\n");
    int[] nums=Arrayutility.enterarray(null);
    System.out.print("The reverse elements of the given Array is :");
    reverse(nums);

  }
  public static void reverse(int[] arr){
    int index=(arr.length-1),reverse=0;
    while (index>=0) {
      reverse=arr[index];
      System.out.print(reverse+" ");
      index--;
    }

  }
}
