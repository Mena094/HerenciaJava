public class medioTransporte {
    private String marca;
    private String modelo;
    private int año;

    public void arrancar(){
        System.out.println("El medio de transporte esta arrancando");
    }
    public medioTransporte() {
    }

    public medioTransporte(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
