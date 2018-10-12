
package Paquete3;


public class principal {
   public static void main(String[] args) {
  
        precio p;
        p = new precio();
        precio n = new precio(25.9);
        
        System.out.println(p.obtener());
        System.out.println(n.obtener());

    }

    
}