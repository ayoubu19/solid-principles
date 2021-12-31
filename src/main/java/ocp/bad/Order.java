package ocp.bad;

public class Order {
    private String shipingType;
    private int totalWeight;
    private double shippingCost;

    public String getShipingType() {
        return shipingType;
    }

    public void setShipingType(String shipingType) {
        this.shipingType = shipingType;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getShippingCost(){

        if(shipingType.equals("ground")){
            shippingCost = totalWeight < 100 ? 0 : totalWeight * 2;
        }

        if(shipingType.equals("air")){
            shippingCost = totalWeight < 100 ? 0 : totalWeight * 3.5;
        }

        return shippingCost;
    }
}
