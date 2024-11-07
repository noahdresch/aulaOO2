/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaoo2;

/**
 *
 * @author Noa
 */
public class Start {
    
    public static void main(String[] args) {
        
        Pessoa artur = new Pessoa();
        artur.codigo = 1;
        artur.nome = "artur ";
        artur.sobrenome = "tomasi";
        artur.sexo = Pessoa.SEXO_MASCULINO;
        artur.imprimeNomeCompleto();
        
        Pessoa juca = new Pessoa();
        juca.codigo = 2;
        juca.nome = "juca ";
        juca.sobrenome = "bala";
        juca.sexo = Pessoa.SEXO_MASCULINO;
        juca.imprimeNomeCompleto();
        
        
        
        
        Conta conta1 = new Conta();
        conta1.nomeDono = "Artur";
        conta1.depositar(1000);
        
        Conta conta2 = new Conta();
        conta2.nomeDono = "Juca";
        conta2.depositar(1000);
        
        
        conta1.transferir ( conta2, 100);
                
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        
        
    }
}
