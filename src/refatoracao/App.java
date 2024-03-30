package refatoracao;


public class App {
    private ArithMeticProgression pA = null;
    private TextUserInterface textUserInterface = new TextUserInterface();
    
    //-----------------------------------------------
    public void createArithMeticProgression(){
        int firstTerm = this.textUserInterface.readFirstTerm();
        int ratio     = this.textUserInterface.readRatio();
        this.pA       = new ArithMeticProgression(firstTerm, ratio);
    }
    
    //-----------------------------------------------
    public void printArithmeticProgressionData(){
        int numberOfTerms = textUserInterface.readNumberOfTerms();
        int[] sequence    = pA.sequence(numberOfTerms);
        int sum           = pA.sumUntilElementAt(numberOfTerms);
        
        textUserInterface.printTerms(sequence);
        textUserInterface.printSumOfTerms(numberOfTerms, sum);
    }
    
    //-----------------------------------------------
    public static void main(String[] args) {
        App app = new App();
        app.createArithMeticProgression();
        app.printArithmeticProgressionData();
    }
}
