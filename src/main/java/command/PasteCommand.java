package command;

public class PasteCommand implements Command {

    private int position;
    private String text;

    private EditorService editor;

    public PasteCommand(int position, String text, EditorService editor) {
        this.position = position;
        this.text = text;
        this.editor = editor;
    }

    public void execute() {
        editor.paste(position, text);
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setEditor(EditorService editor) {
        this.editor = editor;
    }
}
