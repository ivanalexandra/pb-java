
import javax.swing.JOptionPane;

public class Pb10 {
    public static int cmmdc(int u,int v){
        if(v==0)
            return u;
        else
            return cmmdc(v,u%v);
    }
    
     
    public static void main(String[] args){
       String input;
       input=JOptionPane.showInputDialog("Introdu primul numar:");
       int u=Integer.parseInt(input);
       input=JOptionPane.showInputDialog("Introdu al doilea numar:");
       int v=Integer.parseInt(input);
      
       System.out.println(cmmdc(u, v));
       
       
    }
}
