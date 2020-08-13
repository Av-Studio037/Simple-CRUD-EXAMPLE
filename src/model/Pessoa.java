/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author KPROGRAMMER
 */
public class Pessoa implements Serializable{

   
    private int id;
   private String nome;
   private int idade;
   private String morada;
   private String bi;

    public Pessoa(String nome, int idade,String morada,String bi){
       this.nome=nome;
       this.idade=idade;
       this.morada=morada;
       this.bi=bi;
   }
    
   public Pessoa(){
       
   }
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

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
