/*
 * Nombre: Miguel Alexander Castro Escobar
 * Ce23002
 * */
package org.wcastro.poointerfaces.imprenta;

public interface Imprimible {
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    default String imprimir() {
        return TEXTO_DEFECTO;
    }

    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}
