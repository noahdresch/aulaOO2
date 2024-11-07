/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaoo2;

/**
 *
 * @author Noa
 */
public class Conta {
    
    //atributos
    public int codigo;
    public String nomeDono;
    public double limite;
    public String tipoConta;
    public double saldo;
    
    
    public boolean sacar (double valor){
        
        if (saldo >= valor) {
            saldo -= valor;
        // saldo = saldo - valor; mesmo comando que acima  
            return true;
        }
        
        return false;
    }
    
    public void depositar (double valor) {
        saldo += valor;
        // saldo = saldo + valor; mesmo comando que acima
    }
    
    public void imprimirSaldo() {
        
        System.out.println("Saldo do " + nomeDono + " é de R$ " + saldo );
    }
    
    public void imprimirNome() {
        
        System.out.println( nomeDono );
    }
    
    public void transferir (Conta destino, double valor) {
    
        sacar( valor );
        
        destino.depositar ( valor );
       
   }
    
}
