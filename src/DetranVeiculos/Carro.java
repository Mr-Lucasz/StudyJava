/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DetranVeiculos;

/**
 *
 * @author 01295230208
 */
public class Carro extends Veiculo{

 private int portas;

    public Carro(int portas, String modelo, int ano, String placa, double valor) {
        super(modelo, ano, placa, valor);
        this.portas = portas;
    }

       public int getPortas(){
       return this.portas;   
    }
   public boolean setportas(int portas){
       if( portas > 2 || portas <=6){
           this.portas = portas;
           return true;
         
       }else{
           return false;
       }    
       
   }
   
   @Override
   public String toString(){
       return super.toString() + "," 
       + "Carro - Portas: "+ portas;
   }
   
}


