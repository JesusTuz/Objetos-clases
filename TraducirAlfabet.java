
package morsec;

/**
 *
 * @author Jesus Tuz
 */
public class TraducirAlfabet {
    
    public String TraALF(String cadena){
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        cadena=cadena.toUpperCase();
        String espacio = "  ";
        String ncadena= "";
        String arreglo[]= new String[36];
        
        arreglo[0]=".-";
        arreglo[1]="-...";
        arreglo[2]="-.-.";
        arreglo[3]="-..";
        arreglo[4]=".";
        arreglo[5]="..-.";
        arreglo[6]="--.";
        arreglo[7]="....";
        arreglo[8]="..";
        arreglo[9]=".---";
        arreglo[10]="-.-";
        arreglo[11]=".-..";
        arreglo[12]="--";
        arreglo[13]="-.";
        arreglo[14]="---";
        arreglo[15]=".--.";
        arreglo[16]="--.-";
        arreglo[17]=".-.";
        arreglo[18]="...";
        arreglo[19]="-";
        arreglo[20]="..-";
        arreglo[21]="...-";
        arreglo[22]=".--";
        arreglo[23]="-..-";
        arreglo[24]="-.--";
        arreglo[25]="--..";
        arreglo[26]=".----";
        arreglo[27]="..---";
        arreglo[28]="...--";
        arreglo[29]="....-";
        arreglo[30]=".....";
        arreglo[31]="-....";
        arreglo[32]="--...";
        arreglo[33]="---..";
        arreglo[34]="----.";
        arreglo[35]="-----";
        
        for(int i=0; i<cadena.length(); i++){
            if(cadena.charAt(i)==' '){
            ncadena=ncadena+espacio;
            }else{
            for(int j=0; j<alfa.length(); j++){
            if(cadena.charAt(i)==alfa.charAt(j)){
            ncadena=ncadena+arreglo[j]+' ';
            }
            }
            }
            
            
    }
return ncadena;
}
}
