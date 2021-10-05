/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author CPU
 */


public class gravaTxt {
    
       TelaCadastroMoveis lista= new TelaCadastroMoveis();
       String nomeMovel = lista.getNomeMovelCadastro().getText();
       String pesoCadMovel= lista.getCampoPesoCadastro().getText();
       String precoCadMovel1= lista.getCampoPrecoCadastro().getText();
       String precoCadMovel2= lista.getCampoPrecoCadastro().getText();
       String precoCadMovel3= lista.getCampoPrecoCadastro().getText();
       String plataformaCad1= lista.getPlataformaCad1().getText();
       String plataformaCad2= lista.getPlataformaCad2().getText();
       String plataformaCad3= lista.getPlataformaCad3().getText();
       String tamanhoCad= lista.getTamanhoEnvioCadastro().getText();
       String qtdCad1= lista.getQtdCad1().getText();
       String qtdCad2= lista.getQtdCad2().getText();
       String qtdCad3= lista.getQtdCad3().getText();
       String qtdCad4= lista.getQtdCad4().getText();
       String qtdCad5= lista.getQtdCad5().getText();
       String materialCad1= lista.getMaterialCad().getText();
       String materialCad2= lista.getMaterialCad2().getText();
       String materialCad3= lista.getMaterialCad3().getText();
       String materialCad4= lista.getMaterialCad4().getText();
       String materialCad5= lista.getMaterialCad5().getText();
    
    public void criaDiretorio() throws IOException{
        java.io.File diretorio = new java.io.File("C:\\sabineM"); 
        if(!diretorio.exists()){
        diretorio.mkdir();
        }
        java.io.File arquivo = new java.io.File(diretorio, "arq_01.txt"); 
        java.io.File arquivo2 = new java.io.File(diretorio, "arq_02.txt"); 
        java.io.File arquivo3 = new java.io.File(diretorio, "arq_03.txt");
        if(!arquivo.exists() || !arquivo2.exists()){
        
        //java.io.File arquivo2 = new java.io.File(diretorio, "arq_02.txt");
          try {
	boolean statusArq = arquivo.createNewFile();
	boolean statusArq2 = arquivo2.createNewFile();
	boolean statusArq3 = arquivo3.createNewFile();
        
	System.out.print(statusArq);
            } catch (IOException e) {
            //e.printStackTrace(); 
            JOptionPane.showMessageDialog(null, "fudeu!");
}
        }
    }

   

}
