class Noodle {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    private String shape;
    protected String ingredients;
    private String texture = "brittle";

    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;
    }

    public void cook() {

        System.out.println("Boiling");

        this.texture = "cooked";
    }

    final public boolean isTasty() {
        return true;
    }

    public static void main(String[] args) {
        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();

        // Ramen yasaiRamen = new Ramen();
        // System.out.println(yasaiRamen.ingredients);
        // System.out.println(yasaiRamen.isTasty());

        // Pho phoChay = new Pho();
        // System.out.println(phoChay.shape);

        // Spaghetti spaghettiPomodoro = new Spaghetti();
        // System.out.println(spaghettiPomodoro.texture);
    }
}