package exam.vending_machine.model;

/**
 * Created by sjshin on 2016-03-16.
 */
public abstract class Drink {
	//메뉴명:가격:주성분:선택가능여부N
	public String name = null;
	public int price = 0;
	public String[] ingredient = {};
	public String status = "N";
	public int count = 0;

	public abstract int getId();
	public abstract String getName();
	public abstract int getPrice();
	public abstract String[] getIngredient();
	public abstract String getStatus();
	public abstract void setStatus(String status);
	public abstract int getCount();
	public abstract void setCount(int count);

}
