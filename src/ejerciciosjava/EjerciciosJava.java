package ejerciciosjava;
import java.util.Arrays;

/**
 * Esta clase esta hecha para practicar los arrays
 * @author Gonzalo Izuzquiza
 */

public class EjerciciosJava {
    /**
     * Primer ejercicio java nivel1 01
     * Este método busca los numeros máximos de un array de clase int.
     * 
     * @param listaNumeros[] Este es el array a comprobar.
     * @return Devuelve los dos números máximos.
     */
    public int[] maximo(int[] listaNumeros) {
	int[] numerosMaximos = new int[2];	//Array para guardar los máximos
	
	for (int i = 0; i < listaNumeros.length; i++) {				
	    if (numerosMaximos[0] < listaNumeros[i]) {				
		numerosMaximos[1] = numerosMaximos[0];				
		numerosMaximos[0] = listaNumeros[i];
	    } else if (numerosMaximos[1] < listaNumeros[i]) {	//Ahora comprobamos la segunda posicion, y guardamos su maximo
		numerosMaximos[1] = listaNumeros[i];				
	    }
	}
	return numerosMaximos;
    }
    
     //Segundo ejercicio. Palindromo. Ejercicios java nivel1 02
   
    
    public boolean palindromo(String frase){
       String cadena1=" ";  //String donde se va a guardar la cadena sin espacios, de izquierda a derecha.
       String cadena2=" ";  //String donde se va a guardar la cadena sin espacios de derecha a izquierda.
       
               //EL primer bucle analiza el String frase de izquierda a derecha.
       for(int i=0;i<frase.length(); i++){ 
          if(frase.charAt(i) != ' '){ 
            cadena1+=frase.charAt(i);
          }
            System.out.println(cadena1);
  
       }
       //Analiza la frase de derecha a izquierda.
       for(int j=frase.length()-1; j>=0; j--){
           if(frase.charAt(j) != ' '){  
           cadena2+=frase.charAt(j);
           }
               System.out.println(cadena2);     
       }
       
       if(cadena1.equals(cadena2)){ //Si los dos strings son iguales, retorna true.
         return true;
       }else{
         return false;
       }
       
    }
 
        // Isograma. Ejercicios java nivel0 03
    
    public boolean isograma(String iso){
        String cadena = " ";//Guardaremos lo que queremos comparar
        cadena=cadena.toLowerCase();//evitamos problemas con mayusculas
        String caracter=" ";//Guardaremos el char
           
        for(int i=0; i<iso.length(); i++){
            
            caracter=iso.substring(i,i+1);  //Comprobamos
            
           if(cadena.contains(caracter)){ //Si el string cadena ya lo contiene, devolvemos false.
               return false;
           }else if(i<iso.length()){  
             cadena+=iso.substring(i,i+1);  
           }
           
           System.out.println(cadena);         //Comprobación.
        } 
        return true;  //Retorna true en caso que no haya ningún char repetido.
    }
    
    // Calendario. Ejercicio java nivel1 04
    
    public String calendario(int n){
       String auxiliar=""; //string donde vamos a guardar el calendario.
       int contador=1; //inicio del calendario.
               
        for(int j=0;j<50;j++){
            
         for(int i=0; i<7; i++){
           if(i<n){  //si la i es menor al parámetro n que le pasamos, guarda xx espacio en auxiliar.
            auxiliar+="xx ";
           }else {
               // ponemos n a 0 para que deje de cumplirse la condición anterior.
             n=0; 
             if(contador<10){ 
               auxiliar+="0"+contador+" ";
             }else{ 
             auxiliar+=contador+" ";
             }
             contador++;   //imprimimos el calendario.
             if(contador==32){
                 while(i<6){ 
                  auxiliar+="xx ";
                  i++;
                 }
                    return auxiliar; 
                } 
           }
        }
         auxiliar+="\n"; //con esto hacemos el salto de linea al mostrar el resultado por consola.
        }
       
       return auxiliar; 
    }
    
    
    // Anagrama. Ejercicios java nivel1 05
    
    
     public boolean anagrama(String palabra1, String palabra2){
            palabra1.toLowerCase(); //evitamos problemas con mayúsculas.
            palabra2.toLowerCase();
            String cadena="";   //donde vamos a guardar el resultado.
            int contador=0;   //contador para determinar la posición y poder recorrer todo el string.
            boolean presente=false; //booleano que cambiará a true cuando detecte la letra.
            
            
            for(int i=0; i<palabra1.length();i++){
                contador=0;        
                presente=false;
                
              if(palabra1.length() != palabra2.length()){ //Si las longitudes varían, devuelve false.
                return false;
              }
              while(contador<palabra1.length() && presente==false){  
                 if(palabra1.charAt(i)==palabra2.charAt(contador)){  
                   cadena+=palabra1.substring(i,i+1);                
                   presente=true;
                 }
                 contador++;
              System.out.println(cadena);
              }
              
            }
           
            if(cadena.equals(palabra1)){  //Si el nuevo string cadena es igual a palabra1 devuelve true.
               return true;
            }
            return false;
    }
    
      
    // Acronimo. Ejercicios java nivel1 06
     
    public String acronimo(String acro){
       String cadena="";
       String primera=""; // guardamos la primera palabra
       
       for(int i=0; i<acro.length();i++){
           
         if(!acro.substring(0,1).equals("y") && !acro.substring(0,1).equals("e") &&
                 !acro.substring(0,2).equals("de") && !acro.substring(0,2).equals("la") && !acro.substring(0,3).equals("las")){
            primera=acro.substring(0,1);
         }
        
         if(acro.charAt(i)==' ' && (!acro.substring(i+1,i+2).equals("y") && !acro.substring(i+1,i+2).equals("e") &&
                 !acro.substring(i+1,i+3).equals("de") && !acro.substring(i+1,i+3).equals("la") && !acro.substring(i+1,i+4).equals("las"))){
          i++;
          cadena+=acro.substring(i,i+1);
         }
           
       }
       return primera+cadena;
    }
    
    
    
}