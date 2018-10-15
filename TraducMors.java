package morsec;

/**
 *
 * @author Jesus Tuz
 */
public class TraducMors {
    
    public String TraMor(String cadena){
        String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 ";
        String ncadena= "";
        cadena=cadena.toUpperCase();
        String arreglo[]= new String[37];
        
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
        arreglo[36]="a";
        
        String arr[]=new String [1];
        arr[0]="    ";
        
        
        String cadena2=cadena.replace(arr[0], "a" );
        String separar[]=cadena2.split(" ");
        for(int i=0; i<separar.length;i++){
            for(int j=0; j<37; j++){
            if(separar[i].equals(arreglo[j])){
                ncadena=ncadena+alfa.charAt(j);
            }
            }
        }
    return ncadena;
    
    }
    }
    

