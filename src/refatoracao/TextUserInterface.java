package refatoracao;

import java.util.Scanner;

/**
 *
 * @author guispiger
 */
public class TextUserInterface {
    private final Scanner scanner = new Scanner(System.in);
    
    //-----------------------------------------------
    private int promptForIntStartingAt(String promptMessage, int minValue){
        int number;
        do {            
            System.out.println(promptMessage);
            number = scanner.nextInt();
        } while (number < minValue);
        
        return number;
    }
    
    //-----------------------------------------------
    public int readNumberOfTerms(){
        return promptForIntStartingAt("Digite o número de termos da PA:", 2);
    }
    
    //-----------------------------------------------
    public int readFirstTerm(){
        return promptForIntStartingAt("Digite o primeiro termo da PA:", 1);
    }
    
    //-----------------------------------------------
    public int readRatio(){
        return promptForIntStartingAt("Digite a razão da PA:", 1);
    }
    
    //-----------------------------------------------
    public void printTerms(int[] sequence){
        final String msgFormat = "\nOs primeiros %d termos da PA são: ";
        System.out.printf(msgFormat, sequence.length);
        
        for (int term : sequence) {
            System.out.print(term + ", ");
        }
        System.out.println("...");
    }
    
    //-----------------------------------------------
    public void printSumOfTerms(int numberOfTerms, int sum){
        final String msgFormat = "\nA soma dos %d primeiros termos da PA é: %d";
        System.out.printf(msgFormat, numberOfTerms, sum);
    }
}
