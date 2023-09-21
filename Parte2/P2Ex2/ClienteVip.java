package Parte2.P2Ex2;

import java.math.BigDecimal;

public class ClienteVip extends Cliente {

    public ClienteVip(String nome, String email, String seguroSocial, String logradouro, String numero, String bairro,
            String cidade, String zipcode) {
        super(nome, email, seguroSocial, logradouro, numero, bairro, cidade, zipcode);
    }
    
    @Override
    public BigDecimal Sacar(int value){
        if (value > this.Saldo.intValue() || value < 0){
            System.out.println("Valor inválido");
            return BigDecimal.ZERO;
        }

        if (value < 100){
            System.out.println("Você quer fazer o saque com menores notas?");
            String resposta = System.console().readLine();
            if (resposta.toLowerCase().equals("sim")){
                SaqueVip(value);
                return BigDecimal.valueOf(value);
            }
        }
        this.Saldo = this.Saldo.subtract(BigDecimal.valueOf(value));
        int count50 = 0;
        int count10 = 0;
        int count5 = 0;
        int count1 = 0;
        while(value > 0){
            if(value >= 50){
                count50 = value / 50;
                value -= count50 * 50;
            }
            else if (value >= 10){
                count10 = value / 10;
                value -= count10 * 10;
            }
            else if (value >= 5){
                count5 = value / 5;
                value -= count5 * 5;
            }
            else if (value >= 1){
                count1 = value / 1;
                value -= count1 * 1;
            }   
        }
        System.out.println(" 50: " + count50 + "  10: "+ count10 + "  5: " + count5 + "  1: " + count1);
            
            return BigDecimal.valueOf(value);
        
    }

    private BigDecimal SaqueVip(int value){
        int count5 = 0;
        int count1 = 0;
        while(value > 0){
            if (value >= 5){
                count5 = value / 5;
                value -= count5 * 5;
            }
            else if (value >= 1){
                count1 = value / 1;
                value -= count1 * 1;
            }   
        }

        System.out.println(" 50: " + 0 + "  10: "+ 0 + "  5: " + count5 + "  1: " + count1);
        this.Saldo = this.Saldo.subtract(BigDecimal.valueOf(value));
        return BigDecimal.valueOf(value);
    }
}
