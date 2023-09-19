package Ex1;
import java.util.Arrays;
import java.util.List;

public class StringUtils {
    private List<String> vogals = Arrays.asList("a","e", "i", "o", "u");
    private List<String> digits = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
    
    public int CountVogals (String in){
        int nVogals = 0;
        for(int i = 0; i<in.length(); i++){
          if(vogals.contains(in.substring(i, i+1))){
            nVogals++;
          }
        }
        return nVogals;
    }

    public boolean StartWithINF(String in){
        if (in.length() < 3)
            return false;
        
        String start = in.toUpperCase().substring(0, 3);
        if(start.intern() == "INF")
            return true;
        
        return false;
    }

    public boolean EndWithNET(String in){
        if (in.length() < 3)
            return false;

        String end = in.toUpperCase().substring(in.length()-3, in.length());
        if(end.intern() == "NET")
            return true;
        
        return false;
    }

    public int CountDigits(String in){
        int nDigits = 0;
        
        for(int i = 0; i<in.length(); i++){
          if(digits.contains(in.substring(i, i+1))){
            nDigits++;
          }
        }
        return nDigits;
    }

    public void FristTwoDigits (String in){
        int twoDigits =  0;
        for (int i = 0; i < in.length(); i++) {
            if(digits.contains(in.substring(i, i+1))){
                System.out.println(in.substring(i, i+1));
                twoDigits++;
                if(twoDigits == 2)
                    break;
            } 
        }
    }

    public void IsPalindrome(String in){
        String palindrome = "";
    		
        for(int i = in.length() -1; i >= 0; i--)    			
            palindrome += in.charAt(i);

        if(palindrome.equals(in)) 
            System.out.println("É um palíndromo!");
        
        else 
            System.out.println("Não é um palíndromo!");		
    }

    public void WriteDigits(String in){
        String result = "";
        for(int i = 0; i<in.length(); i++){
            if(digits.contains(in.substring(i, i+1))){
                switch (in.substring(i, i+1)){
                    case "1":
                        result += "Um";
                        break;
                    case "2":
                        result += "Dois";
                        break;
                    case "3":
                        result += "Três";
                        break;
                    case "4":
                        result += "Quatro";
                        break;
                    case "5":
                        result += "Cinco";
                        break;
                    case "6":
                        result += "Seis";
                        break;
                    case "7":
                        result += "Sete";
                        break;
                    case "8":
                        result += "Oito";
                        break;
                    case "9":
                        result += "Nove";
                        break;
                    case "0":
                        result += "Zero";
                        break;
                    default:
                        break;
                }
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
