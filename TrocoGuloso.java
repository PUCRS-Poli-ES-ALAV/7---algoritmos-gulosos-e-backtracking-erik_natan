import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrocoGuloso {
    public static void main(String[] args) {
        List<Integer> moedasDisponiveis = new ArrayList<>();
        moedasDisponiveis.add(1);
        moedasDisponiveis.add(5);
        moedasDisponiveis.add(25);
        moedasDisponiveis.add(100);

        List<Integer> troco = obterTroco(moedasDisponiveis, 289);
        System.out.println(troco);
    }
    
    public static List<Integer> obterTroco(List<Integer> moedasDisponiveis, int valor) {
        List<Integer> troco = new ArrayList<>();
        int melhorMoeda;
        // while (valor > 0 && moedasDisponiveis.size() > 0) {
        //     melhorMoeda = Collections.max(moedasDisponiveis);
        //     System.out.println("AAAAA");
        //     if (melhorMoeda <= valor && valor - melhorMoeda >= 0) {
        //         System.out.println(moedasDisponiveis);
        //         troco.add(melhorMoeda);
        //         valor -= melhorMoeda;
        //         System.out.println(melhorMoeda);   
        //     }
        //     moedasDisponiveis.remove((Integer) melhorMoeda);
        // }

        while (valor > 0 && moedasDisponiveis.size() > 0) {
            melhorMoeda = Collections.max(moedasDisponiveis);
            if (melhorMoeda <= valor && valor - melhorMoeda >= 0) {
                troco.add(melhorMoeda);
                valor -= melhorMoeda;
            } else {
                moedasDisponiveis.remove((Integer) melhorMoeda);
            }
            
        }    

        return troco;
    }
}
