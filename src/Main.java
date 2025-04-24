public class Main {
    public static void main(String[] args) {
        // Criar cliente
        Cliente cliente = new Cliente(1, "João Silva", 10);

        // Criar conta e associar ao cliente
        Conta conta = new Conta("12345-6");
        cliente.cadastrarConta(conta);

        // Gerenciar saldo
        cliente.depositar(1000.0);
        cliente.sacar(200.0);
        System.out.println("Saldo atual: R$ " + cliente.consultarSaldo());

        // Cadastrar e listar faturas
        cliente.cadastrarFatura("Fatura de energia - R$ 150.00");
        cliente.cadastrarFatura("Fatura de internet - R$ 100.00");
        cliente.listarFaturas();
    }
}