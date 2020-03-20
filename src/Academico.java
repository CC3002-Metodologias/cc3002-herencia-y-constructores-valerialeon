public class Academico extends Persona{
    protected String Paper;

    public Academico(String name, String ocupation, int edad, String paper){
        super(name, ocupation, edad);
        Paper = paper;
    }
    @Override
    public void comer(){
        super.comer();
}
    @Override
    public void dormir(){
        System.out.println("ZzZzZzZ");
    }
    @Override
    public String hacerLoSuyo(){
        String cuarentena = super.hacerLoSuyo();
        return "Zoom? Para qué sirve el F4, gente?".concat(" ".concat(cuarentena));
    }
    public String publicarPaper(){
        return Paper;
    }
}
