import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {

        // 0 - Revertir texto
        String texto = "Este es un texto para ser revertido";
        System.out.println(texto);
        String textReverse = reverse(texto);
        System.out.println(textReverse);

        // 1 - Array unidimensional
        String[] unidimensional = new String[] { "1", "2", "3", "4", "5" };
        for (String i : unidimensional) {
            System.out.println(i);
        }

        // 2 - Array bidimensional
        int[][] bidimensional = new int[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 }, };
        for (int i = 0; i < bidimensional.length; i++) {
            for (int j = 0; j < bidimensional[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "]: " + bidimensional[i][j]);
            }
        }

        // 3 - Vector
        Vector vectorInt = new Vector<Integer>();
        vectorInt.add(1);
        vectorInt.add(2);
        vectorInt.add(3);
        vectorInt.add(4);
        vectorInt.add(5);
        System.out.println(vectorInt);
        vectorInt.remove(1);
        vectorInt.remove(1);
        System.out.println(vectorInt);

        // 4 - Indicar el problema del vector
        /*
         * En simples palabras el problema del vector es que,
         * al superar su limite de capacidad debe de copiar los datos actuales
         * en un nuevo array a la vez que crea otro nuevo array del doble del tamanio
         */

        // 5 - ArrayList and LinkedList

        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        LinkedList linkedList = new LinkedList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            linkedList.add(arrayList.get(i));
        }
        System.out.println("arrayList: " + arrayList.toString());
        System.out.println("linkedList: " + linkedList.toString());

        // 6 - ArrayList
        ArrayList arrayList2 = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            arrayList2.add(i); // agrega numeros del 1 al 10
        }
        System.out.println("arrayList2: " + arrayList2.toString());
        for (int i = 0; i <= arrayList2.size(); i++) {
            int tmp = (int) arrayList2.get(i);
            if ((tmp % 2) == 0) {
                arrayList2.remove(arrayList2.get(i));
            }
        }
        System.out.println("arrayList2: " + arrayList2.toString());

        // 7 - dividePorCero

        int numero1 = 9;
        int numero2 = 0;

        try {
            dividePorCero(numero1,numero2);
            System.out.println("Demo de código");
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }

        // 8 - InputStream y PrintStram
        String fileIn = "file";
        String fileOut = "";
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();
        } catch (Exception e) {
        }

        // 9 - Todo lo de arriba y este hashMap

        HashMap hashMap = new HashMap<String, Integer>();
        hashMap.put("name", 1);

    }

    public static String reverse(String texto) {

        String textReverse = "";

        for (int i = texto.length() - 1; i >= 0; i--) {

            textReverse += texto.charAt(i);

        }

        return textReverse;
    }

    public static float dividePorCero(int num1, int num2) throws ArithmeticException {

        float numero = num1 / num2;
        return numero;
    }
}
