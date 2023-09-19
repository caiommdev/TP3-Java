package Ex3;

import java.util.Scanner;

public class Ex3 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();

        String[] nameSplited = name.split(" ");
        String initials = "";
        for (String string : nameSplited) {
            if("e, do, da, dos, das,  de, di, du".contains(string.toLowerCase().intern()))
                continue;
            initials += string.charAt(0);
        }
        System.out.println("Suas iniciais são: " + initials.toUpperCase());
    }
}
