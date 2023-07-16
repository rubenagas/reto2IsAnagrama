import java.util.Arrays;
import java.util.Scanner;

/* * Reto de Mouredev:
        # * Reto #1
        # * ¿ES UN ANAGRAMA?

        # * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
        # * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
        # * NO hace falta comprobar que ambas palabras existan.
        # * Dos palabras exactamente iguales no son anagrama.

 */
public class Main {
    public static void main(String[] args) {

        String pal1 = new String();
        String pal2 = new String();

        //Solicitar la palabra número 1
        System.out.println("Introduce la palabra 1");
        Scanner myObj = new Scanner(System.in);

        pal1 = myObj.nextLine();

        //Solicitar la palabra número 2
        System.out.println("Introduce la palabra 2");
        myObj = new Scanner(System.in);

        pal2 = myObj.nextLine();

        //Imprimir las dos palabras, para verificar el valor
        System.out.println(pal1 + " - " + pal2);

        //Convertir las dos palabras en minúsculas para poder compararlas
        pal1 = pal1.toLowerCase();
        pal2 = pal2.toLowerCase();

        //Imprimir las palabras en minúsculas
        System.out.println(pal1 + " - " + pal2);

        //Introducir cada palabra a un Vector para poder ordenarlas
        char[] ch = pal1.toCharArray();
        Arrays.sort(ch);

        char[] ch2 = pal2.toCharArray();
        Arrays.sort(ch2);

        //Llamar a la función isAnagrama
        boolean resultado = isAnagrama(pal1,pal2, ch, ch2);
        System.out.println(resultado);

    }

    //Función para comparar las palabras
    private static boolean isAnagrama(String par1, String par2, char[] par3, char[] par4){
        boolean result = false;
        if(par1.equals(par2) || !Arrays.equals(par3, par4)){
            result = false;
        } else if (Arrays.equals(par3, par4)) {
            result = true;
        }
        return result;
    }

}