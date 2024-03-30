package refatoracao;

/**
 *
 * @author guispiger
 */
public class ArithMeticProgression {
    int firstElement;
    int ratio;
    
    //-----------------------------------------------
    public ArithMeticProgression(int firstElement, int ratio) {
        this.firstElement = firstElement;
        this.ratio = ratio;
    }
    
    //-----------------------------------------------
    public int elementAt(int position){
        return firstElement + ratio * (position - 1);
    }
    
    //-----------------------------------------------
    public int[] sequence(int size){
        int[] sequence = new int[size];
        
        for(int i=0; i<sequence.length; i++){
            sequence[i] = elementAt(i + 1); //The position must initiate in 1
        }
        
        return sequence;
    }
       
    //-----------------------------------------------
    public int sumUntilElementAt(int position){
        return ((firstElement + elementAt(position)) * position) / 2;
    }
}
