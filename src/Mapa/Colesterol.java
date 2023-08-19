package Mapa;

import javax.swing.*;

public class Colesterol extends Exame {

    //Variáveis
    private int resultadoHDL;
    private int resultadoLDL;
    private String classificacaoHDL;
    private String classificacaoLDL;
    private String riscoPaciente;


    //Métodos GETs e SETs
    public int getResultadoHDL() {
        return resultadoHDL;
    }

    public void setResultadoHDL(int resultadoHDL) {
        this.resultadoHDL = resultadoHDL;
    }

    public int getResultadoLDL() {
        return resultadoLDL;
    }

    public void setResultadoLDL(int resultadoLDL) {
        this.resultadoLDL = resultadoLDL;
    }

    public String getClassificacaoHDL() {
        return classificacaoHDL;
    }

    public void setClassificacaoHDL(String classificacaoHDL) {
        this.classificacaoHDL = classificacaoHDL;
    }

    public String getClassificacaoLDL() {
        return classificacaoLDL;
    }

    public void setClassificacaoLDL(String classificacaoLDL) {
        this.classificacaoLDL = classificacaoLDL;
    }

    public String getRiscoPaciente() {
        return riscoPaciente;
    }

    public void setRiscoPaciente(String riscoPaciente) {
        this.riscoPaciente = riscoPaciente;
    }

    //Método para classificação do Colesterol HDL
    private void classificarHDL() {
        if (calcularIdade() >= 0 && calcularIdade() <= 19) {
            if (resultadoHDL > 45) {
                classificacaoHDL = "Bom";
            } else {
                classificacaoHDL = "Baixo";
            }
        } else {
            if (resultadoHDL > 40) {
                classificacaoHDL = "Bom";
            } else {
                classificacaoHDL = "Baixo";
            }
        }
    }

    //Método para classificação do Colesterol LDL
    private void classificarLDL() {
        if (riscoPaciente.equals("A")) {
            if (resultadoLDL < 50) {
                classificacaoLDL = "Ótimo";
            } else {
                classificacaoLDL = "Elevado";
            }
        } else if (riscoPaciente.equals("M")) {
            if (resultadoLDL < 70) {
                classificacaoLDL = "Ótimo";
            } else {
                classificacaoLDL = "Elevado";
            }
        } else if (riscoPaciente.equals("B")) {
            if (resultadoLDL < 100) {
                classificacaoLDL = "Ótimo";
            } else {
                classificacaoLDL = "Elevado";
            }
        }
    }

    //Método super para o cadastro + quantidade de HDL
    @Override
    public void cadastrarExame() {
        super.cadastrarExame();
        resultadoLDL = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de LDL:"));
        resultadoHDL = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de HDL:"));
        riscoPaciente = JOptionPane.showInputDialog("Risco (A - Alto, M - Médio, B - Baixo):");
    }

    //Método super para mostrar o resultado junto com o LDL, HDL e classificação
    @Override
    public void mostrarResultado() {
        classificarHDL();
        classificarLDL();

        String resultado = "Nome: " + getNomePaciente().toUpperCase() + "\n";
        resultado += "Tipo Sanguíneo: " + getTipoSanguineo().toUpperCase() + "\n";
        resultado += "Idade: " + calcularIdade() + " anos" + "\n";
        resultado += "Resultado LDL: " + resultadoLDL + "\n";
        resultado += "Resultado HDL: " + resultadoHDL + "\n";
        resultado += "Resultado Risco: " + riscoPaciente + "\n";
        resultado += "Classificação HDL: " + classificacaoHDL + "\n";
        resultado += "Classificação LDL: " + classificacaoLDL + "\n";
        JOptionPane.showMessageDialog(null, resultado);
    }

    public static void main(String[] args) {
        Colesterol colesterol = new Colesterol();
        colesterol.cadastrarExame();
        colesterol.mostrarResultado();
    }

}
