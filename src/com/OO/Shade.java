package com.OO;

public class Shade {

    private Material material;
    private int translucentness;


    public Shade() {
        this(new Material("cloth", 20), 20);
    }

    public Shade(Material material, int translucentness) {
        this.material = material;
        this.translucentness = translucentness;
    }

    public void lightPenetration(){
        System.out.println("light penetration at full peak!");
        if (this.translucentness < 40) {
            getMaterial().burning();
        }
    }

    public Material getMaterial() {
        return material;
    }
}
