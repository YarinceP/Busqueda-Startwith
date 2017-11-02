package sample.Modelos;


import javafx.scene.control.TextField;
import sample.Controladores.Controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by User on 23/10/2017.
 */
//Clase Persona
public class Persona {

    //Atributos de la Clase Persona
    public String nombre;
    public String apellido;
    public String edad;


    //Arreglo
    private static Persona[] listaPersonas = {
            new Persona("David", "Delcid", "20"),
            new Persona("Yarince", "Padilla", "21"),
            new Persona("Orlando", "Calix", "20"),
            new Persona("Tulio", "Garcia", "20"),
            new Persona("Felix", "Peralta", "21"),
            new Persona("David", "Martinez", "22"),
            new Persona("Yankel", "Aragon", "24"),
            new Persona("Yariza", "Munguia", "24"),
            new Persona("Yanuar", "Guerrero", "24"),
    };

    //Constructor
    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Metodo estatico que devuelve resultados especificos
    public static Persona buscarPorPosicion(String buscanombre) {
        int encontrados = 0;
        try{
        for (int i = 0; i < listaPersonas.length; i++) {
            if (listaPersonas[i].nombre.startsWith(buscanombre)) {
                System.out.println(listaPersonas[i].nombre + " " + listaPersonas[i].apellido + " " + listaPersonas[i].edad);
                encontrados += encontrados;
            }
        }}catch (NullPointerException e){
            if (encontrados==0) {
                System.out.println("No hay ninguna coincidencia");
            }
        }

        return null;
    }
}
