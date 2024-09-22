public class SumAndAverage2 {
  public static void main(String[] args) {
    System.out.println("Program to find sum and everage of given elements :\n");
    int[] nums=  Arrayutility.enterarray(null);
    long sum=sum(nums);
    System.out.println("The sum of total elements is:"+sum);
    double ave=aver(nums);
    System.out.println("The average is :"+ave);


  }
  public static long sum(int[] arr){
    long sum=0;
    int i=0;
    while (i<arr.length) {
      sum+=arr[i];
      i++;
    }
    return sum;
  } 


  public static double aver(int[] arr){
    long add=sum(arr);
    double ave=add/arr.length;
    return ave;
  }

}
