package Ex4;

import java.util.Arrays;
import java.util.List;

public class CadeiaDeDna {
    private List<String> proteins = Arrays.asList("A", "T", "C", "G");
    
    public String GerarCadeiaDeDna(int tamanho){
        String dna = "";
        for (int i = 0; i < tamanho; i++) {
            int random = (int) (Math.random() * 4);
            dna += proteins.get(random);
        }
        return dna;
    }
}
