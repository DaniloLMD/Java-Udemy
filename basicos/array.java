import java.util.Scanner;

public class array{

    public static int[] CountingSort(int[] v){
        int[] ordenado = new int[v.length];
        
        int max = 0;

        for(int x: v)
            if(x > max) max = x;

        int[] count = new int[max+1];

        for(int i = 0; i < v.length; i++){
            count[v[i]]++;
        }

        for(int i = 1; i < count.length; i++){
            count[i] += count[i-1];
        }

        for(int i = 0; i < ordenado.length; i++){
            ordenado[ --count[v[i]] ] = v[i];
        }

        return ordenado;
    }

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho: ");
        int size = sc.nextInt();

        int[] v = new int[size];
        
        for(int i = 0; i < v.length; i++){
            System.out.print("Digite o valor " + i + ": ");
            v[i] = sc.nextInt();    
        }
        sc.close();

        v = CountingSort(v);
        
        for(int x: v){
            System.out.println(x);
        }
    }
}