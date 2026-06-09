public class Main {
    static void main(String[] args) {
        ContaBancaria minhaGrana = new ContaBancaria();
        minhaGrana.depositar(500);
        System.out.println("Tenho R$ " + minhaGrana.getSaldo() );
    }
}
