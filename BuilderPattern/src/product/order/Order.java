package product.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import product.type.BreadType;
import product.type.OrderType;
import product.type.SauceType;
import product.type.VegetableType;

@Data 					//Using Lombok
@AllArgsConstructor		//Using Lombok
@NoArgsConstructor		//Using Lombok
public class Order {
	private BreadType breadType;
	private OrderType orderType;
	private SauceType sauceType;
	private VegetableType vegetableType;
	
}
