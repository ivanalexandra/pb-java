
import javax.swing.JOptionPane;

public class Prob8 {
    public static double volum(int r){
        double pi=Math.PI;
        double v;
        v=(4*pi*(r*r*r))/3;
        return v;
    }
    public static double volum(int l,int cub){
        double v;
        v=l*l*l;
        return v;
    }
    
    public static double volum(int lt,int a,int b){
        double v;
        v=((lt*lt*lt)*Math.sqrt(2))/12;
        return v;
    }
    
   
    public static void main(String[] args){
        
       String input;
       input=JOptionPane.showInputDialog("Introdu un nr:");
       int r=Integer.parseInt(input);
       int l=Integer.parseInt(input);
       
        System.out.println(volum(r));
         System.out.println(volum(l,0));
          System.out.println(volum(l,0,0));
        
    }
}
