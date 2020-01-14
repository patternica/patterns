package command;

public class EditorService {

    public void delete(int from, int to) {
        System.out.println("Deleted text from " + from + " to " + to);
    }


    public void paste(int position, String text) {
        System.out.println("Paste text: " + text + " to position: " + position);
    }


}
