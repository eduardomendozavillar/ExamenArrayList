
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
        Scanner leerOpcion = new Scanner(System.in);     
        String nombre;
        Double velocidad,tiempo;
        Double promedio;
        
        int opcion = 1;
        while(opcion!=0){
            System.out.println("Numero de estudiantes ingresados ("+ estudiantes.size() +")");
            System.out.println("---------------------------------");
            System.out.println("1 -----> Ingresar un estudiante");
            System.out.println("2------> Ver estudiantes");
            System.out.println("3------> Promedio de tiempo");
            System.out.println("4------> Estudiante mas rapido");
            System.out.println("5------> Tiempos por encima del promedio");
            System.out.println("0 -----> cerrar ciclo");
            System.out.println("---------------------------------");
            opcion = leerOpcion.nextInt();

            switch(opcion){
                case 1: System.out.println("---------------------------------");
                        System.out.println("Ingrese el nombre del estudiante: ");
                        nombre = leerNombre.next();
                        estudiantes.add(nombre);

                        System.out.println("Ingrese la velocidad del estudiante: ");
                        velocidad = leerNumero.nextDouble();
                        velocidadDelEstudiante.add(velocidad);

                        System.out.println("Ingrese el tiempo del estudiante: ");
                        tiempo = leerNumero.nextDouble();
                        tiempoDelEstudiante.add(tiempo);
                        System.out.println("---------------------------------");
                        break;
                
                case 2: for(int i=0 ;i<estudiantes.size();i++){
                                System.out.println("------------------------");
                                System.out.println("nombre= "+ estudiantes.get(i));
                                System.out.println("velocidad= "+velocidadDelEstudiante.get(i));
                                System.out.println("tiempo= "+tiempoDelEstudiante.get(i));
                                System.out.println("------------------------");
                            } 
                        break;
                
                case 3: promedio = 0.0;
                        for(int i=0;i<tiempoDelEstudiante.size();i++){
                                promedio = promedio + tiempoDelEstudiante.get(i);
                             }
                        promedio = promedio/tiempoDelEstudiante.size();
                        System.out.println("---------------------------------");
                        System.out.println("El promedio de tiempo es: "+ promedio);
                        System.out.println("---------------------------------");
                        break;
                        
                
            }
            
        }
        
        
        
    }
    
}
