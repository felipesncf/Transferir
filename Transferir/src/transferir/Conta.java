/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferir;

/**
 *
 * @author pioca_000
 */
public class Conta {
    int numerocont;
    double saldo;
    double limite;
    String nome;
    
    public boolean saque (double valor){
        if(this.limite + this.saldo >=valor){
            this.saldo=this.saldo-valor;
            return true;
        }
        else{
            return false;
        }    
    }
    
    public void deposito (double valor){
        this.saldo=this.saldo+valor;
    }
    
    public boolean transferencia(double valor, Conta destino){
        if(this.limite+this.saldo>=valor){
            this.saldo=this.saldo-valor;
            destino.saldo=destino.saldo+valor;
            return true;
        }
        else{
            return false;
        }
    }
}