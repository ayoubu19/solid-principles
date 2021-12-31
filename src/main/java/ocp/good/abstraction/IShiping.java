package ocp.good.abstraction;

import ocp.good.Order;

public interface IShiping {
    double getCost(Order order);
}
