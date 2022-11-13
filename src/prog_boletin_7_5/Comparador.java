package prog_boletin_7_5;

public class Comparador {

    private float numero1;
    private float numero2;
    private float numero3;

    public Comparador() {

    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getNumero3() {
        return numero3;
    }

    public void setNumero3(float numero3) {
        this.numero3 = numero3;
    }

    public void numeroMayor() {
        if (numero1 != numero2 && numero3 != numero2 && numero3 != numero1) {
            float numeroMayor;
            if (numero1 > numero2) {
                if (numero1 > numero3) {
                    numeroMayor = numero1;
                } else {
                    numeroMayor = numero3;
                }
            } else {
                if (numero2 > numero3) {
                    numeroMayor = numero2;
                } else {
                    numeroMayor = numero3;
                }
            }
            System.out.println("El número mayor es " + numeroMayor);
        } else {
            System.out.println("Error");
        }
    }
}
