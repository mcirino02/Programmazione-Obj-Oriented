import java.util.Scanner;

public class InputChecker {

    public String checkInput(String input) {
       switch (input) {
           case "OK", "S", "SI", "certo", "perchè no?":
               return "OK";
           case "N", "NO":
               return "FINE";
           default:
               return "DATO NON CORRETTO";
       }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dammi l'input di verifica: ");
        String input = in.nextLine();

        InputChecker inputChecker = new InputChecker();
        System.out.println(inputChecker.checkInput(input));
    }
}