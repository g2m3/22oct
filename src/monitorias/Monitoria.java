package monitorias;
import java.util.Scanner;

public class Monitoria {
    // no se ha probado la eficacia de la ecuación
    private static double arctan(double x, int n){
        if(x>=-1&&x<=1){
            double acumulado = 0.0;
            for(int i=0; i<=n; i++){
                acumulado += (Math.pow((-1), i))*(Math.pow(x, 2*i+1))/(2*i+1);
            }
            return acumulado;
        } 
        return -1000.0;
    }
    
    public static void main(String[] args) {
        System.out.println(arctan(0.5, 100));        
    }    
}
