public class PalindromeArray {
  public static void main(String[] args) {
    int[] nums=Arrayutility.enterarray(null);

    
    boolean ispalindrome=ispalindrome(nums);
    if (ispalindrome==true) {
      System.out.println("This Array is a Palindrome Array !"); 
    }else{
      System.out.println("This Array is not a Palindrome Array !");
    }
  
  }

     public static boolean ispalindrome(int[] arr){
     int index=arr.length-1,j=0;
     int[] reverse= new int[arr.length];
     while (index>=0) {
      reverse[j]=arr[index];
      index--;
      j++;
    }

      int i=0;
     while (i<arr.length) {
      if (reverse[i]!=arr[i]) {
      return false;
     } 
      i++;
     }  return true;
  }
}