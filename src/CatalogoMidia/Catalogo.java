/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package CatalogoMidia;

import java.util.ArrayList;

/**
 *
 * @author 01295230208
 */
public class Catalogo{
    private String colecionador;
    private ArrayList<Item> itens;
    

    public Catalogo(String colecionador){
        this.colecionador = colecionador;
        this.itens = new ArrayList<Item>();
   
    }

    public void addItem(Item umItem){
        this.itens.add(umItem);
    }



    public String toString(){
        String texto = "Colecionador: "+this.colecionador+"\n";
        texto += "Itens: \n";
        for(Item it: itens){
         it.toString();
        }

        return texto;
    }
}
