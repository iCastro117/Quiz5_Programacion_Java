import java.util.LinkedList;

/**
 * Clase Biblioteca que representa una biblioteca de libros.
 */

class Biblioteca {
    private LinkedList<Libro> librosDisponibles = new LinkedList<>();

    /**
     * Método para registrar un libro en la biblioteca.
     * @param libro El libro que se va a registrar en la biblioteca.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro);
    }

    /**
     * Método para buscar un libro por su título en la biblioteca.
     * @param titulo El título del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     *
     * Complejidad temporal: O(N), donde N es el número de libros en la biblioteca.
     */

    public Libro buscarLibro(String titulo) {
        for (Libro libro : librosDisponibles) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Método para mostrar todos los libros disponibles en la biblioteca.
     * @return Una lista enlazada de libros disponibles.
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public LinkedList<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles;
    }
}
