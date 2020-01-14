package momento;

public class Editor {

    private State state;

    public Editor() {
        this.state = new State();
    }

    public void setText(String text) {
        this.state.text = text;
    }

    public void setCursorPos(int cursorPos) {
        this.state.cursorPos = cursorPos;
    }

    public void setCurrentFont(String currentFont) {
        this.state.currentFont = currentFont;
    }

    public Snapshot makeSnapshot() {
        return new Snapshot(this.state.clone());
    }

    public void restore(Snapshot snapshot) {
        this.state = snapshot.getState();
    }

    @Override
    public String toString() {
        return "Text: " + this.state.text + " | cursor: " + this.state.cursorPos + " | font: " + this.state.currentFont;
    }

    class State {

        private String text;
        private int cursorPos;
        private String currentFont;

        public State() {
        }

        public State(String text, int cursorPos, String currentFont) {
            this.text = text;
            this.cursorPos = cursorPos;
            this.currentFont = currentFont;
        }

        public State clone() {
            return new State(this.text, this.cursorPos, this.currentFont);
        }
    }
}
