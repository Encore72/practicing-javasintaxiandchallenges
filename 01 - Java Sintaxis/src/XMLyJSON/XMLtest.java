package XMLyJSON;

import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
 * XML (eXtensible Markup Language) es otro formato de texto utilizado para
 * almacenar y transportar datos, pero con algunas diferencias clave respecto 
 * a JSON. XML es para cuando necesitamos una estructura de datos muy rígida 
 * (es fuertemente tipado), o si quieres validar los datos de forma estricta 
 * o si necesitas crear un lenguaje específico de dominio, a diferencia de JSON 
 * que es para cuando necesitas un formato más ligero y flexible, si quieres 
 * intercambiar datos rápidamente entre aplicaciones web o si prefieres una
 * sintaxis más cercana a JavaScript.
 * 
 * Para leer y usar los XML en Java utilizamos la API DOM (Document Object Model) que es una interfaz
 * que nos permite interactuar con documentos HTML, XML y SVG que son documentos tipo árbol donde cada
 * elemento es una rama, y la API DOM nos proporciona herramientas (clases, metodos, propiedades...) 
 * para acceder a cada uan de estas ramas, modificarlas, eliminarlas o crear nuevas.
 * 
 */

public class XMLtest {

    public static void main(String[] args) {
        try {
            // Crear el objeto DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parsear el archivo XML (parsear = leer/analizar)
            Document document = builder.parse("D:\\GitHub-Repositories\tests-primerospasos\01 - Java Sintaxis\\lib\\XMLtest.xml");


            // Obtener el elemento raíz (El elemento raíz en XML [en este ejemplo es biblioteca] es como el tronco principal de un árbol: es el primer y único elemento 
                                        // que contiene a todos los demás elementos del documento. Imagina un documento XML como una estructura jerárquica, donde cada 
                                        // elemento está anidado dentro de otro. El elemento raíz es el nivel más alto de esta jerarquía y engloba todo el contenido del documento.)
            Element root = document.getDocumentElement();

            // Obtener todos los elementos con el tag "libro"
            NodeList libros = root.getElementsByTagName("libro");

            // Iterar sobre los libros
            for (int i = 0; i < libros.getLength(); i++) {
                Node libro = libros.item(i);
                if (libro.getNodeType() == Node.ELEMENT_NODE) {
                    Element libroElement = (Element) libro;
                    String titulo = libroElement.getElementsByTagName("titulo").item(0).getTextContent();
                    String autor = libroElement.getElementsByTagName("autor").item(0).getTextContent();

                    System.out.println("Título: " + titulo);
                    System.out.println("Autor: " + autor);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
