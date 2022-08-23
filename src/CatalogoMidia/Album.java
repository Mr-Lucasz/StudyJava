/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CatalogoMidia;

/**
 *
 * @author 01295230208
 */
public class Album extends Item {

   
   
    private String artista;
    private int faixas;

     public Album(String artista, int faixas, String titulo, double duracao, String comentario) {
        super(titulo, duracao, comentario);
        this.artista = artista;
        this.faixas = faixas;
    }
    public String getArtista() {
        return artista;
    }

    public boolean setArtista(String artista) {
        if (!artista.isEmpty()){
            this.artista = artista;
            return true;
        }else{
            return false;
        }
    }

    public int getFaixas() {
        return faixas;
    }

    public boolean setFaixas(int faixas) {
        if (faixas > 0){
            this.faixas = faixas;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
       return super.toString() + ", " +  "Album{" + "artista=" + artista + ", faixas=" + faixas + '}';
    }


}

