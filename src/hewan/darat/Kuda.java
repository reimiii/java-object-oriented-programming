package hewan.darat;

import hewan.Binatang;

public class Kuda {
    public static void main(String[] args) {
        Binatang binatang = new Binatang("Kuda", 1000000);
        System.out.println(binatang.name);
        System.out.println(binatang.price);
    }
}
