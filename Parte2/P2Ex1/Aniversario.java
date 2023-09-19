package Parte2.P2Ex1;

public class Aniversario extends CartaoWEB{

    public Aniversario(String email, String nome) {
        super(email, nome);
    }
    @Override
    public String showMessage() {
        return "mensagem para:" +this.email+"\n Parabéns, "+this.nome+ " pelo Aniversário.\n======================================";
    }
}
