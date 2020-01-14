package command;

public class Button {

    private String text;
    private Command command;

    public Button(String text, Command command) {
        this.text = text;
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void executeCommand() {
        this.command.execute();
    }
}
