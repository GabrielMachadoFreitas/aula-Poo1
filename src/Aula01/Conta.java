package Aula01;

import java.math.BigDecimal;

public class Conta {
    Double saldo;

    public void depositar (Double saldo) {
        this.saldo += saldo;
    }
/*
* public void sacar (Double valorSaque) {

    if (valorSaque > saldo) {
        System.out.println("Saldo insuficiente para saque");
    }
    else if (valorSaque <= 0) {
        System.out.println("Valor invalido");
    }else {
        System.out.println("Saque feito");
        saldo -= valorSaque;
        System.out.printf("O saldo restante é: %.2f" ,saldo);
    }
}
* */
public void sacar (Double valorSaque) {

    if (valorSaque > saldo || valorSaque <= 0) {
        System.out.println("Saldo insuficiente para saque ou valor invalido");
        return;
    }
    saldo -= valorSaque;
}


    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
