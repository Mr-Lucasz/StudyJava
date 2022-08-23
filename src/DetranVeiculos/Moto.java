/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package DetranVeiculos;

/**
 *
 * @author 01295230208
 */

 public class Moto extends Veiculo
{
   private int cilindradas;

    public Moto(int cilindradas, String modelo, int ano, String placa, double valor) {
        super(modelo, ano, placa, valor);
        this.cilindradas = cilindradas;
    }
   
    public int getCilindradas(){
       return this.cilindradas;   
    }
   public boolean setCilindradas(int cilindradas){
       if( cilindradas > 0 ){
           this.cilindradas = cilindradas;
           return true;
         
       }else{
           return false;
       }    
    }
    
        @Override
       public String toString(){
       return super.toString() + "," 
       + "Moto - Cilindradas: "+ cilindradas;

}


}
