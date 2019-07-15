package io.github.fatihbozik.oca.ch04.example1.pond.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
	System.out.println(noise);
    }

    private void makeNoise() {
	quack();
    }
}
