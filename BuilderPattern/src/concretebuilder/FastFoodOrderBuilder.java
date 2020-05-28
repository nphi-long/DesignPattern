package concretebuilder;

import builder.IOrderBuilder;
import product.order.Order;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;
import product.type.VegetableType;

public class FastFoodOrderBuilder implements IOrderBuilder{
	private BreadType breadType;
	private OrderType orderType;
	private SauceType sauceType;
	private VegetableType vegetableType;
	@Override
	public IOrderBuilder orderBread(BreadType breadType) {
		this.breadType = breadType;
		return this;
	}

	@Override
	public IOrderBuilder orderType(OrderType orderType) {
		this.orderType = orderType;
		return this;
	}

	@Override
	public IOrderBuilder orderSauce(SauceType sauceType) {
		this.sauceType = sauceType;
		return this;
	}

	@Override
	public IOrderBuilder orderVegetable(VegetableType vegetableType) {
		this.vegetableType = vegetableType;
		return this;
	}

	@Override
	public Order build() {
		return new Order(breadType, orderType, sauceType, vegetableType);
	}
}
