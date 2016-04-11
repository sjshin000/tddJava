package exam.vending_machine.service;

/**
 * Created by sjshin on 2016-03-17.
 */
public class MachineClient {
	public static void main(String ag[]) {
		MachineController machineController = new MachineController();
		machineController.setDrinks();

		while(true) {
			int choice = machineController.choice();
			if(choice == 4){
				break;
			}
		}
	}
}
