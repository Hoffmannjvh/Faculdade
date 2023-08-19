package Mapa;

import javax.swing.*;

public class Triglicerideos extends Exame {

    //Variáveis
    private int resultadoTriglicerideos;


    //Métodos GETs e SETs
    public int getResultadoTriglicerideos() {
        return resultadoTriglicerideos;
    }

    public void setResultadoTriglicerideos(int resultadoTriglicerideos) {
        this.resultadoTriglicerideos = resultadoTriglicerideos;
    }

    //Método para classificação dos Triglicerideos
    private String classificarTriglicerideos() {
        if (calcularIdade() >= 0 && calcularIdade() <= 9) {
            if (resultadoTriglicerideos < 75) {
                return "Normal";
            } else {
                return "Elevado";
            }
        } else if (calcularIdade() >= 10 && calcularIdade() <= 19) {
            if (resultadoTriglicerideos < 90) {
                return "Normal";
            } else {
                return "Elevado";
            }
        } else {
            if (resultadoTriglicerideos < 150) {
                return "Normal";
            } else {
                return "Elevado";
            }
        }
    }

    //Método super para o cadastro + quantidade de Glicose
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        resultadoTriglicerideos = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de triglicerideos por mg/dL:"));
    }

    //Método super para mostrar o resultado junto com o triglicerideo
    @Override
    public void mostrarResultado() {
        String resultado = "Nome: " + this.getNomePaciente().toUpperCase() + "\n";
        resultado += "Tipo Sanguíneo: " + this.getTipoSanguineo().toUpperCase() + "\n";
        resultado += "Idade: " + calcularIdade() + " anos" + "\n";
        resultado += "Triglicerideos: " + this.resultadoTriglicerideos + "\n";
        resultado += "Classificação: " + this.classificarTriglicerideos();
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        Triglicerideos triglicerideos = new Triglicerideos();
        triglicerideos.cadastrarExame();
        triglicerideos.mostrarResultado();
    }
}
