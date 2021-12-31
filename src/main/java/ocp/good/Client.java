package ocp.good;

import ocp.good.abstraction.IShiping;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setTotalWeight(179);
        IShiping shiping = new GroundShiping();
        order.setShiping(shiping);
        double shippingCost = order.getShippingCost();
        System.out.println(shippingCost);
    }
}
