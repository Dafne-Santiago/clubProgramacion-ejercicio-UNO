
public class ejercicioUno
{
    private static int c;
    public ejercicioUno(){
    }

    public static String serie(int d){
        if(d<=0) return String.valueOf(d);
        if(d==1) return String.valueOf(1);
        if(d%2==0)c=d/2;
        if(d%2==1)c= (d*3)+1;
        return String.valueOf(d)+" "+ serie(c);
          
    }
    
    public static void main(String [] args){
        System.out.println(serie(-22));
    }
}
