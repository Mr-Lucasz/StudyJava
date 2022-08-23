/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CatalogoMidia;

/**
 *
 * @author 01295230208
 */
public class Jogo extends Item
{
   private int jogadores;
   private String plataforma;

    public Jogo(int jogadores, String plataforma, String titulo, double duracao, String comentario) {
        super(titulo, duracao, comentario);
        this.jogadores = jogadores;
        this.plataforma = plataforma;
    }
   
   
    
    public String getPlataforma() {
        return this.plataforma;
    }

    public boolean setPlataforma(String plataforma) {
        if ( !plataforma.isEmpty() ){
            this.plataforma = plataforma;
            return true;
        }else{
            return false;
        }
        
    }    
     public int getJogadores() {
        return this.jogadores;
    }

    public boolean setDuracao(int duracao) {
        if (jogadores >= 2){
            this.jogadores = jogadores;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + " Jogo{" + "jogadores=" + jogadores + ", plataforma=" + plataforma + '}';
    }
    
}

