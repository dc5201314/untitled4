public class cycle {
    public static void main(String[] args) {
    int num=0;
    int a=0;
    int b=0;
    while (num<=100){
        if (num%2==0){
            System.out.println(num);

            b++;
            a+=num;
        }
        num++;

     }
    System.out.println(b);
    System.out.println(a);
        int c = 0;
        int d= 0;
        for (int nu = 0; nu <= 100; nu++) {
            if (nu % 2 == 0) {
                System.out.println(nu);
                c += nu;
                d++;
            }
        }
        System.out.println(c);
        System.out.println(d);



    }
}
