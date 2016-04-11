package exam.vending_machine.service;

import exam.vending_machine.model.Coffee;
import exam.vending_machine.model.Coke;
import exam.vending_machine.model.Drink;
import exam.vending_machine.model.Orangejuice;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by sjshin on 2016-03-17.
 */
public class MachineServiceTest {
	MachineService machineService = new MachineService();
	MachineController machineController = new MachineController();



	@Test
	public void test_01_음료수리스트가3개인지_확인() {
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		Drink coke = new Coke();
		drinks.add(coke);
		Drink orangejuice = new Orangejuice();
		drinks.add(orangejuice);
		Drink coffee = new Coffee();
		drinks.add(coffee);
		assertEquals(3, drinks.size());
	}

	@Test
	public void test_02_coke_객체의최초데이터_확인() {
		Drink coke = new Coke();
		assertEquals(1, coke.getId());
		assertEquals("Coke", coke.getName());
		assertEquals(500, coke.getPrice());
		assertEquals("N", coke.getStatus());
		assertEquals(2, coke.getCount());
	}

	@Test
	public void test_03_투입금액_set_get() {
		machineService.setCoin("1/2");
		machineService.getCoin();
		assertEquals(200, machineService.getCoin());

		machineService.setCoin("5/3");
		machineService.getCoin();
		assertEquals(1700, machineService.getCoin());

	}

	@Test
	public void test_04_최소금액가져오기() {
//		machineController.addDrinks();
		//execution.getMinPrice();
		System.out.println("result : " + machineService.getMinPrice());
	}

	@Test
	public void test_05_음료수수량차감() {
		ArrayList<Drink> drinks = new ArrayList<Drink>();
//		machineController.addDrinks();
		for(Drink drink :  drinks) {
			machineService.deduct(drink);
			machineService.isSoldOut(drink);
			System.out.println(machineService.deduct(drink));
			System.out.println(machineService.isSoldOut(drink));
		}
	}
	
	@Test
	public void test_05_음료수가져오기() {
//		machineController.addDrinks();
		machineService.getDrinks();
		assertEquals(3, machineService.getDrinks());
		System.out.println(machineService.getDrinks());
	}
}
