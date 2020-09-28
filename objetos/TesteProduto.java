
package objetos;


public class TesteProduto {
    public static void main(String args[]){
        
        // CRIA UM OBJETO chamado p1
        Produto p1 = new Produto();
        
        // ATRIBUIR VALORES usando metodos SET
        p1.setDescricao("Banana");
        p1.setPreco(1.99);
        p1.setEstoque(50);
        
        Produto p2 = new Produto();
        
        p2.setDescricao("Caju");
        p2.setPreco(3.49);
        p2.setEstoque(100);
        
        Produto p3 = new Produto();
        
        p3.setDescricao("Limão");
        p3.setPreco(7.49);
        p3.setEstoque(50);
        
        System.out.println(p1.getDescricao()
                + " - R$ " + p1.getPreco()
                + " - (" + p1.getEstoque() 
                + ")" );
        
        System.out.println(p2.getDescricao()
                + " - R$ " + p2.getPreco()
                + " - (" + p2.getEstoque() 
                + ")" );

        System.out.println(p3.getDescricao()
                + " - R$ " + p3.getPreco()
                + " - (" + p3.getEstoque() 
                + ")" );        
    } // fim de main
} // fim da classe TesteProduto
