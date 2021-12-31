package ocp.good;

import ocp.good.abstraction.IShiping;

public class Order {
    private IShiping shiping;
    private double totalWeight;

    public double getShippingCost() {
        return shiping.getCost(this);
    }


    public void setShiping(IShiping shiping) {
        this.shiping = shiping;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }
}
