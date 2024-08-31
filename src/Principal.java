public class Principal {
    public static void main(String[] args) {
       
        System.out.println("Ejemplo 1: Reordenar Palabras");
        ReordenarPalabras reordenarPalabras = new ReordenarPalabras();
        String[] palabras1 = {"esta2", "bien4", "muy3", "esto1"};
        System.out.println("Entrada: " + String.join(" ", palabras1));
        String resultado1 = reordenarPalabras.reordenarOracion(palabras1);
        System.out.println("Salida: " + resultado1);
        System.out.println();

        
        System.out.println("Ejemplo 2: Fusionar y Ordenar Arreglos");
        FusionarArreglos fusionarArreglos = new FusionarArreglos();
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        int[] resultado2 = fusionarArreglos.fusionarYOrdenar(nums1, nums2);
        System.out.println("Entrada: nums1=" + java.util.Arrays.toString(nums1) + " nums2=" + java.util.Arrays.toString(nums2));
        System.out.println("Salida: " + java.util.Arrays.toString(resultado2));
        System.out.println();

        
        System.out.println("Ejemplo 3: Reordenar Palabras");
        String[] palabras2 = {"programar3", "en1", "es2", "genial4"};
        System.out.println("Entrada: " + String.join(" ", palabras2));
        String resultado3 = reordenarPalabras.reordenarOracion(palabras2);
        System.out.println("Salida: " + resultado3);
        System.out.println();

        
        System.out.println("Ejemplo 4: Fusionar y Ordenar Arreglos");
        int[] nums3 = {10, 12, 15};
        int[] nums4 = {5, 8, 11};
        int[] resultado4 = fusionarArreglos.fusionarYOrdenar(nums3, nums4);
        System.out.println("Entrada: nums3=" + java.util.Arrays.toString(nums3) + " nums4=" + java.util.Arrays.toString(nums4));
        System.out.println("Salida: " + java.util.Arrays.toString(resultado4));
        System.out.println();

        
        System.out.println("Ejemplo 5: Reordenar Palabras");
        String[] palabras3 = {"Python4", "Java1", "C++2", "es3"};
        System.out.println("Entrada: " + String.join(" ", palabras3));
        String resultado5 = reordenarPalabras.reordenarOracion(palabras3);
        System.out.println("Salida: " + resultado5);
        System.out.println();
    }
}
