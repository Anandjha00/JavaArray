public class MergeArray {
  public static void main(String[] args) {
     int[] num1=Arrayutility.enterarray(null);
     int[] num2=Arrayutility.enterarray(null);
     System.out.print("The new sorted array is ");
      int[] newarr=merge(num1, num2);
      
      int i=0;
      while (i<newarr.length) {
        System.out.print(newarr[i] +" ");
        
      i++;
      }
    }



     public static int[] merge(int[]num1,int[] num2){
       int size=(num1.length+num2.length);
       int[] newarr=new int[size];
       int i=0,j=0,k=0;
       while (i<num1.length || j <num2.length) {
        if (j== num2.length ||(i<num1.length && num1[i]<num2[j])) {
          newarr[k]=num1[i];
          i++;
        }else{
          newarr[k]=num2[j];
          j++;
        }k++;
        }
       return newarr;
    }
}
