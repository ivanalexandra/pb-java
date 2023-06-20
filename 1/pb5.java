
public class pb5 {
    public static boolean nrperf(int n){
        int s=0;
        int i;
        for(i=1;i<n;i++){
            if(n%i==0)
                s+=i;
        }
        return s==n;
    }
    
    public static void main(String[] args){
        System.out.println("Nr perfecte intre 1 si 10000 sunt:\n");
        int i;
        for(i=1;i<=10000;i++){
            if(nrperf(i))
                System.out.println(i);
        }
    }
}
