package guiapoo.ejextra5;

import java.util.Arrays;

public class Meses {
    private String mesSecreto;
    private String arreglo[]={"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

    public Meses() {
    }

    public Meses(String mesSecreto, String[] arreglo) {
        this.mesSecreto = mesSecreto;
        this.arreglo = arreglo;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(String[] arreglo) {
        this.arreglo = arreglo;
    }

    @Override
    public String toString() {
        return "Meses{" +
                "mesSecreto='" + mesSecreto + '\'' +
                ", arreglo=" + Arrays.toString(arreglo) +
                '}';
    }
}

