import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
  private int numeroDaConta;
  private double saldo;
  private double taxaDeJurosAnual;
  private String dataDeCriacaoDaConta;

  public ContaBancaria(int numeroDaConta) {
    this.numeroDaConta = numeroDaConta;
    this.saldo = 0;
    this.taxaDeJurosAnual = 0.05;

    LocalDate dataAtual = LocalDate.now();    
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = dataAtual.format(formato);
    
    this.dataDeCriacaoDaConta = dataFormatada;
  }

  public int getNumeroDaConta() {
    return numeroDaConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getTaxaDeJurosAnual() {
    return taxaDeJurosAnual;
  }

  public String getDataDeCriacaoDaConta() {
    return dataDeCriacaoDaConta;
  }

  public void depositar(double valor) {
    saldo += valor;
    System.out.println("Depósito realizado com sucesso!");
    System.out.println("Saldo atual: R$ " + saldo);
  }

  public void sacar(double valor) {
    if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Saque realizado com sucesso!");
      System.out.println("Saldo atual: R$ " + saldo);
    } else {
      System.out.println("Saldo insuficiente.");
    }
  }

  public double calcularJurosMensais() {
    return saldo * taxaDeJurosAnual / 12;
  }

  public double calcularSaldoComJurosMensais() {
    return saldo + calcularJurosMensais();
  }
  
}
