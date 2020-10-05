package com.company;

import java.util.concurrent.ThreadLocalRandom;

class Dau {

    private int valor;

    int tirar(){
        return ThreadLocalRandom.current().nextInt(1,7);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
