package org.compi2.codigo3d.parser;

/**
 *
 * @author esvux
 */
public class ControlC3D {
    
    private static int temp = 0;
    private static String c3d = ""; //aqui se llevará todo el string
    private static int tempEstado = 0;
    private static String etiquetasVerdaderas = "";
    private static String etiquetasFalsas = "";

    public static String getEtiquetasVerdaderas() {
        return etiquetasVerdaderas;
    }

    public static void setEtiquetasVerdaderas(String etiquetasVerdaderas) {
        if (ControlC3D.etiquetasVerdaderas.equals(""))
        {
            ControlC3D.etiquetasVerdaderas =  etiquetasVerdaderas ;
        }else{
        ControlC3D.etiquetasVerdaderas +=  "," + etiquetasVerdaderas ;
        }
        
        
    }

    public static String getEtiquetasFalsas() {
        return etiquetasFalsas;
    }

    public static void setEtiquetasFalsas(String etiquetasFalsas) {
         if (ControlC3D.etiquetasFalsas.equals(""))
        {
            ControlC3D.etiquetasFalsas =  etiquetasFalsas ;
        }else{
        ControlC3D.etiquetasFalsas +=  "," + etiquetasFalsas ;
        }
    }
    
    public static void eliminarEtiqueta(String etiqueta, Integer tipo){
    if(tipo==1)//etiquetas verdaderas
    {
        ControlC3D.etiquetasVerdaderas = ControlC3D.etiquetasVerdaderas.replace(etiqueta, "");
    }
    else
    {
    ControlC3D.etiquetasFalsas = ControlC3D.etiquetasFalsas.replace(etiqueta, "");
    }
    }
    /**
     * Reinicia las variables estáticas relacionadas con la generación del
     * código de tres direcciones.
     */
    public static void reiniciar(){
        temp = 0;
        c3d = "";
        tempEstado = 0;
        etiquetasVerdaderas = "";
        etiquetasFalsas = "";
    }
    
    /**
     * Genera el siguiente temporal.
     * @return El siguiente temporal (t$#)
     */
    public static String generaTemp(){
        return "t$"+temp++;
    }
    /**
     * Genera el siguiente estado temporal.
     * @return El siguiente temporal (L$#)
     */
    public static String generarEtiqueta(){
    return "L$"+tempEstado++;
    }
    /**
     * Agrega la sentencia que recibe como parámetro a la cadena de código
     * de tres direcciones que se va generando hasta ese momento.
     * @param sentencia Código 3D a agregar
     */
    public static void agregarC3D(String sentencia){
        c3d += sentencia;
    }
    
    /**
     * Devuelve el código 3D generao hasta el momento de su invocación.
     * @return Código 3D generado
     */
    public static String getC3D(){
        return c3d;
    }
    
    public static String generarIf(String a1, String a2, String condicion, String L1, String L2)
    {
        String salida = "if ("+a1 + " "+condicion+ " "+a2+") goto " + L1 + "\n" +
                "goto "+ L2 + ";\n";
        
    return salida;
    }
    
}
