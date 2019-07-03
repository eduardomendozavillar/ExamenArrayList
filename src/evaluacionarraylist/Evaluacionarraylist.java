
package evaluacionarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Evaluacionarraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> estudiantes = new ArrayList<String>();
        ArrayList<Double> velocidadDelEstudiante = new ArrayList<Double>();
        ArrayList<Double> tiempoDelEstudiante = new ArrayList<Double>();
        
        Scanner leerNombre = new Scanner(System.in);
        Scanner leerNumero = new Scanner(System.in);
        String nombre;
        
        int opcion = 1;
        while(opcion!=0){
            System.out.println("1 -----> Ingresar un estudiante");
            System.out.println("0 -----> cerrar ciclo");
            opcion = leerNumero.nextInt();
            if(opcion==1){
                System.out.println("Ingrese el nombre del estudiante: ");
                nombre = leerNombre.next();
                estudiantes.add(nombre);
                
            }
        }
    }
    
}
