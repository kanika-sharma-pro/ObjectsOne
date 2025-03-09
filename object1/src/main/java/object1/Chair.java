public class Chair {
    private String material;
    private String color;
    private int legs;

    public Chair(String material, String color, int legs) {
        this.material = material;
        this.color = color;
        this.legs = legs;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}

/* Chair chair1 = new Chair("Wood","Brown",4);
Chair chair2 = new Chair("Metal","Black",4);
Chair chair3 = new Chair("Plastic","Red",4);


Chair[] chairs = new Chair[3];
chairs[0] = chair1;
chairs[1] = chair2;
chairs[2] = chair3;}*/