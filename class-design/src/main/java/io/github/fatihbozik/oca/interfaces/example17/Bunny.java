package io.github.fatihbozik.oca.interfaces.example17;

public class Bunny implements Hop {
    public void printDetails() {
//	 System.out.println(getJumpHeight()); // DOES NOT COMPILE
	System.out.println(Hop.getJumpHeight());
    }
}
