package exam.vending_machine.service;

import exam.vending_machine.model.Drink;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by sjshin on 2016-03-23.
 */
public class MachineControllerTest {
	@Test
	public void test_01_음료수_add() {
		MachineController machineController = new MachineController();
		machineController.setDrinks();
		ArrayList<Drink> drinks = new ArrayList<Drink>();
		System.out.println("tt");

		machineController.getDrinkList();
	}
}
