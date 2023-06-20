
import javax.swing.JOptionPane;

public class pb6 {
    public static double factorial(int n){
        double f=1;
        int i;
        for(i=1;i<=n;i++){
            f*=i;}
        return f;
    }
    
    public static double exponentiala(double x,double epsilon){
        double s=1;
        double t=1;
        int n=1;
        while(Math.abs(t)>=epsilon){
            t=Math.pow(x,n)/factorial(n);
            s+=t;
            n++;
        }
        return s;
    }
    
    public static void main(String[] args){
        String input;
        input=JOptionPane.showInputDialog("Introdu valoarea lui x:");
        double x=Double.parseDouble(input);
        input=JOptionPane.showInputDialog("Introdu valoarea lui Epsilon:");
        double epsilon=Double.parseDouble(input);
        double exp=exponentiala(x,epsilon);
        
        System.out.println("Valoarea lui e la  "+ x +" este: "+exp);
    }
}
