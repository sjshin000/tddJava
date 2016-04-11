package exam.vending_machine.model;

/**
 * Created by sjshin on 2016-03-17.
 */
public class Orangejuice extends Drink {
	//메뉴명:가격:주성분:선택가능여부N
	private final int id = 2;
	private final String name = "Orangejuice";
	private final int price = 300;
	private final String[] ingredient = { "water:70%", "suger:20%" };
	private String status = "N";
	private int count = 2;

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
