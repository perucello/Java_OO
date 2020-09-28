package objetos;

public final class Produto {
 
    // ATRIBUTOS ou VARIÁVEIS
    //
    // private - não permite o uso da variável
    // diretamente pelo usuário. será preciso
    // usar os métodos GET e SET para gravar e ler
    // a variável. É uma proteção importante.
    
    private String descricao;
    private double preco;
    private int estoque;
    
    // MÉTODOS GET E SET
    // SET - Usados para atribuir valores às
    //       variáveis
    //
    // GET - Usados para obter os valores 
    // que foram gravados nas variáveis
    
    public void setDescricao(String desc){
        descricao = desc;
    }
    
    public String getDescricao(){
        return descricao;
    } // fim de getDescricao() ======================
    
    public void setPreco(double pre){
        
        // verifica se é um valor positivo
        if (pre >= 0){
            preco = pre;
        }else{
            preco = 0;
        }
    
    } // fim de setPreco() ==========================
    
    
    public double getPreco(){
        
        return preco;    
        
    } // fim de getPreco() ==========================
    
    
    public void setEstoque(int est){
    
        if(est >= 0){
            estoque = est;
        }else{
            estoque = 0;
        }
        
    } // fim de setEstoque() ========================
    
    
    public int getEstoque(){
        
        return estoque;
        
    } // fim de getEstoque() ========================
    
    
    // METODO CONSTRUTOR - permite criar um objeto
    // e já informar os valores desejados
    // Deve ter o mesmo nome da classe
    
    Produto(String des, double pre, int est){
        setDescricao(des);
        setPreco(pre);
        setEstoque(est);
    }
    
    // método vazio para poder criar sem informar
    Produto(){
    }
    
        
} // fim da classe Produto