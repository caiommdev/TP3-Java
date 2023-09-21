package Parte2.P2Ex2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    protected String Nome;
    protected List<String> Email = new ArrayList<String>();
    protected String SeguroSocial;
    protected String Logradouro;
    protected String Numero;
    protected String Bairro;
    protected String Cidade;
    protected String ZipCode;
    protected BigDecimal Saldo;

    public Cliente (String nome, String email, String seguroSocial, String logradouro, String numero, String bairro, String cidade, String zipcode){
        this.Saldo = BigDecimal.ZERO;
        this.Nome = nome;
        this.Email.add(email);
        this.SeguroSocial = seguroSocial;
        this.Logradouro = logradouro;
        this.Numero = numero;
        this.Bairro = bairro;
        this.Cidade = cidade;
        this.ZipCode = zipcode;
    }

    public void Deposit(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0)
            System.out.println("Valor inválido");
        this.Saldo = this.Saldo.add(value);
    }
   
    public BigDecimal Sacar(int value)
    {
        if (value > this.Saldo.intValue() || value < 0){
            System.out.println("Valor inválido");
            return BigDecimal.ZERO;
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

    
}
