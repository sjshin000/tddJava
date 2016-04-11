package exam.vending_machine.service;

import exam.vending_machine.model.*;

import java.util.ArrayList;

/**
 * Created by sjshin on 2016-03-17.
 */
public class MachineService {
	ArrayList<Drink> drinks = new ArrayList<Drink>();
	private int coin = 0;

	int minPrice = 0;

	//0.기록되어있는 음료수들의 객체를생성한다.
	public void addDrinks() {
		System.out.println("====addDrinks");

		Drink coke = new Coke();
		drinks.add(coke);
		Drink orangejuice = new Orangejuice();
		drinks.add(orangejuice);
		Drink coffee = new Coffee();
		drinks.add(coffee);
		System.out.println("사이즈: " + drinks.size());
	}

	//1. 음료수 리스트들을 리턴
	public ArrayList<Drink> getDrinks() {
		if(coin > 0) {
			for(Drink drink : drinks) {
				drink.getPrice();
				if(drink.getStatus().equals("N")  && coin >= drink.getPrice()) {
					drink.setStatus("Y");
				}
			}
		}
		return drinks;
	}

	//2. client에서 입력받은 투입금액/수량을 잘라서 int형으로 변환
	public void setCoin(String inputCoin) {
		String stringCoin = inputCoin.split("/")[0];
		String coinCount = inputCoin.split("/")[1];
		int coin = (int)Integer.parseInt(stringCoin);
		int coinCnt = (int)Integer.parseInt(coinCount);
		this.coin = coin * coinCnt * 100 + this.coin;
	}




	//음료수 아이디를 입력받고 주문처리
	public Order order(String inputDrinks) {
		String[] drinkId = inputDrinks.split("/");
		Order order = new Order();

		//입력받은 음료수 아이디 리스트를 꺼내온다
//		for(int index = 0; index < drinkId.length  ; index++) {
//			int id = (int)Integer.parseInt(drinkId[index]);
//			idList = new int[] { id };
//			for(Drink drink : drinks) {
//				if(id == drink.getId() ) {
//					//아이디가 같고, 음료의 status가 Y일때
//					orderCheck(drink);
//				}
//			}
//		}
		for(String idString: drinkId) {
			int id = Integer.parseInt(idString);
			for(Drink drink : drinks) {
				if(id == drink.getId() ) {
					//아이디가 같고, 음료의 status가 Y일때
					orderCheck(drink, order);
				}
			}
		}
		//남은 coin이 drinks 의 최소금액보다 작으면 coin 반환 / 아니면 선택 메뉴
		if(coin < getMinPrice()) {
			returnCoin();
		}
		return order;
	}

	public Order orderCheck(Drink drink, Order order) {
		if( drink.getStatus().equals("Y")) {
			this.coin = coin - drink.getPrice();
			//수량 차감 처리
			deduct(drink);
			order.setId(drink.getId());
			order.setDrinkName(drink.getName());
			order.setOrderCoin(coin);
		} else {
			System.out.println("잘못된 음료수 선택입니다.");
		}
		return order;
	}

	public int deduct(Drink drink) {
		drink.setCount(drink.getCount() - 1);
		System.out.println("======: " + drink.getCount());
		isSoldOut(drink);
		return drink.getCount();
	}

	public String isSoldOut(Drink drink) {
		if(drink.getCount() <= 0) {
			drink.getStatus();
			drink.setStatus("SoldOut");
		}
		return drink.getStatus();
	}

	public int getCoin() {
		return coin;
	}

	public void returnCoin() {
		System.out.println(coin + " 원 을 반환합니다");
		coin = 0;
	}


	public int getMinPrice() {
		//drinks 최소금액 가져오기
		for(int index = 0; index < drinks.size() -1; index++) {
			Drink drink = drinks.get(index);
			Drink drink2 = drinks.get(index +1);

			if(drink.getPrice() < drink2.getPrice()) {
				minPrice = drink.getPrice();
			} else {
				minPrice = drink2.getPrice();
			}
		}
		return minPrice;
	}

}
