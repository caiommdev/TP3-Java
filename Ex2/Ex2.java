package Ex2;

import java.util.Scanner;

import Ex1.StringUtils;

public class Ex2 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);
        StringUtils stringUtils = new StringUtils();

        System.out.println("Digite numeros: ");
        String word = scanner.nextLine();

        stringUtils.WriteDigits(word);
    }
}
