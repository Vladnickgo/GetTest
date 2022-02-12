package com.company.lesson5;

public class Elements {
    private String prefix;
    private String name;
    private int size;
    private int depth;

    public Elements(String prefix, String name, int size, int depth) {
        this.prefix = prefix;
        this.name = name;
        this.size = size;
        this.depth = depth;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Elements{" +
                "prefix='" + prefix + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", depth=" + depth +
                '}'+"\n";
    }
}
