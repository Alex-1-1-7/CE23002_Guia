package org.wcastro.poointerfaces.imprenta;

public class Informe extends Hoja implements Imprimible{
    private Persona revisadoPor;

    public Informe(Persona persona, Persona revisadoPor, String contenido) {
        super(contenido);
        this.persona = persona;
        this.revisadoPor = revisadoPor;
    }

    @Override
    public String imprimir() {
        return String.format("Informe escrito por: %s Revisado por: %s\n%s",
                persona.getNombre() + " " + persona.getApellido(),
                revisadoPor.getNombre() + " " + revisadoPor.getApellido(),
                contenido);
    }

}
