package Parte2.P2Ex1;

public class Natal extends CartaoWEB{

    public Natal(String email, String nome) {
        super(email, nome);
    }
    @Override
    public String showMessage() {
        return "mensagem para:" +this.email+"\n Parabéns, "+this.nome+ " pelo Natal.\n======================================";
    }
}
