public class Main {
    public static void main(String[] args) {
        // cria um objeto da classe ContaBancaria e guarda em minhaGrana
        ContaBancaria minhaGrana = new ContaBancaria();
        minhaGrana.depositar(500);
        System.out.println("(Grana) Tenho R$ " + minhaGrana.getSaldo() );

    }
}
