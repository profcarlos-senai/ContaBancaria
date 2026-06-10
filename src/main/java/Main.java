public class Main {
    public static void main(String[] args) {
        // cria um objeto da classe ContaBancaria e guarda em minhaGrana
        ContaBancaria minhaGrana = new ContaBancaria();
        minhaGrana.depositar(500);
        System.out.println("Tenho R$ " + minhaGrana.getSaldo() );
        minhaGrana.sacar(100);
        System.out.println("Sobrou R$ " + minhaGrana.getSaldo() );
    }
}
