package morsec;

import java.util.Scanner;

/**
 *
 * @author Jesus Tuz
 */
public class Morsec {

    public static void main(String[] args) {
        
        Scanner le = new Scanner(System.in);
        int pRe;
        do{
        System.out.println(">¿Usted desea convertir a morse o traducirlo? \n 1)Convertir 2)Traducir 3)Salir \n(Responda con el numero correspondiente)");
        pRe = le.nextInt();
        String sLi = le.nextLine();
        
        switch(pRe){
        
        case 1:
        System.out.println("> Deme una cadena a convertir: \n(Recuerde usar solo simbolos del sistema alfanumerico ingles y no abusar de los espacios en blanco).");
        String entra1 = le.nextLine();
        
        TraducirAlfabet tra = new TraducirAlfabet();
        String nt = tra.TraALF(entra1);
        System.out.println("Se obtuvo: \n"+nt+"\n \n");
        break;
        case 2:
        System.out.println("> Deme una cadena a traducir: \n(Favor de  no abusar de los espacios en blanco).");
        String entra2 = le.nextLine();
        
        TraducMors tram = new TraducMors();
        String pol = tram.TraMor(entra2);
        System.out.println("Se obtuvo: \n"+pol+"\n \n"); 
        break;
        case 3:
                System.out.println("Bye");
                System.exit(0);
            break;
        }

        }while(pRe!=3);
        
        
    }
    
}
