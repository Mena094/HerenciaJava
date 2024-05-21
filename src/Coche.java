public class Coche extends medioTransporte {
   private int numPuertas;

   @Override
   public void arrancar(){
       System.out.println("El coche esta arrancando");
   }
    public Coche() {
    }
    public Coche(String pMarca, String pModelo, int pAño, int pNumPuertas) {
        super(pMarca, pModelo, pNumPuertas);
        this.numPuertas = numPuertas;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}
