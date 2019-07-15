package io.github.fatihbozik.oca.ch04.example14;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
	this.species = species;
	this.canHop = canHop;
	this.canSwim = canSwim;
    }

    public boolean canHop() {
	return canHop;
    }

    public boolean canSwim() {
	return canSwim;
    }

    public String toString() {
	return species;
    }
}