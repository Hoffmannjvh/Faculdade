package Mapa;

import javax.swing.*;
import java.time.LocalDate;

public abstract class Exame {

    //Variáveis
    private String nomePaciente;
    private String tipoSanguineo;
    private int anoNascimento;


    //Métodos GETs e SETs
    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    //Cadastro do exame
    public void cadastrarExame() {
        this.nomePaciente = JOptionPane.showInputDialog("Digite o nome do paciente:");
        this.tipoSanguineo = JOptionPane.showInputDialog("Digite o tipo sanguineo do paciente:");
        this.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento do paciente:"));
    }

    // Método para calcular a idade
    public int calcularIdade() {
        int anoAtual = LocalDate.now().getYear();
        return anoAtual - this.anoNascimento;
    }

    //Mostrar resultado
    public void mostrarResultado() {
        String resultado = "Nome: " + this.nomePaciente.toUpperCase() + "\n";
        resultado += "Tipo Sanguíneo: " + this.tipoSanguineo + "\n";
        resultado += "Idade: " + calcularIdade() + " anos" + "\n";
        JOptionPane.showMessageDialog(null, resultado);
    }
}