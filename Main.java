import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        //ZAD1();
        //ZAD2();
        //ZAD3();
        //ZAD4();
        ZAD5();
        }
        public static void ZAD1(){
            Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
            if (n >0){
                for(int i = 0;i<=n;i++){
                    System.out.println(i);
                }
            } else if(n<0){
                for(int i = 0;i>=n;i--){
                    System.out.println(i);
                }
            }

        }
        public static void ZAD2()
        {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            int d = 1;
            int m;
            int n = scan.nextInt();
            //for(int i = 0;i<n;i++){
                m = rand.nextInt();
                System.out.println(m);
            while(d<n){
                m = rand.nextInt();
                System.out.println(m);
                d++;
             }
        }
        public static void ZAD3(){
        int n = 5;
        if (n%2==0){
            n--;
        }
            System.out.println(n);
            String a = "*";
            for(int i = 0;i<n;i++){
                for(int j = 0;j<=i;j++){
                    System.out.print(a);

                }
                System.out.println();
            }

    }
    public static void ZAD4(){
        int n = 5;
        if (n%2==0){
            n--;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void ZAD5(){
        int x =5;
        int y =3;
        int z = 8;
        for (int i = 0;i<2;i++)
            System.out.println(" ");
        for( int j = 0;j<8;j++)
            System.out.println("*");


    }

    }











