
public class TestVehicule {
  public static void main(String[] args){
      Vehicul1[] v = new Vehicul1[3];
      v[0] = new Camion(100000,"MAN","Romania");
      v[1] = new Autobuz(50000,"BMW","Germania");
      v[2] = new Microbuz(35000,"Mercedes","Turcia");
      for(int i=0;i<=2;i++)
          System.out.println(v[i].toString());
    
  }
}
