package abstract_factory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Painted button for Mac");
    }
}
