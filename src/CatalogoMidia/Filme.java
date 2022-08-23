/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CatalogoMidia;

/**
 *
 * @author 01295230208
 */
public class Filme extends Item{
   
  private String diretor;

    public Filme(String diretor, String titulo, double duracao, String comentario) {
        super(titulo, duracao, comentario);
        this.diretor = diretor;
    }
    
   
    public String getDiretor() {
        return diretor;
    }

    public boolean setDiretor(String diretor) {
        if (!diretor.isEmpty()){
            this.diretor = diretor;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
        "diretor = " + diretor;
    }

   

    
}