import java.util.Scanner;

public class scanf {

    public static void teste(){
        System.out.println("aeiou\n");
    }

    public static void main(String args[]){
        Scanner scanf = new Scanner(System.in);

        teste();

        int a = scanf.nextInt();
        int b = scanf.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.printf("%d + %d = %d\n", a, b, a+b);

        scanf.close();
    }

}
