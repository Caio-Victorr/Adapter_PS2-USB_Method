public class Main {
    public static void main(String[] args) {
       SaidaUSB saiUsb = new SaidaUSB();
       ConexaoPS2 ConPs2 = new ConexaoPS2();
       ConexaoUSB ConUsb = new ConexaoUSB();
       Adaptador adapt = new Adaptador();

       System.out.println(adapt.conecta(ConPs2));
    }
}