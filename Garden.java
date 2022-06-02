import java.util.*;

public class Garden {
    private List<Tree> treeList;
    private Tree[][] garden;

    public Garden(Tree[][] garden) {
        treeList = new ArrayList<>();
        this.garden = garden;
    }

    public Garden(int length, int width) {
        treeList = new ArrayList<>();
        garden = new Tree[length][width];
    }

    public void addTree(Tree newTree) {
        if (!treeList.contains(newTree)) {
            treeList.add(newTree);
        }
    }

    public Tree extractTree(int row, int col, TreeType inputTreeType) {
        for (Tree loopTree: treeList) {
            if (loopTree.getRow() == row && 
                loopTree.getCol() == col && 
                loopTree.getTreeType().equals(inputTreeType)) {
                    return loopTree;
            }
        }
        return null;
    }

    public boolean checkTree(int row, int col) {
        return garden[row][col] != null;
    }

    public void plantTree(Tree newTree) {
        if (!checkTree(newTree.getRow(), newTree.getCol())) {
            garden[newTree.getRow()][newTree.getCol()] = newTree;
            treeList.add(newTree);
        }
    }
}
