package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Arquivo {
    
    public void criaDiretorio(){
        java.io.File diretorio = new java.io.File("C:\\SabineMoveis");
        boolean statusDir = diretorio.mkdir();
        
    }
    
}
