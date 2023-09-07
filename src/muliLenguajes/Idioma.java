/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muliLenguajes;

import java.io.IOException;
import java.util.Properties;

/**
 * Esta clase extiende la clase Properties y permite cargar un archivo de propiedades
 * en función del idioma especificado.
 */
public class Idioma extends Properties {
    private static final long serialVersionUID = 1L;

    /**
     * Constructor de la clase Idioma.
     * @param idioma El idioma para el cual se desea cargar el archivo de propiedades.
     */
    public Idioma(String idioma) {
        // Se utiliza un switch para determinar qué archivo de propiedades cargar
        // en función del valor del parámetro idioma.
        switch (idioma) {
            case "Español":
                getProperties("espanol.properties");
                break;
            case "Inglés":
                getProperties("ingles.properties");
                break;
            default:
                // Se ha corregido el nombre del archivo de propiedades a cargar en el caso default.
                getProperties("espanol.properties");
        }
    }

    /**
     * Este método carga el archivo de propiedades especificado en el objeto Properties actual.
     * @param idioma El nombre del archivo de propiedades a cargar.
     */
    private void getProperties(String idioma) {
        try {
            // Se utiliza el método load de la clase Properties para cargar el contenido
            // del archivo de propiedades en el objeto Properties actual.
            this.load(getClass().getResourceAsStream(idioma));
        } catch (IOException ex) {
            // Si ocurre una excepción de tipo IOException durante la carga del archivo,
            // se imprime la traza de la pila utilizando el método printStackTrace del objeto excepción.
            ex.printStackTrace();
        }
    }
}

