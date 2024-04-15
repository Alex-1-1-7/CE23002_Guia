/*
 * Nombre: Miguel Alexander Castro Escobar
 * Ce23002
 * */
package org.wcastro.poointerfaces.imprenta;

abstract public class Hoja {
    protected String contenido;
    protected Persona persona;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();
}
