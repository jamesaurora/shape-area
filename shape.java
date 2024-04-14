
class shape {
    private String name;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

}

class rectangle extends shape {
    private int length, width;

    public void setlength(int length) {
        this.length = length;
    }

    public int getlength() {
        System.out.println("panjang  rectangle: " + length);
        return length;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public int getwidth() {
        System.out.println("lebar rectangle: " + width);
        return width;
    }

    int calculateArea() {
        return this.length * this.width;
    }

}

class circle extends shape {
    private int radius;

    public void setradius(int radius) {
        this.radius = radius;
    }

    public int getradius() {
        System.out.println("radius dari circle : " + radius);
        return radius;
    }

    int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    public static void main(String[] args) {
        shape shape = new shape();
        shape.setname("\nMENGHITUNG PERSEGI PANJANG DAN LINGKARAN");
        System.out.println(shape.getname());
        rectangle rec = new rectangle();
        rec.setlength(12);
        rec.setwidth(5);
        rec.getlength();
        rec.getwidth();
        System.out.println("luas dari rectangle : " + rec.calculateArea());
        System.out.println("\n");

        circle cir = new circle();
        cir.setradius(7);
        cir.getradius();
        System.out.println("luas dari circle: " + cir.calculateArea());

    }

}