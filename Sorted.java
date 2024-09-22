public class Sorted {
  public static void main(String[] args) {
    int num[]=Arrayutility.enterarray(null);
    boolean ascendindArray=ascendindArray(num);
    boolean descendindArray=descendindArray(num);
    if (ascendindArray==true) {
      System.out.println("This array is sorted by ascending order !");
    }else if (descendindArray==true) {
      System.out.println("This array is sorted by descending order !");
    }else{
      System.out.println("This array is not sorted !");
    }

  }

  public static boolean ascendindArray(int[] arr){
    int index=0;
    while (index<arr.length-1) {
      if (arr[index]>arr[index+1]) {
        return false;
      }index++;
    }
    return true;
  }

  public static boolean descendindArray(int[] arr){
    int index=0;
    while (index<arr.length-1) {
      if (arr[index]<arr[index+1]) {
        return false;
      }index++;
    }
    return true;
  }
}
