package bridge_v2;

public class Color {

    private String name;
    private boolean shadow;

    public Color(String name, boolean shadow) {
        this.name = name;
        this.shadow = shadow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isShadow() {
        return shadow;
    }

    public void setShadow(boolean shadow) {
        this.shadow = shadow;
    }
}
