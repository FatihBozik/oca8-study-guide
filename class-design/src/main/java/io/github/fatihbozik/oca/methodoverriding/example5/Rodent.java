package io.github.fatihbozik.oca.methodoverriding.example5;

public class Rodent {
    protected int tailLength = 4;

    public void getRodentDetails() {
	System.out.println("[parentTail=" + tailLength + "]");
    }
}
