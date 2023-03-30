package org.example;

public class Capibara extends Animal implements AnimalInterface{
    private String name;

    public String getName() { // правой кнопкой на пустое поле и Generate. Так создаем геттер и сеттер
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        String a;
    }

    @Override
    public void voice(){
        System.out.println("hi, I'm Capibara");
    }

    @Override
    public void sayWithInterface() {
        System.out.println("I'm intrface");
    }
}
