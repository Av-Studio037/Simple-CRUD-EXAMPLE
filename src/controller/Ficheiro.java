/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Pessoa;

/**
 *
 * @author KPROGRAMMER
 */
public class Ficheiro {
     static File directorio=new File("C:\\Gestao");
     File bancoDados=new File("C:\\Gestao\\bd.dat");
      
    
    //
    public void CaminhoPrincipal(){
      
      
        
        if(directorio.exists()){
           System.out.print("Direcorio OK!");
        }else{
            directorio.mkdir();
        }
        
        if(bancoDados.exists()){
           System.out.print("Banco de dados OK!");
           
        }else{
            try {
                bancoDados.createNewFile();
                
                ArrayList<Pessoa> lista=new ArrayList();
              //File bancoDados=new File("C:\\Gestao\\bd.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
             

              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
     public static void create(Pessoa p){
        ArrayList<Pessoa> lista=new ArrayList();
        
         lista= (ArrayList<Pessoa>)lista().clone();
         lista.add(p);
        
          try {
              File bancoDados=new File("C:\\Gestao\\bd.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
    public static void delete(int id){
        ArrayList<Pessoa> lista=new ArrayList();
        
         lista= (ArrayList<Pessoa>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getId()==id){
                lista.remove(i);
            }
        }
        
          try {
              File bancoDados=new File("C:\\Gestao\\bd.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
     public static void edit(int id,Pessoa p){
        ArrayList<Pessoa> lista=new ArrayList();
        
         lista= (ArrayList<Pessoa>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i).getId()==id){
                lista.remove(i);
                lista.add(p);
            }
        }
        
          try {
              File bancoDados=new File("C:\\Gestao\\bd.dat");
              ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(bancoDados));
              
            
              objectOutputStream.writeObject(lista);
              
              objectOutputStream.close();
              
              
              
              System.out.println("Salvo com sucesso");
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          }
    }
    
    
     public static  ArrayList<Pessoa> search(String pessoa){
        ArrayList<Pessoa> lista=new ArrayList();
        
         lista= (ArrayList<Pessoa>)lista().clone();
         
        for (int i = 0; i < lista.size(); i++) {
            
            if(!lista.get(i).getNome().contentEquals(pessoa)){
                
                lista.remove(i);
            }
        }
          return lista;
    }
     
    
    
    public static ArrayList<Pessoa> lista(){
        ArrayList<Pessoa> lista=new ArrayList();
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\Gestao\\bd.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              lista=(ArrayList<Pessoa>)os.readObject();
                   
             os.close();
              
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
         }
        
          return lista;
        
    }
    
    public static void  listas(){
        
       
        
          try {
            
            FileInputStream readData = new FileInputStream("C:\\Gestao\\bd.dat");
            ObjectInputStream os = new ObjectInputStream(readData);
              
              ArrayList<Pessoa> lista=(ArrayList<Pessoa>)os.readObject();
              for (Pessoa pessoa : lista) {
                  System.out.println("Nome:"+pessoa.getNome());
                  System.out.println("Idade:"+pessoa.getIdade());
              }
              os.close();
                  
              
            
          } catch (FileNotFoundException ex) {
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (IOException ex) { 
              Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
             Logger.getLogger(Ficheiro.class.getName()).log(Level.SEVERE, null, ex);
         }
        
         
    }
    
}
