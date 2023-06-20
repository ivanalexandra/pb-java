
import javax.swing.JOptionPane;



public class pb2reala {
    public static double transformaInGradeCelsius(double C, double F){
        C=(F-32)*5/9;
        return C;
    }
    
    public static double transformaInGradeFahrenheit(double C, double F){
        F=(C*9/5)+32;
        return F;
    }
    
    public static void main(String[] args){
       String input;
       input=JOptionPane.showInputDialog("Introdu temp in grade Celsius");
       double C=Double.parseDouble(input);
       input=JOptionPane.showInputDialog("Introdu temp in grade Fahrenheit:");
       double F=Double.parseDouble(input);
      
       
       System.out.println("Temperatura din grade Fahrenheit in grade Celsius:\n");
       System.out.println(transformaInGradeCelsius(C, F));
       System.out.println("Temperatura din grade Celsius in grade Fahrenheit:\n");
       System.out.println(transformaInGradeFahrenheit(C, F));
       
    }
}
