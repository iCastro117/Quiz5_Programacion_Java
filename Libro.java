import java.util.LinkedList;
/**
 * Clase Libro que representa un libro con título, autor y número de páginas.
 */
class Libro {
    private String titulo; // Título del libro
    private String autor;  // Autor del libro
    private int numeroPaginas; // Número de páginas del libro

    /**
     * Constructor de la clase Libro para inicializar sus atributos.
     * @param titulo El título del libro.
     * @param autor El autor del libro.
     * @param numeroPaginas El número de páginas del libro.
     *
     * Complejidad temporal: O(1) Tiempo constante, ya que la inicialización de los atributos es una operación de tiempo constante.
     */

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Método para establecer el título del libro.
     * @param titulo El nuevo título del libro.
     */

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método para establecer el autor del libro.
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método para establecer el número de páginas del libro.
     * @param numeroPaginas El nuevo número de páginas del libro.
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Método para obtener el título del libro.
     * @return El título del libro.
     */

    public String getTitulo() {
        return titulo;
    }

    /**
     * Método para obtener el autor del libro.
     * @return El autor del libro.
     */

    public String getAutor() {
        return autor;
    }

    /**
     * Método para obtener el número de páginas del libro.
     * @return El número de páginas del libro.
     */

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
