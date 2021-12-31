package ocp.bad;


public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setTotalWeight(179);
        order.setShipingType("ground");
        double shippingCost = order.getShippingCost();
        System.out.println(shippingCost);
    }
}
