package Mapa;

public class Principal {

    public static void main(String[] args) {

        Exame exameGlicemia = new Glicemia();
        exameGlicemia.cadastrarExame();
        exameGlicemia.mostrarResultado();

        Exame exameColesterol = new Colesterol();
        exameColesterol.cadastrarExame();
        exameColesterol.mostrarResultado();

        Exame exameTriglicerideos = new Triglicerideos();
        exameTriglicerideos.cadastrarExame();
        exameTriglicerideos.mostrarResultado();



    }
}
