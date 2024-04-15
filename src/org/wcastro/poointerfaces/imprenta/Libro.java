/*
 * Nombre: Miguel Alexander Castro Escobar
 * Ce23002
 * */
package org.wcastro.poointerfaces.imprenta;
import java.util.ArrayList;
import java.util.List;
public class Libro implements Imprimible{
    private Persona autor;
    private String titulo;
    private Genero genero;
    private List<Pagina> paginas;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Pagina pagina) {
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder detalles = new StringBuilder();
        detalles.append("Titulo: ").append(titulo).append("\n")
                .append("Autor: ").append(autor.getNombre()).append(" ").append(autor.getApellido()).append("\n")
                .append("Genero: ").append(genero).append("\n");
        for (Pagina pagina : paginas) {
            detalles.append(pagina.imprimir()).append("\n");
        }
        return detalles.toString();
    }
}
