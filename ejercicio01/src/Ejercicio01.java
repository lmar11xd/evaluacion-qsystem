import model.Persona;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio01 {

    public static void imprimirLista(List<Persona> personas) {
        personas.forEach((final Persona persona) -> System.out.println(persona));
    }


    public static void main(String[] args) {
        /* Ejercicio 1:
            Crear una lista del Objeto Persona (dni, appPaterno, appMatterno) y deberás ordenar la
            lista por DNI y de ahí por apellido paterno, pintando la lista desordenada y de ahí
            ordenada.
        */
        List<Persona> personas = Arrays.asList(
                new Persona("77102030","Lopez", "Vidal"),
                new Persona("33405060","Zegarra", "Bulnes"),
                new Persona("44203040","Gutierrez", "Diaz"),
                new Persona("77506070","Salinas", "Salgado"),
                new Persona("31203040","Carbajal", "Fernandez"),
                new Persona("55607080","Alejos", "Hidalgo")
        );

        System.out.println("Lista Desordenada");
        imprimirLista(personas);

        System.out.println("\nLista Ordenada Por DNI");
        personas.sort(Comparator.comparing(Persona::getDni));
        imprimirLista(personas);

        System.out.println("\nLista Ordenada Por Apellido Paterno");
        personas.sort(Comparator.comparing(Persona::getAppPaterno));
        imprimirLista(personas);

        System.out.println("\nLista Ordenada Por DNI y Apellido Paterno");
        personas.sort(Comparator.comparing(Persona::getDni).thenComparing(Persona::getAppMaterno));
        imprimirLista(personas);
    }
}
