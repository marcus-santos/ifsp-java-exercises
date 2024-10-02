import java.util.ArrayList;
import java.util.Collections;

public class Agenda implements Comparable{
    ArrayList<Object> book = new ArrayList<>();

    public ArrayList<Object> ordena(){
        return Collections.sort(book);
    }

}
