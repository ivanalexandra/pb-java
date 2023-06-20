
import javax.swing.JOptionPane;


public class pb3 {
    public static void afiseazaPatratStea(int l){
        String patrat="";
        int i,j;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                patrat+="*";
            }
            patrat+="\n";
            
        }
        JOptionPane.showMessageDialog(null, patrat);
    }
    
    public static void main(String[] args){
        String input;
        input=JOptionPane.showInputDialog("Introdu dimensiunea patratului:");
        int l=Integer.parseInt(input);
        afiseazaPatratStea(l);
    }
}
