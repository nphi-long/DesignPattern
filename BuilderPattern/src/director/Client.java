package director;

import concretebuilder.FastFoodOrderBuilder;
import product.order.Order;

public class Client {
	public static void main(String[] args) {
		Order order = new FastFoodOrderBuilder().orderBread(null)
												.orderType(null)
												.orderVegetable(null).build();
		System.out.println(order);
	}
}
