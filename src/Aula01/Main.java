package Aula01;

public class Main {

    static void main() {
        Conta conta1 = new Conta();
        Cliente cliente1 = new Cliente("Gabriel Machado Freitas", "123,132,132,32", conta1);
        conta1.saldo = 0.0;


        conta1.depositar(100.0);
        conta1.sacar(2.0);
    }
}
