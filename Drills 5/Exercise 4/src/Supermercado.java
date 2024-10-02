import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {
    public static void main(String[] args) throws Exception {

        ArrayList<Shampoo> shampoo = new ArrayList<>();
        ArrayList<Biscoito> biscoito = new ArrayList<>();
        ArrayList<Leite> leite = new ArrayList<>();

        shampoo.add(new Shampoo("Elseve", 15.99, 4));
        shampoo.add(new Shampoo("Dove", 19.99, 1));
        shampoo.add(new Shampoo("Clear", 10.90, 7));
        shampoo.add(new Shampoo("Treseme", 17.99, 2));

        biscoito.add(new Biscoito("Negresco", 4.99, 4));
        biscoito.add(new Biscoito("Bono", 3.99, 6));
        biscoito.add(new Biscoito("Passatempo", 4.50, 5));
        biscoito.add(new Biscoito("Piraque", 5.99, 1));

        leite.add(new Leite("Tirol", 15.90, 30));
        leite.add(new Leite("Comevap", 12.90, 20));
        leite.add(new Leite("Jussara", 19.90, 45));
        leite.add(new Leite("Herói", 10.90, 15));

        Collections.sort(shampoo);
        Collections.sort(biscoito);
        Collections.sort(leite);

        for (int i = 0; i < shampoo.size(); i++) {
            System.out.println(shampoo.get(i).getNome());
        }
        System.out.println("\n");
        for (int i = 0; i < biscoito.size(); i++) {
            System.out.println(biscoito.get(i).getNome());
        }
        System.out.println("\n");
        for (int i = 0; i < leite.size(); i++) {
            System.out.println(leite.get(i).getNome());
        }

    }
}
