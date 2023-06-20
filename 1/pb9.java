
import javax.swing.JOptionPane;

public class pb9 {
    public static int combinari(int k, int n){
        if(n >= k && k >= 0){
            if(n == k || k == 0)
                return 1;
            else
                return (combinari(k - 1, n - 1) + combinari(k, n - 1));
        }
        return 0;
    }
    
    public static void main(String[] args){
       String input;
       input=JOptionPane.showInputDialog("Introdu primul numar:");
       int k=Integer.parseInt(input);
       input=JOptionPane.showInputDialog("Introdu al doilea numar:");
       int n=Integer.parseInt(input);
      
       System.out.println(combinari(k, n));
    }
}

