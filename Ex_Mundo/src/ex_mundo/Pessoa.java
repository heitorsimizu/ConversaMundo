/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_mundo;

/**
 *
 * @author rcamara
 */
public class Pessoa {
    public String nome;
    public int idade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void Falar(Pessoa pessoa, String fala){
        System.out.println(this.nome + " falou: " + fala);
    }
    
}
