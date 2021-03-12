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
public class Animal {
    public String tipo;
    public String raca;
    public String nome;
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public void somAnimal(Animal animal){
        if(animal.tipo.equals("cachorro"))
            System.out.println("\nO cachorro " + this.nome + " latiu: \n AU AU!");
        else if(animal.tipo.equals("gato"))
            System.out.println("\nO gato " + this.nome + " miou: \n MIAU MIAU!");
        else
            System.out.println("\nO animal " + this.nome + " não emitiu som!");
    }
    
    public void brincar(Animal animal){
        if(this.tipo.equals("cachorro"))
            System.out.println("O cachorro " + this.nome + " correu atrás da bola!");
        else if(this.tipo.equals("gato"))
            System.out.println("O gato " + this.nome + " se assustou?!?!");
        else
            System.out.println("O animal " + this.nome + " não reagiu!");
    }
}
