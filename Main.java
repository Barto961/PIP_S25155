import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //ZADANIE2();
        ZADANIE3();


    }
    public static void ZADANIE2()
        {
         Scanner scan = new Scanner(System.in);
            System.out.println("Wprowaź dwie wartośći:");
            double X = scan.nextDouble();
            double Y = scan.nextDouble();
            int I = (int) X;
            int J = (int) Y;
            System.out.println("Jaką operacje chcesz wykonać?"+"\nDodawanie - 1"+"\nOdejmowanie - 2"+"\nDzielenie - 3"+"\nMnożenie - 4");
            int OP = scan.nextInt();
            switch (OP){
                case 1:
                    ADD(I,J);
                    break;
                case 2:
                    SUB(I,J);
                    break;
                case 3:
                    DIV(I,J);
                    break;
                case 4:
                    MUL(I,J);
                    break;


            }

    }
    public static void ADD(int I, int J){
        System.out.println("ADD");
        int Q = (I+J);
        System.out.println("Wynik:"+ (Q));
        absoluteValue(Q);

    }

    public static void SUB(int I, int J){
        System.out.println("SUB");
        int Q = (I-J);
        System.out.println("Wynik:"+ (Q));
        absoluteValue(Q);
    }

    public static void DIV(int I, int J){
        System.out.println("DIV");
        int Q = (I/J);
        System.out.println("Wynik:"+ (Q));
        absoluteValue(Q);
    }

    public static void MUL(int I, int J){
        System.out.println("MUL");
        int Q = (I*J);
        System.out.println("Wynik:"+ (Q));
        absoluteValue(Q);
    }
    public static void absoluteValue(int Q){
        Q = Math.abs(Q);
        System.out.println("WARTOŚĆ BEZWGLĘDNA WYNIKU: "+Q);
    }

    public static void ZADANIE3(){
        byte[] CIĄG = new byte[5];
        new Random().nextBytes(CIĄG);
        String GENERATOR = new String(CIĄG, Charset.forName("UTF-8"));
        System.out.println(GENERATOR);

    }

}
