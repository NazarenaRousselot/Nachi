package guiaexcepciones.ej1;

public class ej1 {
    public static void main(String[] args) {
        PersonaServicio mayor = new PersonaServicio();


        try{
            mayor.esMayorDeEdad();
        }catch (Exception e){
            System.out.println("Error, la edad ingresada no es valida");
        }
    }
}
