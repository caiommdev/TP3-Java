package Ex4;

public class Ex4 {
    public void Main(){
        CadeiaDeDna cadeiaDeDna = new CadeiaDeDna();
        AlgoritmosGeneticos algoritmosGeneticos = new AlgoritmosGeneticos();

        String dna1 = cadeiaDeDna.GerarCadeiaDeDna(6);
        String dna2 = cadeiaDeDna.GerarCadeiaDeDna(6);

        String[] filhos = algoritmosGeneticos.Recombinacao(dna1, dna2);
        System.out.println("Filhos: " + filhos[0] + " e " + filhos[1]);

        String mutacao = algoritmosGeneticos.Mutacao(filhos[0]);
        System.out.println("Mutacao: " + mutacao);
    }
}
