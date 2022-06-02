public class Tree {
    private int row;
    private int col;
    private TreeType treeType;

    public Tree(int row, int col, TreeType treeType) {
        this.row = row;
        this.col = col;
        this.treeType = treeType;
    }

    public void plantTree(Garden garden) {
        if (!garden.checkTree(row, col)) {
            Tree newTree = new Tree(row, col, treeType);
            garden.addTree(newTree);
            garden.plantTree(newTree);
        } else {
            Tree newTree = garden.extractTree(row, col, treeType);
            garden.plantTree(newTree);
        }
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setTreeType(TreeType treeType) {
        this.treeType = treeType;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public TreeType getTreeType() {
        return treeType;
    }
}
