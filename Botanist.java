import java.util.*;

public class Botanist {
    private List<TreeType> treeTypeList;

    public Botanist() {
        treeTypeList = new ArrayList<>();
    }

    public void addTreeType(String name, String color, String texture) {
        if (!checkTreeType(name, color, texture)) {
            TreeType inputTreeType = new TreeType(name, color, texture);
            treeTypeList.add(inputTreeType);
        }
    }

    public void addTreeType(TreeType inputTreeType) {
        if (!treeTypeList.contains(inputTreeType)) {
            treeTypeList.add(inputTreeType);
        }
    }

    public TreeType getTreeType(String name, String color, String texture) {
        for (TreeType loopTreeType: treeTypeList) {
            if (loopTreeType.getName().equals(name) && 
                loopTreeType.getColor().equals(color) &&
                loopTreeType.getTexture().equals(texture)) {
                    return loopTreeType;
            }
        }
        return null;
    }

    public boolean checkTreeType(String name, String color, String texture) {
        TreeType inputTreeType = new TreeType(name, color, texture);
        return treeTypeList.contains(inputTreeType);
    }
}
