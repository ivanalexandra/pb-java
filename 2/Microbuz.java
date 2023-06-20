
public class Microbuz extends Vehicul1 {
     public Microbuz(double pret, String fabricant, String tara){
        super(pret,fabricant,tara);
    }

    
    public double calculeazaTaxaDrum(){
        return ((3*pret)/100);
    }
}
