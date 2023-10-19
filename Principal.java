import java.util.LinkedList;

/**
 * Clase Principal que contiene el método principal main para probar la funcionalidad de la biblioteca.
 */

public class Principal {

    /**
     * Método principal main que crea una biblioteca, registra libros, busca un libro por título y muestra los libros disponibles.
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     *
     * Complejidad temporal: O(N), donde N es el número de libros registrados en la biblioteca.
     */

    public static void main(String[] args) {

        // Crear la biblioteca
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        // Crear los 5 libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
        Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
        Libro libro3 = new Libro("1984", "George Orwell", 326);
        Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro5 = new Libro("La Odisea", "Homero", 448);

        // Registrar los libros en la biblioteca
        bibliotecaKonradLorenz.registrarLibro(libro1);
        bibliotecaKonradLorenz.registrarLibro(libro2);
        bibliotecaKonradLorenz.registrarLibro(libro3);
        bibliotecaKonradLorenz.registrarLibro(libro4);
        bibliotecaKonradLorenz.registrarLibro(libro5);

        // Buscar un libro por título
        String tituloBuscado = "1984";
        Libro libroEncontrado = bibliotecaKonradLorenz.buscarLibro(tituloBuscado);
        if (libroEncontrado != null) {
            System.out.println("------------------------");
            System.out.println("Libro encontrado:");
            System.out.println("Título: " + libroEncontrado.getTitulo());
            System.out.println("Autor: " + libroEncontrado.getAutor());
            System.out.println("Número de páginas: " + libroEncontrado.getNumeroPaginas());
            System.out.println("------------------------");
        } else {
            System.out.println("------------------------");
            System.out.println("Libro no encontrado.");
            System.out.println("------------------------");
        }

        // Mostrar todos los libros disponibles
        LinkedList<Libro> librosDisponibles = bibliotecaKonradLorenz.mostrarLibrosDisponibles();
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : librosDisponibles) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Número de páginas: " + libro.getNumeroPaginas());
            System.out.println("------------------------");
        }
    }
}

