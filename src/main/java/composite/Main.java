package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final CompoundGraphic all = new CompoundGraphic();

    public static void main(String[] args) {
        load();

        List<Graphic> selected = new ArrayList<>();
        selected.add(all.get(2));
        selected.add(all.get(0));

        groupSelected(selected);
    }

    public static void load() {
        all.add(new Dot(4, 8));
        all.add(new Circle(12, 3, 16.5));
        all.add(new Circle(8, 1, 20.5));
    }

    public static void groupSelected(List<Graphic> selected) {
        CompoundGraphic group = new CompoundGraphic();

        System.out.println("Moving ------------------");
        group.addAll(selected);
        all.removeAll(selected);
        all.add(group);

        all.move(2, 3);
        System.out.println("Drawing ------------------");
        all.draw();
    }
}
