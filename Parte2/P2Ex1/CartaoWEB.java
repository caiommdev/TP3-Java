package Parte2.P2Ex1;

public class CartaoWEB implements ICartao {
    protected String email;
    protected String nome;

    public CartaoWEB(String email, String nome) {
        if (ValidateEmail(email)) {
            this.email = email;
        }
        else{
            System.out.println("Email inválido");
        }
        this.nome = nome;
    }

    private boolean ValidateEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }

    public String showMessage() {
        return "mensagem para:" +this.email+"\n Parabéns, "+this.nome+ "pelo "+"this.evento"+".\n======================================";
    }
}
