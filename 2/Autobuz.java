
public class Autobuz extends Vehicul1 {
     public Autobuz(double pret, String fabricant, String tara){
        super(pret,fabricant,tara);
    }
    
    public double calculeazaTaxaDrum(){
        return ((4*pret)/100);
    }
}
