package builder;

import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;
import product.type.VegetableType;

public interface IOrderBuilder {
	IOrderBuilder orderBread(BreadType breadType);
	IOrderBuilder orderType(OrderType orderType);
	IOrderBuilder orderSauce(SauceType sauceType);
	IOrderBuilder orderVegetable(VegetableType vegetableType);
	Order build();
}
