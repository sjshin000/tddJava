package exam.vending_machine.model;

/**
 * Created by sjshin on 2016-03-17.
 */
public class Coffee extends Drink {
	//메뉴명:가격:주성분:선택가능여부N, 잔여수량?
	private final int id = 3;
	private final String name = "Coffee";
	private final int price = 400;
	private final String[] ingredient = { "water:70%", "suger:20%" };
	private String status = "N";
	private int count = 3;


	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String[] getIngredient() {
		return  ingredient;
	}

	@Override
	public String getStatus() {
		return status;
	}
	@Override
	public int getCount() {
		return count;
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public  void setCount(int count) {
		this.count = count;
	}
}
