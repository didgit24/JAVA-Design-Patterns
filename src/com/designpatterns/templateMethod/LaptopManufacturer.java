package com.designpatterns.templateMethod;

public class LaptopManufacturer extends ComputerManufacturer{
    @Override
    public String addHardDisk(String computerType) {
        return "Hard disk of " + computerType;
    }

    @Override
    public String addRam(String computerType) {
        return "Ram of " + computerType;
    }

    @Override
    public String addKeyboard(String computerType) {
        return "Keyboard of " + computerType;
    }
}
