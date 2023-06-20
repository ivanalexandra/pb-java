
    
import javax.swing.JOptionPane;


public class pb4 {
    public static void afiseazaPatratStea(char c,int l){
        String patrat="";
        int i,j;
        for(i=0;i<l;i++){
            for(j=0;j<l;j++){
                patrat+=c+" ";
            }
            patrat+="\n";
            
        }
        JOptionPane.showMessageDialog(null, patrat);
    }
    
    public static void main(String[] args){
        String input;
        input=JOptionPane.showInputDialog("Introdu caracterul dorit:");
        char c=input.charAt(0);
        input=JOptionPane.showInputDialog("Introdu dimensiunea patratului:");
        int l=Integer.parseInt(input);
        afiseazaPatratStea(c,l);
    }
}

