package ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class ejercicio5 
{
    public static void main(String args[]) 
    {
        int cont = 0;
        
        try 
        {
            //Creamos el objeto de fichero para poder leer el fichero, lo abrimos en modo lectura
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\mezclas.txt"));

            //Objetos para escribir en los ficheros
            BufferedWriter fautor = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Desktop\\autor.txt"));
            BufferedWriter fcorreo = new BufferedWriter(new FileWriter("C:\\Users\\Alumnot\\Desktop\\correo.txt"));

            //Para guardar lo almacenado
            String linea;

            //Leemos el fichero
            while ((linea = fl.readLine()) != null) 
            {
                //Configuramos el stringtokenizer
                StringTokenizer st = new StringTokenizer(linea, "=:");

                while (st.hasMoreTokens()) 
                {
                    if (cont < 1) 
                    {
                        //Escribimos los datos en el fichero autor
                        String nomtitulo = st.nextToken();
                        fautor.write(nomtitulo + "=");
                        String titulo = st.nextToken();
                        fautor.write(titulo + ":");
                        String nomidioma = st.nextToken();
                        fautor.write(nomidioma + "=");
                        String idioma = st.nextToken();
                        fautor.write(idioma + ":");
                        String nomautor = st.nextToken();
                        fautor.write(nomautor + "=");
                        String autor = st.nextToken();
                        fautor.write(autor);

                        //Escribimos los datos en correo
                        String nomemail = st.nextToken();
                        fcorreo.write(nomemail + "=");
                        String email = st.nextToken();
                        fcorreo.write(email);
                        String extra = st.nextToken();
                        if (extra.equals(" ")) 
                        {
                            fcorreo.write(": ");
                        } else 
                        {
                            fcorreo.write(":" + extra);
                        }
                        String extra1 = st.nextToken();
                        if (extra1.equals(" ")) 
                        {
                            fcorreo.write("= ");
                        } else {
                            fcorreo.write("=" + extra1);
                        }
                    } 
                    else 
                    {
                        //Introducimos un salto de linea en autor
                        fautor.newLine();

                        //Introducimos un salto de linea en autor
                        fcorreo.newLine();

                        //Escribimos los datos en el fichero autor
                        String nomtitulo = st.nextToken();
                        fautor.write(":" + nomtitulo + "=");
                        String titulo = st.nextToken();
                        fautor.write(titulo + ":");
                        String nomidioma = st.nextToken();
                        fautor.write(nomidioma + "=");
                        String idioma = st.nextToken();
                        fautor.write(idioma + ":");
                        String nomautor = st.nextToken();
                        fautor.write(nomautor + "=");
                        String autor = st.nextToken();
                        fautor.write(autor);

                        //Escribimos los datos en correo
                        String nomemail = st.nextToken();
                        fcorreo.write(":" + nomemail + "=");
                        String email = st.nextToken();
                        fcorreo.write(email);
                        String extra = st.nextToken();
                        if (extra.equals(" ")) 
                        {
                            fcorreo.write(": ");
                        } else {
                            fcorreo.write(":" + extra);
                        }
                        String extra1 = st.nextToken();
                        if (extra1.equals(" ")) 
                        {
                            fcorreo.write("= ");
                        } else {
                            fcorreo.write("=" + extra1);
                        }
                    }
                    //Aumentamos contador
                    cont++;
                }
            }

            System.out.println("Datos de autor guardado en autor.txt con exito...");
            System.out.println("Datos de email guardado en correo.txt con exito...\n");

            //Cerramos el fichero
            fl.close();
            fautor.close();
            fcorreo.close();
            
        } catch (IOException e) 
        {
            System.out.println("Error");
        }

        System.out.println("Leemos el fichero de autor\n");
        //Leemos el fichero de autor
        try {

            //Creamos el objeto de fichero para poder leer el fichero, lo abrimos en modo lectura
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\autor.txt"));

            //Para guardar lo almacenado
            String linea;

            //Leemos el fichero
            while ((linea = fl.readLine()) != null) 
            {
                //Configuramos el stringtokenizer
                StringTokenizer st = new StringTokenizer(linea, "=:");
                while (st.hasMoreTokens()) 
                {
                    //Escribimos los datos en el fichero autor
                    String nomtitulo = st.nextToken();
                    String titulo = st.nextToken();
                    String nomidioma = st.nextToken();
                    String idioma = st.nextToken();
                    String nomautor = st.nextToken();
                    String autor = st.nextToken();

                    System.out.println(nomtitulo + " " + titulo + " " + nomidioma + " " + idioma + " " + nomautor + " " + autor);
                }
            }
            
            //Cerramos el fichero
            fl.close();
        } catch (IOException e) 
        {
            System.out.println("Error");
        }

        System.out.println("Leemos el fichero de correo\n");
        //Leemos el fichero de correo
        try 
        {
            //Creamos el objeto de fichero para poder leer el fichero, lo abrimos en modo lectura
            BufferedReader fl = new BufferedReader(new FileReader("C:\\Users\\Alumnot\\Desktop\\correo.txt"));

            //Para guardar lo almacenado
            String linea;

            //Leemos el fichero
            while ((linea = fl.readLine()) != null) 
            {
                //Configuramos el stringtokenizer
                StringTokenizer st = new StringTokenizer(linea, "=:");
                while (st.hasMoreTokens()) 
                {
                    String nomemail = st.nextToken();
                    String email = st.nextToken();
                    String extra = st.nextToken();
                    if (extra.equals(" ")) 
                    {
                        extra = "";
                    }
                    String extra1 = st.nextToken();
                    if (extra1.equals(" ")) 
                    {
                        extra1 = "";
                    }
                    System.out.println(nomemail + " " + email + " " + extra + " " + extra1);
                }
            }
            //Cerramos el fichero
            fl.close();
        } catch (IOException e) 
        {
            System.out.println("Error");
        }
    }
}
