package exam.vending_machine.model;

/**
 * Created by sjshin on 2016-03-23.
 */
public class Order {
	// 잔액, 음료이름, 아이디,
	private int orderCoin;
	private int id;
	private String drinkName;

	public int getOrderCoin() {
		return orderCoin;
	}

	public void setOrderCoin(int orderCoin) {
		this.orderCoin = orderCoin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}
}
