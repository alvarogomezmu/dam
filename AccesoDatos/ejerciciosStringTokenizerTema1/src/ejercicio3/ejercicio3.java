package ejercicio3;

import Herramientas.herramientas;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ejercicio3 {

    public static void main(String args[]) {
        ArrayList<String> frases = new ArrayList();

        try {

            //Creamos el objeto de fichero para poder leer el fichero, lo abrimos en modo lectura
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\javier\\Desktop\\ejercicios\\ejercicio.txt"));

            //Para guardar lo almacenado
            String linea;

            //Leemos el fichero
            while ((linea = fl.readLine()) != null) {
                //Configuramos el stringtokenizer
                StringTokenizer st = new StringTokenizer(linea, "#");

                while (st.hasMoreTokens()) {

                    //Declaramos variables para obtener el token
                    frases.add(st.nextToken());

                }

            }

            herramientas.recorrerColeccion(frases);

            String palabra1 = "";
            String palabra2 = "";
            String palabraRepetida = "";
            int contadorVeces = 0;
            int mayor = 0;

            for (int i = 0; i < frases.size(); i++) {

                contadorVeces = 0;
                for (int z = 0; z < frases.size(); z++) {

                    //Asignamos los valores
                    palabra1 = frases.get(i);
                    palabra2 = frases.get(z);

                    if (palabra1.equals(palabra2)) {
                        contadorVeces++;
                    }

                }

                if (contadorVeces > mayor) {
                    palabraRepetida = frases.get(i);
                    mayor = contadorVeces;
                }

            }

            System.out.println("Palabra repetida: " + palabraRepetida + ", numero: " + mayor);

            //Cerramos el fichero
            fl.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
