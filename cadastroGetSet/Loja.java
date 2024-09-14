
package cadastroGetSet;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    
    private List <Produto> listaDeProdutos;

    public Loja() {
        this.listaDeProdutos = new ArrayList<>();
    }
    
    public void cadastrarProduto(String nome, double preco, int quantidade){
        Produto p = new Produto();
        p.setNome(nome);
        p.setPreco(preco);
        p.setQuantidade(quantidade);
        listaDeProdutos.add(p);
    }
    
    public Produto buscarPorId(long id){
        Produto produto = null;
        if(listaDeProdutos.isEmpty()){
            System.out.println("A lista está vazia");   
        }
        else{
            for(Produto p: listaDeProdutos){
                if(p.getId()==id){
                    produto = p;
                }
            }
        }
        return produto;
    }
    
    public Produto buscarPorNome(String nome){
        Produto produto = null;
        for(Produto p: listaDeProdutos){
            if(p.getNome().equalsIgnoreCase(nome)){
                produto = p;
            }
        }
        return produto;
    }
    
    
    
    public void atualizarProduto(Long id, String nome, Double preco, Integer quantidade){
        Produto p = buscarPorId(id);
        if(p != null){
            p.setNome(nome);
            p.setPreco(preco);
            p.setQuantidade(quantidade);  
        } 
        else {
            System.out.println("Produto não encontrado");
        }
    }
    
    public void exibirProduto(Long id){
        Produto p = buscarPorId(id);
        if(p!=null){
            System.out.printf("Id: %d, Nome: %s, Preço: %.2f, Quantidade: %d" 
                    ,p.getId(), p.getNome(), p.getPreco(), p.getQuantidade());
        } else {
            System.out.println("Produto não encontrado");
        }
    }
    
    public void excluirProduto(Long id){
        Produto p = buscarPorId(id);
        if(p!= null){
            listaDeProdutos.remove(p);
        }else {
            System.out.println("Produto não encontrado");
        }
    }  
    
}