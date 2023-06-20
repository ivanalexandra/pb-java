

import javax.swing.JOptionPane;


public class pb11 {
    public static int P(int a,int b){
        if(b==0)
            return 1;
        else
            return a*P(a,b-1);
    }
    public static void main(String[] args){
       String input;
       input=JOptionPane.showInputDialog("Introdu primul numar:");
       int a=Integer.parseInt(input);
       input=JOptionPane.showInputDialog("Introdu al doilea numar:");
       int b=Integer.parseInt(input);
      
       System.out.println(P(a, b));
       
       
    }
}
