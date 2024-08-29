public class ReordenarOracion {
    public static String reordenarOracion(String[] palabras) {
        // Crear un array para almacenar las palabras reordenadas
        String[] resultado = new String[palabras.length];
        
        // Recorrer cada palabra en el array
        for (String palabra : palabras) {
            // Extraer el número al final de la palabra
            int posicion = Character.getNumericValue(palabra.charAt(palabra.length() - 1)) - 1;
            
            // Eliminar el número al final de la palabra
            String palabraLimpia = palabra.substring(0, palabra.length() - 1);
            
            // Colocar la palabra en la posición correcta en el array resultante
            resultado[posicion] = palabraLimpia;
        }
        
        // Unir las palabras en una oración
        return String.join(" ", resultado);
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String[] palabras = {"esta2", "bien4", "muy3", "esto1"};
        String resultado = reordenarOracion(palabras);
        System.out.println(resultado);  // Salida: "esto esta muy bien"
    }
}
