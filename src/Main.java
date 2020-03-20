public class Main {

    public static void main(String[] args) {
        Persona jorge = new Persona("jorge", "nadador", 21);
        jorge.comer();
        jorge.dormir();
        System.out.println(jorge.hacerLoSuyo());

        Estudiante valu = new Estudiante("Valeria", "dcc", 21);
        valu.comer();
        valu.dormir();
        System.out.println(valu.hacerLoSuyo());

        Academico profe = new Academico("Alexandre Bergel", "Dcc Headmaster(?)", 45, "Introducción a Java");
        profe.comer();
        profe.dormir();
        System.out.println(profe.hacerLoSuyo());
        System.out.println(profe.publicarPaper());
    }
}
