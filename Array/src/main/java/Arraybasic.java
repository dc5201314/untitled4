import java.util.Scanner;
import java.util.Arrays;
public class Arraybasic {
    public static void main(String[] args) {
    int ji =0;
    int num =0;
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int n = 0; n < arr.length; n++) {
        System.out.println("请输入第" + (n + 1) + "个元素:");
        arr[n] = sc.nextInt();
        num+=arr[n];
        if (arr[n]%2==0){
            ji++;
        }
    }
    System.out.println("数组中的元素为");
    for (int j : arr) {

        System.out.print(j + ",");

    }

    //求数组中的最大值
    int max = arr[0];
    for (int m = 1; m < arr.length; m++) {
        if (max < arr[m]) {
            max = arr[m];
        }
    }
    System.out.println();//换行输出
    System.out.println("最大值是" + max);

    int min =arr[0];
    for (int n=1;n<arr.length;n++){
        if (min > arr[n]) {
            min =arr[n];
        }
    }
    Arrays.sort(arr);
    System.out.println("从小到大排序:");
    for (int j : arr) {
        System.out.print(j + " ");
    }
    System.out.println();
    System.out.println("最小值是"+min);
    System.out.println("元素和"+num);
    System.out.println("奇数个数"+ji);

   }
}
