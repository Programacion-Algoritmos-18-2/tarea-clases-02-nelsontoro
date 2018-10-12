
package Paquete3;

public class precio {

    private double euros;

    public double obtener() {
        return euros;
    }

    public double agregar(double x) {
        euros = x;
        return 0;
    }

    public precio() {
        agregar(30.2);
    }
    
    public precio (double y){
        agregar(y);
    }
            
}

