import java.util.Scanner;

public class scanner {

    public static void teste(){
        System.out.println("aeiou\n");
    }

    public static void main(String args[]){
        Scanner scanf = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int a = scanf.nextInt();
        System.out.print("Numero 2: ");
	int b = scanf.nextInt();

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.printf("%d + %d = %d\n", a, b, a+b);

        scanf.close();
    }
}
