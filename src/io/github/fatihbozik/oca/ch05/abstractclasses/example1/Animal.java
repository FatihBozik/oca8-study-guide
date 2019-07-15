package io.github.fatihbozik.oca.ch05.abstractclasses.example1;

public abstract class Animal {
    protected int age;

    public void eat() {
	System.out.println("Animal is eating");
    }

    public abstract String getName();
}
