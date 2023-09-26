package guiaexcepciones.ej3y4;

public class DivisionNumero {
    private String num;

    public DivisionNumero() {
    }

    public DivisionNumero(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" +
                "num='" + num + '\'' +
                '}';
    }
}
