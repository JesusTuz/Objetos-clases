package objetosa;

import java.util.Scanner;

/**
 *
 * @author Jesus Tuz
 */
public class Objetosa {

    public static void main(String[] args) {
        
        Scanner li =new Scanner(System.in);
        int valor=0;
        System.out.println("Ingrese un valor: ");
        double valorS = li.nextDouble();
        do{
            
            System.out.println("\nEl valor actual de lado es >[  "+valorS+"  ]<");
            System.out.println("¿Qué desea hacer con el valor? \n1)Area \n2)Perimetro cuadrado \n3)Cubo \n4)Perimetro cubo \n5)Cancelar \n6)Salir");
            valor=li.nextInt();
            cubo accs = new cubo();
            switch(valor){
                case 1:
                    double salida1 = accs.cuad(valorS);
                    System.out.println(">>>El valor del area es de: "+salida1);
                    break;
                case 2:
                    double salida2 = accs.per1(valorS);
                    System.out.println(">>>El valor del perimetro cuadrado es: "+salida2);
                    break;
                case 3:
                    double salida3 = accs.cub(valorS);
                    System.out.println(">>>El valor del cubo es: "+salida3);
                    break;
                case 4:
                    double salida4 = accs.per2(valorS);
                    System.out.println(">>>El valor del perimetro cubo es: "+salida4);
                    break;
                case 5:
                    System.out.println(">>>Usted cancelo");
                    Objetosa.main(null);
                    break;
                case 6:
                    System.out.println(">>>Bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println(">>>Seleccione un valor de la lista");
                    break;
            }
        }while(valor!=6);
        
       
    }
    
}
