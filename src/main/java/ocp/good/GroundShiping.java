package ocp.good;

import ocp.good.abstraction.IShiping;

public class GroundShiping implements IShiping {
    @Override
    public double getCost(Order order) {
        return order.getTotalWeight() < 100 ? 0 : order.getTotalWeight() * 2;
    }
}
