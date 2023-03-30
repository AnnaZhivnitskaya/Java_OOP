package org.example;

public class Main {
    public static void main(String[] args){
        Capibara capibara = new Capibara();
        capibara.voice();
        capibara.sayWithInterface();

        VendingMachine vm = new VendingMachine();
        vm.addProduct(name:"cola", cost:100);
        vm.addProduct(name:"snikers", cost:60);
        System.out.println(vm.getProductByPrise(60).toString());
        System.out.println(vm.getProductByName("cola").toString());

    }
}