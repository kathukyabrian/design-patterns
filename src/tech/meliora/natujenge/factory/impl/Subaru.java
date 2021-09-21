package tech.meliora.natujenge.factory.impl;

import tech.meliora.natujenge.factory.ICar;

public class Subaru implements ICar {
    @Override
    public void start() {
        System.out.println("Starting a Subaru");
    }

    @Override
    public void shiftUp() {
        System.out.println("Shifting up in a Subaru");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating in a Subaru");
    }

    @Override
    public void shiftDown() {
        System.out.println("Shifting down in a Subaru");
    }

    @Override
    public void brake() {
        System.out.println("Braking down in a Subaru");

    }

    @Override
    public void stop() {
        System.out.println("Stopping in a Subaru");

    }
}
