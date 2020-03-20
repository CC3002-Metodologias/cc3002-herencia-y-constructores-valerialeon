public class Estudiante extends Persona{

    public Estudiante(String name, String ocupation, int age){
        super(name, ocupation, age);
    }
    @Override
    public void comer(){
        System.out.println("Completos a $500 owo");
    }
    @Override
    public void dormir(){
        System.out.println("ZzZzZz");
    }
    @Override
    public String hacerLoSuyo(){
        String cuarentena = super.hacerLoSuyo();
        return "Ya me vi Naruto uwu, ¿será este un buen momento para abrir Netflix?".concat(" ".concat(cuarentena));
    }

}
