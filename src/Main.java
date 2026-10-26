public class Main {

    public static void main(String[] args)
    {

        // declarar un arreglo de 23 numeros enteros.
        int[] numeros = new int[23];

        // llenar el arreglo con numeros del 1 al 23 .
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = i + 1;
        }

        // imprimir los 23 numeros del arreglo.
        System.out.println("=== ARREGLO DE 23 NUMEROS ===");

        for (int i = 0; i < numeros.length; i++)
        {
            System.out.println("Posicion " + i + ": " + numeros[i]
            );
        }

        System.out.println("TOTAL de numeros: " + numeros.length);
    }
}