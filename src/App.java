import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Caixa de dialogo  de boas vindas
        JOptionPane.showMessageDialog(null, message);
        // Caixa de dialogo de interação 1
        String variavel = JOptionPane.showInputDialog(null, message);
        // Caixa de dialogo de interação 2
        String variavel1 = JOptionPane.showInputDialog(null, message);
            //parseInt converte a String para Inteiro
            int variavel2 = Integer.parseInt(variavel);
            int variavel3 = Integer.parseInt(variavel1);
            variavel4 = variavel3 * variavel2; 
            //Message de dialogo mostra o resultado pós a multiplicação
        JOptionPane.showMessageDialog(null, 
                message,
                "title" );
    }
}

