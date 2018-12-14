package com.OO;

public class Table {


    private Material material;
    private int height;
    private int width;
    private boolean clean;

    public Table() {
        this(new Material("wood", 100), 21, 33, true);
    }

    public Table(Material material, int height, int width, boolean clean) {
        this.material = material;
        this.height = height;
        this.width = width;
        this.clean = clean;
    }
}
