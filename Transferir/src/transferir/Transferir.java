/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferir;

import javax.swing.JOptionPane;

/**
 *
 * @author pioca_000
 */
public class Transferir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        conta1.nome=JOptionPane.showInputDialog("Insira o nome do titular: ");
        conta1.numerocont=Integer.parseInt(JOptionPane.showInputDialog("Insira o numero da conta: "));
        conta1.saldo=Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo da conta: "));
        conta1.limite=Double.parseDouble(JOptionPane.showInputDialog("Insira o limite da conta: "));
        
        conta2.nome= "Felipe";
        conta2.numerocont=2001;
        conta2.saldo=2000;
        conta2.limite=3000;
        
        int escolha=20;
        while(escolha!=0){
            escolha= Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao: \nSacar-1. \nDeposita-2. \nTransferir-3. \nSair-0"));
        
            switch(escolha){
                case 1:
                    conta1.saque(Double.parseDouble(JOptionPane.showInputDialog("Qual o valor que deseja sacar?")));
                    JOptionPane.showMessageDialog(null, "O novo saldo da conta "+conta1.numerocont+" eh: "+conta1.saldo);
                break;
                
                case 2:
                    conta1.deposito(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que deseja depositar: ")));
                    JOptionPane.showMessageDialog(null, "O novo saldo da conta "+conta1.numerocont+" eh: "+conta1.saldo);
                    break;
                    
                case 3:
                    conta1.transferencia(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor que deseja transferir para a conta 2: ")), conta2);
                    JOptionPane.showMessageDialog(null, "O novo saldo da conta debitada eh: "+conta1.saldo);
                    JOptionPane.showMessageDialog(null, "O novo saldo da conta creditada eh: "+conta2.saldo);
                    break;
        }
        }
        
         
    }
    
}
