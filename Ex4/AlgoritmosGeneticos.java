package Ex4;

import java.util.Arrays;

public class AlgoritmosGeneticos {
    public String[] Recombinacao (String S1, String S2){
        int cutPoint = (int) (Math.random() * S1.length());
        
        String s0 = S1.substring(0, cutPoint+1) + S2.substring(cutPoint);
        String s1 = S2.substring(0, cutPoint+1) + S1.substring(cutPoint);
        
        return new String[]{s0, s1};
    }

    public String Mutacao (String dna) {
        int cutPoint = (int) (Math.random() * dna.length());
        int random = (int) (Math.random() * 4);
        String protein = Arrays.asList("A", "T", "C", "G").get(random);
        return dna.substring(0, cutPoint) + protein + dna.substring(cutPoint+1);
    }
}
