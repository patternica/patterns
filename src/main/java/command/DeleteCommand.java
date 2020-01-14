package command;

public class DeleteCommand implements Command {

    private int from;
    private int to;

    private EditorService editor;

    public DeleteCommand(int from, int to, EditorService editor) {
        this.from = from;
        this.to = to;
        this.editor = editor;
    }

    public void execute() {
        editor.delete(this.from, this.to);
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }
}
