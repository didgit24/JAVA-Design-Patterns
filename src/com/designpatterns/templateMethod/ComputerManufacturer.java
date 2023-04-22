package com.designpatterns.templateMethod;

public abstract class ComputerManufacturer {

    public void buildComputer(String computerType) {
        String hardDisk = addHardDisk(computerType);
        String ram = addRam(computerType);
        String keyboard = addKeyboard(computerType);

        System.out.println(hardDisk + " " + ram + " " + keyboard);
    }

    public abstract String addHardDisk(String computerType);
    public abstract String addRam(String computerType);
    public abstract String addKeyboard(String computerType);
}
