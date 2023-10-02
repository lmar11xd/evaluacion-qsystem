import enums.CentroEnum;

public class Ejercicio02 {

    public static void operacion(String nombreCentro) {
        String centro = nombreCentro.toUpperCase();
        if(CentroEnum.LURIN.toString().equals(centro)) {
            System.out.println("Comportamiento para " + CentroEnum.LURIN.toString());
        } else if(CentroEnum.ICA.toString().equals(centro)) {
            System.out.println("Comportamiento para " + CentroEnum.ICA.toString());
        } else if(CentroEnum.TRUJILLO.toString().equals(centro)) {
            System.out.println("Comportamiento para " + CentroEnum.TRUJILLO.toString());
        } else if(CentroEnum.HUANUCO.toString().equals(centro)) {
            System.out.println("Comportamiento para " + CentroEnum.HUANUCO.toString());
        } else {
            System.out.println("Centro sin comportamiento");
        }
    }

    public static void main(String[] args) {
        operacion("ica");
        operacion("Trujillo");
        operacion("Lima");
    }
}
