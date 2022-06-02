public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void plantTree(Garden garden, int row, int col) {
        Botanist newBotanist = new Botanist();
        if (!newBotanist.checkTreeType(name, color, texture)) {
            TreeType thisTreeType = new TreeType(name, color, texture);
            newBotanist.addTreeType(thisTreeType);
            Tree newTree = new Tree(row, col, thisTreeType);
            garden.plantTree(newTree);
        } else {
            TreeType thisTreeType = newBotanist.getTreeType(name, color, texture);
            Tree newTree = new Tree(row, col, thisTreeType);
            garden.plantTree(newTree);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
}
