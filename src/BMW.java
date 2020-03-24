public class BMW extends Car {
    public String numberTag;
    public String name;

    public BMW(String numberTag, String year20, String color100) {
        super("3", year20, color100);
        this.numberTag = numberTag;
        this.name = super.getCurrentName();
    }

    public String getNumberTag() {
        return numberTag;
    }

    public void setNumberTag(String numberTag) {
        this.numberTag = numberTag;
    }

}
