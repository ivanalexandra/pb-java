
import javax.swing.JOptionPane;


public class Pb2 {
    public static int suma(int a,int b){
        int s;
        s=a+b;
        return s;
    }
    
    public static int diferenta(int a,int b){
        int dif;
        dif=b-a;
        return dif;
    }
    
    public static int produs(int a,int b){
        int p;
        p=a*b;
        return p;
    }
    
    public static int maxim(int a, int b){
       if(a>b)
           return a;
       else
           return b;
    }
    
    public static int minim(int a,int b){
        if(a<b)
            return a;
        else 
            return b;
    }
    
    public static void main(String[] args){
       String input;
       input=JOptionPane.showInputDialog("Introdu primul numar:");
       int a=Integer.parseInt(input);
       input=JOptionPane.showInputDialog("Introdu al doilea numar:");
       int b=Integer.parseInt(input);
       
       System.out.println(suma(a, b));
       System.out.println(diferenta(a, b));
       System.out.println(produs(a, b));
       System.out.println(maxim(a, b));
       System.out.println(minim(a, b));
       
       
    }
}
