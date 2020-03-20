public class Persona {
    protected String nombre;
    protected String ocupacion;
    protected int edad;

    public Persona(String name, String ocupation, int age){
        nombre = name;
        ocupacion = ocupation;
        edad = age;
    }
    public void comer() {
        System.out.println("Ñom Ñom comida casera");
    }

    public void dormir() {
        System.out.println("ZzzZzZzZ");
    }

    public String hacerLoSuyo() {
        return "En Cuarentena uwu";
    }
}
