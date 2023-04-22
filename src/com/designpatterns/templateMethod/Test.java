package com.designpatterns.templateMethod;

public class Test {
    public static void main(String[] args) {
        DataRenderer dataRenderer = new XMLDataRenderer();
        dataRenderer.render();

        ComputerManufacturer computerManufacturer = new LaptopManufacturer();
        computerManufacturer.buildComputer("Laptop");
    }
}
