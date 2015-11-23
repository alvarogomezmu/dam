/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTema3AlumnosXpath;

import Herramientas.herramientas;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import xpath.Abreviado2;

public class Ejercicio5 {

    public static void main(String args[]) {
        Document doc = null;

        try {
            doc = new SAXBuilder().build("C:\\petra\\biblioteca.xml");
        } catch (JDOMException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Abreviado2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.print("\nApartado 1:\n");
        herramientas.xPathValue(doc,"/biblioteca/libro/autor[@fechaNacimiento='28/03/1936']","fechaNacimiento");
        
        System.out.print("\nApartado 2:\n");
        herramientas.xPath(doc, "/biblioteca/libro/@fechaNacimiento");
        
        System.out.print("\nApartado 3:\n");
        herramientas.xPath(doc, "//autor");
        
        System.out.print("\nApartado 4:\n");
        herramientas.xPathValue(doc, "/biblioteca/libro/autor[@fechaNacimiento='28/03/1936']","fechaNacimiento");
    }
}
