package Parte2.P2Ex1;

public class DiaDosNamorados extends CartaoWEB{

    public DiaDosNamorados(String email, String nome) {
        super(email, nome);
    }
    @Override
    public String showMessage() {
        return "mensagem para:" +this.email+"\n Parabéns, "+this.nome+ " pelo Dia dos namorados.\n======================================";
    }
}
