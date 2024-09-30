import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Troco {
    public static void main(String[] args) {
        List<Integer> moedasDisponiveis = Arrays.asList(25, 50, 100, 10, 1, 5, 5, 25, 25, 100, 50, 1, 1, 1);

        List<Integer> troco = obterTroco(moedasDisponiveis, 289);
        System.out.println(troco);
    }
    
    public static List<Integer> obterTroco(List<Integer> moedasDisponiveis, int valor) {
        Collections.sort(moedasDisponiveis);
        Collections.reverse(moedasDisponiveis);
        List<Integer> troco = new ArrayList<>();
        for (Integer moeda : moedasDisponiveis) {
            if (moeda <= valor) {
                valor-=moeda;
                troco.add(moeda);
            }
        }
        return troco;
    }
}