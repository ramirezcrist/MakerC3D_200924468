package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;//AQUI SE GUARDA EL TEMPORAL t$ INDIVIDUAL QUE FUE GENERADO
    private String temporal; //Indica el temporal que debe ser sintetizado pues se generó

    public String getTemporal() {
        return temporal;
    }

    public void setTemporal(String temporal) {
        this.temporal = temporal;
    }
    private String etiquetaVerdadera; //Indica que etiqueta verdadera
    private String etiquetaFalsa;//indicará la etiqueta falsa
    public NodoC3D() {
        this.cad = "";
        this.etiquetaVerdadera= "";
        this.etiquetaFalsa = "";
    }

    public String getEtiquetaVerdadera() {
        return etiquetaVerdadera;
    }

    public void setEtiquetaVerdadera(String etiquetaVerdadera) {
        this.etiquetaVerdadera = etiquetaVerdadera;
    }

    public String getEtiquetaFalsa() {
        return etiquetaFalsa;
    }

    public void setEtiquetaFalsa(String etiquetaFalsa) {
        this.etiquetaFalsa = etiquetaFalsa;
    }
    
    public String getCad(){
        return cad;
    }
    
    public void setCad(String cad) {
        this.cad = cad;
    }
}
