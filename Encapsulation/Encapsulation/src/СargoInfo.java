public final class СargoInfo {
    Dimension_And_Delivery dimensions_And_delivery = new Dimension_And_Delivery(30, 40, 50);
    int weight;
    int deliveryAddress;
    boolean toTurn = true;
    String registrationNumber;
    boolean fragility = false;

    public СargoInfo(int weight, int deliveryAddress, boolean toTurn, String registrationNumber, boolean fragility) {
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.toTurn = toTurn;
        this.registrationNumber = registrationNumber;
        this.fragility = fragility;
    }


}

