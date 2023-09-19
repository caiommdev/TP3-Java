package Parte2.P2Ex1;

public class Pascoa extends CartaoWEB{

    public Pascoa(String email, String nome) {
        super(email, nome);
    }
    
    @Override
    public String showMessage() {
        return "mensagem para:" +this.email+"\n Parabéns, "+this.nome+ " pelo Pascoa.\n======================================";
    }
}
