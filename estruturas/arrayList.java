import java.util.ArrayList;
import java.util.Comparator;

public class arrayList{

    static void printList(ArrayList<?> list){
        System.out.print("List = ");
        for( Object x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 5; i >= 1; i--){
            System.out.println("Adicionando " + i);
            list.add(i);
        }

        System.out.println("Removendo o elemento 2");
        list.remove(2);

        printList(list);

        System.out.println("Ordenando a lista");
        list.sort(Comparator.naturalOrder());
        printList(list);

        System.out.println("Ordenando ao contrario");
        list.sort(Comparator.reverseOrder());
        printList(list);

        System.out.println("Limpando a lista");
        list.clear();
        printList(list);

    }

}