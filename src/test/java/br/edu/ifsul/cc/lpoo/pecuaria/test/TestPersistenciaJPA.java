/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.pecuaria.test;

import br.edu.ifsul.cc.lpoo.pecuaria.modelo.Raca;
import br.edu.ifsul.cc.lpoo.pecuaria.modelo.dao.PersistenciaJPA;
import org.junit.Test;


/**
 *
 * @author damen
 */
public class TestPersistenciaJPA {
    
    //@Test
    public void testConexaoJPA(){
        //criar um objeto do tipo PersistenciaJPA.
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
            jpa.fecharConexao();
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    
    //@Test
    public void testeRaca() throws Exception{
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
           
            Raca r = new Raca();
            r.setNome("Angus");
            
            jpa.persist(r);
            System.out.print("Raça: " + r.getNome() + " / id: " + r.getId());
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    
   
    //@Test
    public void alterarRaca() throws Exception{
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
           
            Raca r = (Raca) jpa.find(Raca.class, 1);
            
            r.setNome("NomeAlterado");
            jpa.persist(r);
            
            System.out.print("Raça: " + r.getNome() + " / id: " + r.getId());
            
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
    
    @Test
    public void removerRaca() throws Exception{
        
        PersistenciaJPA jpa = new PersistenciaJPA();
        if(jpa.conexaoAberta()){
            System.out.println("conectou no BD via jpa ...");
           
            Raca r = (Raca) jpa.find(Raca.class, 1);
            
            jpa.remover(r);
            
            System.out.print("Raça " + r.getId() + " removida.");
            
        }else{
            System.out.println("nao conectou no BD ...");
                        
        }
    }
}
