import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String nome;
    private int desconto;
    private String genero; // 'm', 'f', 'nd'
    private Conta conta; 
    private List<String> faturas; 

    public Cliente(int id, String nome, int desconto) {
        this.id = id;
        this.nome = nome;
        this.desconto = desconto;
        this.faturas = new ArrayList<>();
    }

    
    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getGenero() {
        return this.genero;
    }
    public int getDesconto() {
        return this.desconto;
    }
    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    
    public void cadastrarConta(Conta conta) {
        this.conta = conta;
    }

    public double consultarSaldo() {
        if (conta != null) {
            return conta.getSaldo();
        } else {
            System.out.println("Conta não cadastrada.");
            return 0.0;
        }
    }

    public void depositar(double valor) {
        if (conta != null) {
            conta.depositar(valor);
        } else {
            System.out.println("Conta não cadastrada.");
        }
    }

    public void sacar(double valor) {
        if (conta != null) {
            conta.sacar(valor);
        } else {
            System.out.println("Conta não cadastrada.");
        }
    }

    
    public void cadastrarFatura(String descricao) {
        faturas.add(descricao);
        System.out.println("Fatura cadastrada: " + descricao);
    }

    public void listarFaturas() {
        System.out.println("Faturas do cliente " + nome + ":");
        for (String fatura : faturas) {
            System.out.println("- " + fatura);
        }
    }

    @Override
    public String toString() {
        return nome + "(" + id + ")(" + desconto + "%)";
    }
}
