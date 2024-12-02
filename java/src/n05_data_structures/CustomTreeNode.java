package n05_data_structures;

import java.util.*;

public class CustomTreeNode<T>
{
    public final T value;
    public final CustomTreeNode<T> parent;
    private final List<CustomTreeNode<T>> children;

    public CustomTreeNode(T value) {
        this(value, null);
    }

    public CustomTreeNode(T value, CustomTreeNode<T> parent) {
        this.value = value;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public CustomTreeNode<T> addChild(T value) {
        CustomTreeNode<T> newNode = new CustomTreeNode<>(value, this);
        this.children.add(newNode);
        return newNode;
    }

    public boolean removeChild(T value) {
        return this.children.removeIf(child -> child.value.equals(value));
    }

    @Override
    public String toString() {
        return toString("", true, false);
    }

    private String toString(String prefix, boolean isRoot, boolean haveNext) {
        StringBuilder builder = new StringBuilder();
        if (!isRoot) {
            builder.append(prefix);
            builder.append(haveNext ? "├─ " : "└─ ");
            prefix += haveNext ? "│  " : "   ";
        }
        builder.append(this.value).append("\n");

        int numChildren = this.children.size();
        for (int i = 0; i < numChildren; i++) {
            CustomTreeNode<T> child = this.children.get(i);
            builder.append(child.toString(prefix, false, (numChildren - 1) != i));
        }

        return builder.toString();
    }
}
