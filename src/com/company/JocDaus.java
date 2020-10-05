package com.company;

class JocDaus {

    private final Dau d1;
    private final Dau d2;
    private final Dau d3;

    private int guanyar;

    public JocDaus() {
        d1 = new Dau();
        d2 = new Dau();
        d3 = new Dau();
    }

    void play(){

        d1.setValor(d1.tirar());
        d2.setValor(d2.tirar());
        d3.setValor(d3.tirar());

        System.out.println("Dau 1: " + d1.getValor() +" | Dau 2: " + d2.getValor() + " | Dau 3: " + d3.getValor());
         if(d1.getValor() == d2.getValor() && d2.getValor() == d3.getValor()) {
             System.out.println("Has guanyat!");
             guanyar++;
         }
         else System.out.println("Has perdut :c");

    }

    void victories(){
        System.out.println("Has guanyat " + guanyar + " vegades als Daus");
    }
}
