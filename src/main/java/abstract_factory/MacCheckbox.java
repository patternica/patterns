package abstract_factory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painted checkbox for Mac");
    }
}
