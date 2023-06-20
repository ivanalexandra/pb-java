
public class Camion extends Vehicul1 {
    public Camion(double pret, String fabricant, String tara){
        super(pret,fabricant,tara);
    }

    
    public double calculeazaTaxaDrum(){
        return ((5*pret)/100);
    }
}
