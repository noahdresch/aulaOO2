/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaoo2;

/**
 *
 * @author Noa
 */
public class Pessoa {
    
    // constante
    public static final char SEXO_MASCULINO = 'M';
    public static final char SEXO_FEMININO = 'F';
    
    // criando atributos
    public int codigo;
    public String nome;
    public String sobrenome;
    public char sexo;
    public int idade;
    
    //metodo
    public void imprimeNomeCompleto() {
        
        System.out.println(nome + " " + sobrenome);
    }
    
    
}
