public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        ContaBancaria teste = new ContaBancaria(1234);
        teste.depositar(1000);
        teste.sacar(500);
        System.out.println("Juros Mensais: R$ " + teste.calcularJurosMensais());
        System.out.println("Saldo com Juros Mensais: R$ " + teste.calcularSaldoComJurosMensais());
        System.out.println();
    }
}
