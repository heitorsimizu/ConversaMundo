package ex_mundo;

import java.util.Scanner;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;

public class Ex_Mundo {
    
    static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
    static List<Animal> listaAnimais = new ArrayList<Animal>();
    static boolean flag = false;
    
    
    public static void main(String[] args) {
        Pessoa ana = new Pessoa();
        ana.setNome("ana");
        ana.setIdade(20);
        listaPessoas.add(ana);
        
        Pessoa rafael = new Pessoa();
        rafael.setNome("rafael");
        rafael.setIdade(23);
        listaPessoas.add(rafael);
        
        
        System.out.println("Bem-Vindo!!! \n------------------------------");
        while(!flag){
            menu();
        }     
    }
    
    
    public static void cadastroPessoa(){
        Scanner scan = new Scanner(System.in);
        Pessoa p = new Pessoa();
        try{
            System.out.println("Nome da pessoa: ");
            p.nome = scan.next();
            System.out.println("Idade da pessoa: ");
            p.idade = scan.nextInt();
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Falha ao cadastrar");
            return;
        }
        listaPessoas.add(p);
        System.out.println("Cadastrado!");    
    }
    
    public static void listarPessoa(){
        System.out.println("\n****Lista de Pessoas****\n");
        if(listaPessoas.isEmpty())
            System.out.println("Lista Vazia :(");
        else{
            for(Pessoa p : listaPessoas){
            System.out.println("Nome: " + p.nome + " - Idade: " + p.idade);
            }    
        }
    }
    
    public static void cadastroAnimal(){
        Scanner scan = new Scanner(System.in);
        Animal a = new Animal();
        try{
            System.out.println("Tipo de animal: ");
            a.tipo = scan.next();
            System.out.println("Raça do bichinho: ");
            a.raca = scan.next();
            System.out.println("Nome do bichinho: ");
            a.nome = scan.next();
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Falha ao cadastrar");
            return;
        }
        listaAnimais.add(a);
        System.out.println("Cadastrado!"); 
    }
    
    public static void listarAnimal(){
        if(listaAnimais.isEmpty())
            System.out.println("Lista Vazia :(");
        else{
            for(Animal a : listaAnimais){
            System.out.println("Tipo: " + a.tipo + " - Raça: " + a.raca + ""
                    + " - Nome: " + a.nome);
            }
        }
    }

    public static void conversar(){
        listarPessoa();
        String nome1, nome2, fala1, fala2;
        boolean bandeira1 = false;
        boolean bandeira2 = false;
        Scanner scan = new Scanner(System.in);
        
        
        do{
            System.out.println("\nEscolha quem fala:");
            nome1 = scan.next();
            for(Pessoa pessoa : listaPessoas){
                if(pessoa.getNome().equals(nome1)){
                    bandeira1 = true;
                    break;
                }
            }
            if(bandeira1 == false)
                System.out.println("Nome não encontrado");
        }
        while(!bandeira1);
        
        do{
            System.out.println("\nEscolha quem responde:");
            nome2 = scan.next();
            for(Pessoa pessoa : listaPessoas){
                if(pessoa.getNome().equals(nome2)){
                    bandeira2 = true;
                    break;
                }
            }
            if(bandeira2 == false)
                System.out.println("Nome não encontrado");
        }
        while(!bandeira2);
        
        System.out.println("O que " + nome1 + " vai dizer? ");
        fala1 = scan.nextLine();
        fala1 = scan.nextLine();
        
        System.out.println("O que " + nome2 + " responde? ");
        fala2 = scan.nextLine();
        
        
        System.out.println(nome1 + " falou: " + fala1);
        System.out.println(nome2 + " respondeu: " + fala2);
    }
    
    public static void somDoAnimal(){
        listarAnimal();
        String pet;
        boolean bandeira = false;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nEscolha o nome do animal:");
            pet = scan.next();
            for(Animal animal : listaAnimais){
                if(animal.getNome().equals(pet)){
                    animal.somAnimal(animal);
                    bandeira = true;
                    break;
                }
            }
            if(bandeira == false)
                System.out.println("Animal não encontrado");
        }
        while(!bandeira);
        
        
        
    }
    
    public static void acaoDoAnimal(){
    listarAnimal();
        String pet;
        boolean bandeira = false;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("\nEscolha o nome do animal:");
            pet = scan.next();
            for(Animal animal : listaAnimais){
                if(animal.getNome().equals(pet)){
                    animal.brincar(animal);
                    bandeira = true;
                    break;
                }
            }
            if(bandeira == false)
                System.out.println("Animal não encontrado");
        }
        while(!bandeira);
}
    
    public static void menu(){
        System.out.println("\n****MENU****\n1- Cadastrar Pessoa\n2- Cadastrar Animal\n3- Lista de Pessoas\n"
                + "4- Lista de Animais\n5- Conversar\n6- Som do Animal\n7- Ação do Animal\n0- Sair");
        Scanner s = new Scanner(System.in);
        String opcao;
        opcao = s.next();
        switch (opcao){
                case "1":{
                    cadastroPessoa();
                    break;
                }
                case "2": {
                    cadastroAnimal();
                    break;
                }
                case "3": {
                    listarPessoa();
                    break;
                }
                case "4": {
                    listarAnimal();
                    break;
                }
                case "5": {
                    conversar();
                    break;
                }
                case "6": {
                    somDoAnimal();
                    break;
                }
                case "7": {
                    acaoDoAnimal();
                    break;
                }
                case "0": {
                    flag = true;
                }
        }
    }       
}
