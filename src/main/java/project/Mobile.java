package project;

import java.util.Collections;

public class Mobile {
    private String brand;
    private String model;
    private ModelProperties modelProperties;

    protected static class ModelProperties {
        private int accumSize;
        private double screenSize;
        private int RAM;
        private int memory;
        private int price;

        public ModelProperties(int accumSize, double screenSize, int RAM, int memory, int price) {
            this.accumSize = accumSize;
            this.screenSize = screenSize;
            this.RAM = RAM;
            this.memory = memory;
            this.price = price;
        }

        public int getAccumSize() {
            return accumSize;
        }
        public double getScreenSize() {
            return screenSize;
        }
        public int getRAM() {
            return RAM;
        }
        public int getMemory() {
            return memory;
        }
        public int getPrice() {
            return price;
        }
    }

    public Mobile(String brand, String  model, ModelProperties modelProperties) {
        this.brand = brand;
        this.model = model;
        this.modelProperties = modelProperties;
    }

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public ModelProperties getModelProperties() {
        return modelProperties;
    }

    public void printMobile() {
        System.out.println("Brand: " + brand + ", model: " + model + ", accumSize: " + modelProperties.accumSize + ", screenSize: " + modelProperties.screenSize
        + ", RAM: " + modelProperties.RAM + ", memory: " + modelProperties.memory + ", price: " + modelProperties.price);
    }
}
