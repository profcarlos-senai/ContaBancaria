public class Main1 {
    public static void main(String[] args) {
        // cria um objeto da classe ContaBancaria e guarda em minhaGrana
        ContaBancaria minhaGrana = new ContaBancaria();
        minhaGrana.depositar(500);
        System.out.println("(Grana) Tenho R$ " + minhaGrana.getSaldo() );

        // outra guarda o mesmo objeto que tem em minhaGrana
        ContaBancaria outra;
        outra = minhaGrana;
        System.out.println("(Outra) Tenho R$ " + outra.getSaldo() );

        // se eu altero uma a outra tem o mesmo novo valor
        minhaGrana.sacar(100);
        System.out.println("(Grana depois do saque) Tenho R$ " + minhaGrana.getSaldo() );
        System.out.println("(Outra depois do saque) Tenho R$ " + outra.getSaldo() );

        outra.depositar(1);
        System.out.println("(Grana ao final) Tenho R$ " + minhaGrana.getSaldo() );
        System.out.println("(Outra ao final) Tenho R$ " + outra.getSaldo() );

        // Strings também são objetos
        String nome, sobrenome;
        nome= "Juca";
        sobrenome = "Silva";

        String imprimir = nome;
        System.out.println("Nome: " + imprimir);
        imprimir = "Silva";
        System.out.println("Sobrenome: " + imprimir);



    }
}
