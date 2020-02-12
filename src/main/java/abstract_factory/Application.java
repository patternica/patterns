package abstract_factory;

public class Application {

    private final GUIFactory guiFactory;

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;

        this.createUi();
    }

    private void createUi() {
        this.button = this.guiFactory.createButton();
        this.checkbox = this.guiFactory.createCheckbox();
    }

    public void paint() {
        this.button.paint();
        this.checkbox.paint();
    }
}
