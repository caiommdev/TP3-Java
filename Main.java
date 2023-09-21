import Ex1.Ex1;
import Ex2.Ex2;
import Ex3.Ex3;
import Ex4.Ex4;
import Parte2.P2Ex1.P2Ex1;
import Parte2.P2Ex2.P2Ex2;

class Main {
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.Execute();        
        Ex2 ex2 = new Ex2();
        ex2.Execute();
        Ex3 ex3 = new Ex3();
        ex3.Execute();
        Ex4 ex4 = new Ex4();
        ex4.Main();

        P2Ex1 p2ex1 = new P2Ex1();
        p2ex1.Execute();
        P2Ex2 p2ex2 = new P2Ex2();
        p2ex2.Main();
    }
}