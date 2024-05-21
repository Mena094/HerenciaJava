public class App {
    public static void main(String[] args) {
        Coche obj = new Coche();
        obj.setMarca("Toyota");
        obj.setAño(1999);
        obj.setNumPuertas(4);
        System.out.println("Este medio de transporte es del año: "
                + obj.getAño() + "su marca es: " + obj.getMarca() +
                " y tiene: " + obj.getNumPuertas() + " puertas");
        obj.arrancar();
    }
}
