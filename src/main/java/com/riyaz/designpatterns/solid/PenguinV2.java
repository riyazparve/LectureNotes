package com.riyaz.designpatterns.solid;

public class PenguinV2 extends BirdV2 {
    @Override
    public void fly() {
	throw new UnsupportedOperationException("Penguins cannot fly");
    }

}
