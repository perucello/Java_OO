package objetos;

import javax.swing.*;

public class CadastroProduto {
    
    public static void main(String args[]){
    
        Produto p1 = new Produto();
        
        p1.setDescricao(
                JOptionPane.showInputDialog(
                "Nome do produto:"
                ));
        
        p1.setPreco(
                Double.parseDouble(
                JOptionPane.showInputDialog(
                "Preço do produto:"
                )));
        
        p1.setEstoque(
                Integer.parseInt(
                JOptionPane.showInputDialog(
                "Quantidade em estoque:"
                )));
        
        JOptionPane.showMessageDialog(null,
                "Produto: " + p1.getDescricao() + 
                "\nPreço: " + p1.getPreco() +
                "\nEstoque: " + p1.getEstoque());
        
    
    }
    
}
