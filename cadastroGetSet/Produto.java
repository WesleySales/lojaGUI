
package cadastroGetSet;

public class Produto {
    
    private static long GENERATOR_ID=1L;
    
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(){
        this.id = GENERATOR_ID++;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco!=0) this.preco = preco;
        else System.out.println("O preço não pode ser 0");
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade!=0)this.quantidade = quantidade;
        else System.out.println("A quantidade não pode ser 0");
    }
    
    
    
}