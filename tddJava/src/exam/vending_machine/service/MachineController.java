package exam.vending_machine.service;

import exam.vending_machine.model.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sjshin on 2016-03-23.
 */
public class MachineController {
	MachineService machineService = new MachineService();

	public void setDrinks() {
		machineService.addDrinks();
	}

	//1:음료수 리스트보기, 2: 금액투입, 3: 음료수 선택, 4: 돈반환 /자동 돈반환
	public int choice() {
		System.out.println();
		System.out.println("===0.액션선택: 아래 번호를 선택하세요.===");
		System.out.println("1:음료수 리스트보기, 2: 금액투입, 3: 음료수 선택, 4: 돈반환 /자동 돈반환");
		Scanner input = new Scanner(System.in);
		int inputChoice = input.nextInt();

		switch (inputChoice) {
			case 1 : getDrinkList();
				break;
			case 2 : inputCoin();
				break;
			case 3 : choiceDrinks();
				break;
			case 4 : machineService.returnCoin();
				break;
		}
		return inputChoice;
	}

	//1:음료수 리스트보기
	public ArrayList<Drink> getDrinkList() {
		System.out.println("====1.음료수 리스트 =====");
		ArrayList<Drink> drinkList = machineService.getDrinks();
		for(Drink drink : drinkList) {
			System.out.print(
					"음료수" + drink.getId() + "    : " + drink.getName() + "   : " + drink.getStatus() + "     : " + drink.getCount() + "     : " + drink
							.getPrice() + "  : ");
			for (String Ingredient : drink.getIngredient()) {
				System.out.print(Ingredient);
			}
			System.out.println();
		}
		return drinkList;
	}

	public void setCoin(String inputCoin) {
		machineService.setCoin(inputCoin);
	}

	public int getCoin() {
		return machineService.getCoin();
	}



	//2: 금액투입
	public void inputCoin() {
		System.out.println("===2.금액 투입 : 투입금액/수량을 입력하세요.===");
		System.out.println("(ex. 100원/수량2일때: 1/2,  1000원/수량1일때: 10/3");
		Scanner input = new Scanner(System.in);
		String inputCoin = input.next();
		setCoin(inputCoin);
		System.out.println("투입 금액은 : " + getCoin() + " 원");
	}


	//3: choice Drink
	public void choiceDrinks() {
		getDrinkList();
		System.out.println("===3.음료선택 : 음료번호(id)를 입력하세요.===");
		System.out.println("(ex. 한개일때: 1,  여러개일때:1/2");
		Scanner input = new Scanner(System.in);
		String inputDrinks = input.next();

		//order완료후
		Order orderResult = new Order();
		orderResult = machineService.order(inputDrinks);

		System.out.println(orderResult.getDrinkName() + "주문이 완료 되었습니다.");
		System.out.println("투입금액(잔액) : " + orderResult.getOrderCoin());
	}
}
