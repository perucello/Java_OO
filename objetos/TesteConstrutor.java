package objetos;

public class TesteConstrutor {
    
    public static void main(String args[]){
        
        // USA O CONSTRUTOR PARA INSERIR OS DADOS
        // NA HORA DE CRIAR O OBJETO
        
        Produto p3 = new Produto("Figo", 5.99 , 200);
        
        System.out.println(p3.getDescricao() 
                + "\n" + p3.getPreco() 
                + "\n" + p3.getEstoque());
        
    } // fim de main()
    
} // fim da classe TesteConstrutor
