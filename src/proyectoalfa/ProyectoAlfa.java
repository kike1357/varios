
package proyectoalfa;

import java.util.Scanner;


public class ProyectoAlfa {

    
    public static void main(String[] args) {
        //entrada por teclado
        float base,altura;
        Scanner obx = new Scanner (System.in);
        System.out.println("teclea base:");
        base =obx.nextFloat();
        System.out.println("teclea altura:");
        altura=obx.nextFloat();
        System.out.println("area="+base*altura/2);
        
    }
        
    
}
