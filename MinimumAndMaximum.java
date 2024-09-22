public class MinimumAndMaximum {
  public static void main(String[] args) {
    int[] nums=Arrayutility.enterarray(null);
    int max=maxArr(nums);
    int min= min(nums);
    System.out.println("The maximum element of given Array is: "+ max);
    System.out.println("The minimum element of given Array is: "+ min);

  }
  public static int maxArr(int[] arr){
    int index=1,max=arr[0];
    while (index<arr.length) {
      if (max<arr[index]) {
        max=arr[index];
      }index++;
      
    }
    return max;
  }

  public static int min(int[] arr){
    int i=1;
    int min=arr[0];
    while (i<arr.length) {
      if (min>arr[i]) {
        min=arr[i];
        
      }i++;
      
    }return min;
    
  }
}
