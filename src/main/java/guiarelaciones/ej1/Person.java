package guiarelaciones.ej1;

import guiarelaciones.ej1.Dog;

public class Person {
    private String name;
    private String lastName;
    private Integer age;
    private Integer dni;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, Integer age, Integer dni, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", dni=" + dni + ", dog=" + dog + '}';
    }

}
