package command;

public class Main {

    public static void main(String[] args) {
        EditorService editorService = new EditorService();

        PasteCommand pasteCommand = new PasteCommand(0, "Text from start", editorService);
        DeleteCommand deleteCommand = new DeleteCommand(1, 10, editorService);

        Button deleteButton = new Button("Delete", deleteCommand);
        Button pasteButton = new Button("Paste", pasteCommand);

        deleteButton.executeCommand();
        pasteButton.executeCommand();

    }

}
