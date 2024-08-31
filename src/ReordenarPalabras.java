
public class ReordenarPalabras {
   public String reordenarOracion(String[] palabras) {
        String[] resultado = new String[palabras.length];
        for (String palabra : palabras) {
            
            int indice = Character.getNumericValue(palabra.charAt(palabra.length() - 1)) - 1;
            
            resultado[indice] = palabra.substring(0, palabra.length() - 1);
        }
       
        return String.join(" ", resultado);
    }
} 

