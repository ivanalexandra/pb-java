
public abstract class Vehicul1 implements CalculTaxe , Comparable<Vehicul1> {
      protected double pret;
    protected String fabricant;
    protected String tara;
    
    public Vehicul1(double pret, String fabricant, String tara){
        this.pret=pret;
        this.fabricant=fabricant;
        this.tara=tara;
    }
    
    public double calculeazaTVA(){
        return ((19*pret)/100);
    }
    
    public double calculeazaTaxaVama(){
        if(!tara.equalsIgnoreCase("Romania"))
            return ((10*pret)/100);
        
        return 0;
    }
    
    public double calculeazaTotal(){
        return calculeazaTVA() + calculeazaTaxaDrum() + calculeazaTaxaVama();
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(" Tip autovehicul ");
        sb.append(getClass().getSimpleName());
        sb.append("\n");
        sb.append(" Fabricant ");
        sb.append(fabricant);
        sb.append("\n");
        sb.append(" Tara de fabricatie ");
        sb.append(tara);
        sb.append("\n");
        sb.append(" Pret ");
        sb.append(pret);
        sb.append("\n");
        sb.append(" Suma datorata statului ");
        sb.append(calculeazaTotal());
        sb.append("\n");
        return sb.toString();
        
    }
    
    public int compareTo(Vehicul1 ve){
        double stc = calculeazaTotal();
        double stv = ve.calculeazaTotal();
        if(stc>stv)
            return -1;
        else if(stc<stv)
            return 1;
        else 
            return (int)(pret-ve.pret);
    }
}
