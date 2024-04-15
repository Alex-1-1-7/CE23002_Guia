/*
* Nombre: Miguel Alexander Castro Escobar
* Ce23002
* */
package org.wcastro.poointerfaces.imprenta;

public class Curriculo extends Hoja implements Imprimible{
    private String profesion;
    private String[] experiencias;

    public Curriculo(Persona persona, String profesion, String contenido) {
        super(contenido);
        this.profesion = profesion;
        this.persona = persona;
        this.experiencias = new String[0];
    }

    public Curriculo addExperiencia(String experiencia) {
        String[] nuevasExperiencias = new String[experiencias.length + 1];
        System.arraycopy(experiencias, 0, nuevasExperiencias, 0, experiencias.length);
        nuevasExperiencias[experiencias.length] = experiencia;
        experiencias = nuevasExperiencias;
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(persona.getNombre()).append(" ").append(persona.getApellido()).append("\n")
                .append("Resumen: ").append(contenido).append("\n")
                .append("Profesión: ").append(profesion).append("\n")
                .append("Experiencias: \n");
        for (String experiencia : experiencias) {
            sb.append("- ").append(experiencia).append("\n");
        }
        return sb.toString();
    }
}
