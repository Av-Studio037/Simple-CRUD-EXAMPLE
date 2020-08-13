/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudexpemlo;

import controller.Ficheiro;
import view.TelaGestao;

/**
 *
 * @author KPROGRAMMER
 */
public class CrudExpemlo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TelaGestao tela=new TelaGestao();
        
        Ficheiro ficheiro=new Ficheiro();
        ficheiro.CaminhoPrincipal();
      
        
        
        
    }
    
}
