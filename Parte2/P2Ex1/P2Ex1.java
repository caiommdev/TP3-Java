package Parte2.P2Ex1;

import java.util.LinkedList;

public class P2Ex1 {
    public void Execute (){
        CartaoWEB cartao1 = new DiaDosNamorados("caiomota@gmail.com", "Caio Mota");

        CartaoWEB cartao2 = new Natal("caiomota@gmail.com", "Caio Mota");

        CartaoWEB cartao3 = new Aniversario("caiomota@gmail.com", "Caio Mota");

        CartaoWEB cartao4 = new Pascoa("caiomota@gmail.com", "Caio Mota");

        CartaoWEB cartao5 = new DiaDosNamorados("caiomota@gmail.com", "Caio Mota");

        LinkedList<CartaoWEB> cartoes = new LinkedList<CartaoWEB>();
        cartoes.add(cartao1);
        cartoes.add(cartao2);
        cartoes.add(cartao3);
        cartoes.add(cartao4);
        cartoes.add(cartao5);

        for (CartaoWEB cartao : cartoes) {
            System.out.println(cartao.showMessage());
        }
    }
}