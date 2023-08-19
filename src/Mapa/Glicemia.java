package Mapa;

import javax.swing.*;

public class Glicemia extends Exame {

    //Variáveis
    private int resultadoGlicemia;

    private String classificarGlicemia() {
        if (resultadoGlicemia < 100) {
            return "Normoglicemia";
        } else if (resultadoGlicemia < 126) {
            return "Pré-diabetes";
        } else {
            return "Diabetes estabelecido";
        }
    }


    //Métodos GETs e SETs
    public int getResultadoGlicemia() {
        return resultadoGlicemia;
    }

    public void setResultadoGlicemia(int resultadoGlicemia) {
        this.resultadoGlicemia = resultadoGlicemia;
    }


    //Método super para o cadastro + quantidade de Glicose
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        resultadoGlicemia = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de glicose por mg/l:"));
    }




    //Método super para mostrar o resultado junto com a Glicose
    @Override
    public void mostrarResultado() {
        String resultado = "Nome: " + this.getNomePaciente().toUpperCase() + "\n";
        resultado += "Tipo Sanguíneo: " + this.getTipoSanguineo().toUpperCase() + "\n";
        resultado += "Idade: " + calcularIdade() + " anos" + "\n";
        resultado += "Glicemia: " + this.resultadoGlicemia + "\n";
        resultado += "Classificação: " + this.classificarGlicemia();
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        Glicemia glicemia = new Glicemia();
        glicemia.cadastrarExame();
        glicemia.mostrarResultado();
    }
}
