package abstract_factory;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Main {

    private static final String OS = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) {
        GUIFactory guiFactory;

        if (isWindows()) {
            guiFactory = new WinFactory();
        } else if (isMac()) {
            guiFactory = new MacFactory();
        } else {
            throw new NotImplementedException();
        }

        Application application = new Application(guiFactory);

        application.paint();
    }

    public static boolean isWindows() {
        return OS.contains("win");
    }

    public static boolean isMac() {
        return OS.contains("mac");

    }
}
