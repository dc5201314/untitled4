package top.dc.java.tool.sort;

/**
 *
 */
public class ArrayTools {
    public static int getMax(int[]arr){
        int max=arr[0];
        for (int i=1;i< arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
    public static int[] sort(int[]arr){
   int min;
   int temp;
   for (int i=0;i< arr.length-1;i++){

       min =i;
       for (int j=i+1;j< arr.length;j++){
           if (arr[j]<arr[min]){
               temp=arr[j];
               arr[j]=arr[min];
               arr[min]=temp;
           }
       }
   }
   return arr;
    }


}

