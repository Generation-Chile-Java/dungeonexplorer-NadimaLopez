public class Objeto implements gameObjects {
    private String name;
    public Objeto(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
}
