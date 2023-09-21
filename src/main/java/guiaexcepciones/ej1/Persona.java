package guiaexcepciones.ej1;

public class Persona {
    private int age;

    public Persona() {

    }

    public Persona(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "age=" + age +
                '}';
    }
}

