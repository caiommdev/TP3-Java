package Ex1;
import java.util.Scanner;

public class Ex1 {
    public void Execute(){
        Scanner scanner = new Scanner(System.in);
        StringUtils stringUtils = new StringUtils();

        System.out.println("Digite uma palavra: ");
        String entrada = scanner.nextLine();
        
        System.out.println(entrada.length());

        System.out.println(entrada.toUpperCase());

        System.out.println(stringUtils.CountVogals(entrada));

        System.out.println(stringUtils.StartWithINF(entrada));
        System.out.println(stringUtils.EndWithNET(entrada));

        System.out.println(stringUtils.CountDigits(entrada));

        stringUtils.FristTwoDigits(entrada);

        stringUtils.IsPalindrome(entrada);
    }
}
