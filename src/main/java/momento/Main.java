package momento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final List<Snapshot> history = new ArrayList<Snapshot>();

    public static void main(String[] args) {
        Editor editor = new Editor();

        editor.setText("Text in editor");
        editor.setCursorPos(8);
        editor.setCurrentFont("Times New Roman");

        System.out.println("1:    " + editor);

        history.add(editor.makeSnapshot());

        editor.setText("After snapshot 1");
        editor.setCursorPos(0);
        editor.setCurrentFont("Segoe UI");

        System.out.println("2:    " + editor);

        editor.restore(history.get(0));

        System.out.println("3:    " + editor);
    }
}
