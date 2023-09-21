package Parte2.P2Ex2;

import java.math.BigDecimal;

public class P2Ex2 {
    public void Main(){
        Cliente cliente = new ClienteSant("caio", "caio@gmail.com", "", "", "", "", "", "");
        cliente.Deposit(BigDecimal.valueOf(100));
        cliente.Sacar(72);


        Cliente clienteVip = new ClienteVip("caio", "caio@gmail.com", "", "", "", "", "", "");
        clienteVip.Deposit(BigDecimal.valueOf(100));
        clienteVip.Sacar(50);
    }
}
