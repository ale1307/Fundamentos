package sample.modelos;

public class Usuarios {
    private String nombre;
    private int age;

    public Usuarios(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
