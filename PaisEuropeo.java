public class PaisEuropeo {

    private String nombrePais;
    private int poblacionPais;
    private boolean miembroDeLaUnionEuropea;

    public PaisEuropeo (String nombreDelPais, int poblacionDelPais){
        nombrePais = nombreDelPais;
        poblacionPais = poblacionDelPais;
        miembroDeLaUnionEuropea = true;
    }

    public String getNombrePais () {
        return nombrePais;
    }

    public int getPoblacionPais () {
        return poblacionPais;
    }

    public int getMiembroDeLaUnionEuropea () {
        return poblacionPais;
    }

    public void setNombrePais (String nombreDelPais) {
        nombrePais = nombreDelPais;
    }

    public void poblacionActiva (int poblacionInactiva) {
        poblacionPais = poblacionPais - poblacionInactiva;
    }

    public void alterarMiembroDeLaUnioEuropea () {
        miembroDeLaUnionEuropea = false;
    }

    public void mostrarInfoPais () {
        System.out.println ("País: " + nombrePais + "|" + "Población: " + poblacionPais + "|" + "Miembro de La Unión Europea: Sí");
    }

    public void estadoObjeto () {
        System.out.println ("Estado del objeto: Creado");
    }

}