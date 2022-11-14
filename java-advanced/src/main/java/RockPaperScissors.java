import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors { public static void  main (String[] args) {
    //通过Random类中的nextInt（int n）方法，生成1-3的随机数 1代表剪刀 2代表
    //石头 3代表布
    int a=0;
    int b=0;
    System.out.println("1=剪刀  2=石头  3=布");
    Scanner sc = new Scanner(System.in);
    for(int i = 1; i<=5;i++){
        System.out.println("第"+i+"局");
        String enter = sc.next();  //接收用户输入的字符
        int randomNumber=new Random().nextInt(3)+1;
        if(enter.equals("剪刀")) {    //判断用户输入的字符
            if(randomNumber==1) {    //判断谁输谁赢
                System.out.println("电脑出的是剪刀");
                System.out.println("平");
                b++;    //平局后b+1
            }else if(randomNumber==2) {
                System.out.println("电脑出的是石头");
                System.out.println("你输了");
            }else if(randomNumber==3) {
                System.out.println("电脑出的是布");
                System.out.println("你赢了");
                a++;      //玩家赢后 a+1
            }
        }else if(enter.equals("石头")) {
            if(randomNumber==1) {
                System.out.println("电脑出的是剪刀");
                System.out.println("你赢了");
                a++;
            }else if(randomNumber==2) {
                System.out.println("电脑出的是石头");
                System.out.println("平");
                b++;
            }else if(randomNumber==3) {
                System.out.println("电脑出的是布");
                System.out.println("你输了");
            }
        }else if(enter.equals("布")) {
            if(randomNumber==1) {
                System.out.println("电脑出的是剪刀");
                System.out.println("你输了");
            }else if(randomNumber==2) {
                System.out.println("电脑出的是石头");
                System.out.println("你赢了");
                a++;
            }else if(randomNumber==3) {
                System.out.println("电脑出的是布");
                System.out.println("平");
                b++;
            }
        }else {
            System.out.println("输入错误！");
        }
    }
    System.out.println("本次游戏您赢了"+a+"局,平了"+b+"局");
    int c = 5-a-b;    //计算出电脑胜利的场次
    if(a==c) {
        System.out.println("和局！");
    }else if(a>b) {
        System.out.println("您赢了！");
    }else{
        System.out.println("您输了！");
    }
 }
}
