/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DetranVeiculos;

import java.util.ArrayList;

/**
 *
 * @author 01295230208
 */
public class Detran {


    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String estado;
    private ArrayList<Veiculo> veiculos;
    
    public Detran(String estado){
        this.estado = estado;
        this.veiculos = new ArrayList<Veiculo>();
    }
      public void addVeiculo(Veiculo umVeiculo){
        this.veiculos.add(umVeiculo);
    }
    
   
    @Override
     public String toString(){
        String texto = "Estado: "+this.estado+"\n";
        texto += "Veiculos: \n";
        for(Veiculo vei: veiculos){
         vei.toString();
        }

        return texto;
    }
}


