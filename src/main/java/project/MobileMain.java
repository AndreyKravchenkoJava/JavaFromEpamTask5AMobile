package project;

public class MobileMain {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Xiaomi", "Redmi Note 8 Pro", new Mobile.ModelProperties(5000, 6.5, 6, 64, 200));
        Mobile mobile2 = new Mobile("Apple", "Iphone 13 Pro Max", new Mobile.ModelProperties(5000, 6.5, 6, 512, 1500));
        mobile1.printMobile();
        mobile2.printMobile();
    }
}
