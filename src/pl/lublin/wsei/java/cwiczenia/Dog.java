package pl.lublin.wsei.java.cwiczenia;

import javax.xml.namespace.QName;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveSound() {
        System.out.println("Jestem psem i nazywam się"+getName());
    }
}
