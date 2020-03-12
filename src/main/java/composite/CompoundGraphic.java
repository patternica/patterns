package composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic {

    private final List<Graphic> children = new ArrayList<>(1);

    @Override
    public void move(int x, int y) {
        System.out.println("Group:");

        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Group:");

        for (Graphic child : children) {
            child.draw();
        }
    }

    public void add(Graphic graphic) {
        children.add(graphic);
    }

    public Graphic get(int index) {
        return children.get(index);
    }

    public void addAll(List<Graphic> graphics) {
        children.addAll(graphics);
    }

    public void removeAll(List<Graphic> graphics) {
        children.removeAll(graphics);
    }

    public List<Graphic> getChildren() {
        return children;
    }
}
