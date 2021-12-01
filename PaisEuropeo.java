public class PaisEuropeo {

    private String nombrePais;
    private int poblacionPais;
    private boolean miembroDeLaUnionEuropea;

    public PaisEuropeo (String nombreDelPais, int poblacionDelPais, boolean siEsMiembro){
        nombrePais = nombreDelPais;
        poblacionPais = poblacionDelPais;
        miembroDeLaUnionEuropea = siEsMiembro;
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
        if (miembroDeLaUnionEuropea == true) {
            miembroDeLaUnionEuropea = false;
        }
        else {
            miembroDeLaUnionEuropea = true;
        }
    }

    public void mostrarInfoPais () {
        System.out.println ("Pa�s: " + nombrePais + "|" + "Poblaci�n: " + poblacionPais + "|" + "Miembro de La Uni�n Europea: " + miembroDeLaUnionEuropea);
    }

    public String getEstadoObjeto () {
        String infoPais = "Pa�s: " + nombrePais + "|" + "Poblaci�n: " + poblacionPais + "|" + "Miembro de La Uni�n Europea: S�";
        return infoPais;
    }

}