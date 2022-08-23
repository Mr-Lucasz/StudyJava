/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CatalogoMidia;

/**
 *
 * @author 01295230208
 */
public class Item 
{

    public Item(String titulo, double duracao, String comentario) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.comentario = comentario;
    }
    private String titulo;
    private double duracao;
    private String comentario;
    
    
    public String getComentario() {
        return this.comentario;
    }

    public boolean setComentario(String comentario) {
        if (!comentario.isEmpty()){
            this.comentario = comentario;
            return true;
        }else{
            return false;
        }
    }
    
    
    public String getTitulo() {
        return this.titulo;
    }

    public boolean setTitulo(String titulo) {
        if ( !titulo.isEmpty() ){
            this.titulo = titulo;
            return true;
        }else{
            return false;
        }
    }
    
     public double getDuracao() {
        return this.duracao;
    }

    public boolean setDuracao(double duracao) {
        if (duracao >= 0){
            this.duracao = duracao;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Item{" + "titulo=" + titulo + ", duracao=" + duracao + ", comentario=" + comentario + '}';
    }
}

