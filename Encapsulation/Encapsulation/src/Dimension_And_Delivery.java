public class Dimension_And_Delivery {
    private final int height;
    private final int width;
    private final int length;
    private int dimensions;

    public Dimension_And_Delivery(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
        dimensions = height * width * length;
    }
    public Dimension_And_Delivery setHeight() {
        return new Dimension_And_Delivery(height, width, length);
    }

}

