package dominio;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ej14_1 {
    public static ArrayList listacuadrados(int[] lista1){

        return Stream.iterate(0,i->i+1).limit(lista1.length).map(i->lista1[i]*lista1[i]).collect(Collectors.toCollection(ArrayList::new));

    }
}
