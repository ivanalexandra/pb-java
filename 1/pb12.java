




public class pb12 {
    
    /**
     *
     * @param m
     * @param n
     * @return
     */
    public static int fctack(int m, int n){
        if(m==0)
            return n+1;
        else if(n==0)
            return fctack(m-1,1);
        else if(m>0&&n>0)
            return fctack(m-1,fctack(m,n-1));
        
        return 0;//??????? dc mi a pus netbeans asta?
        
    }
    public static void main(String[] args){
       int m=2,n=2;
       System.out.println(fctack(m,n));
        
        
    }
}
