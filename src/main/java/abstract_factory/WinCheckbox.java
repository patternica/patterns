package abstract_factory;

public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Painted checkbox for Windows");
    }
}
