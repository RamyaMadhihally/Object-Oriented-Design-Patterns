package driver;



//Driver for GasPump2
import java.util.InputMismatchException;
import java.util.Scanner;

import inputProcessor.GasPump2;
import mdaEFSM.MDAEFSM;
import outputProcessor.OutputProcessor;
import dataStore.DataStore;
import dataStore.DataStore2;
import factory.GasPump2ConcreteFactory;

public class GasPump2Driver {
	// Instantiate the corresponding concrete factory and data store objects
	public static GasPump2ConcreteFactory factory2=new GasPump2ConcreteFactory();
	public static DataStore2 ds2= ((DataStore2)factory2.getDataStoreObject());
	// counter variable to check if activate method was called
	static int counter1=0;
	public void createGasPump2Driver(){
		// Choice of operation on the pump, cash(c) if any paid
		int choice,c=0;
		//a is the price per gallon of regular gas and b of super gas
		float a,b=0;
		String input=null;
		GasPump2 gasPump2=new GasPump2();
		System.out.println("*************************************");
		System.out.println("            GASPUMP-2      ");
		System.out.println("          MENU of Operations" );
		System.out.println("          1. Activate(float a, float b)");
		System.out.println("          2. Start()");
		System.out.println("          3. PayCredit()");
		System.out.println("          4. Reject()");
		System.out.println("          5. Cancel()");
		System.out.println("          6. Approved()");
		System.out.println("          7. Super()");
		System.out.println("          8. Regular()");
		System.out.println("          9. StartPump()");
		System.out.println("          10. PumpGallon()");
		System.out.println("         11. StopPump()");
		System.out.println("         q. Quit the Program");
		System.out.println("*************************************\n\n");
		System.out.println("Please make a note of these operations");
		System.out.println("GasPump-2 Execution\n\n");
		while(true){
			System.out.println("Select operation");
			System.out.println("****************************************************");
			System.out.println("1. Activate , 2. Start ,3. PayCredit , 4. Reject , "
					+ "5. Cancel, 6.Approved , 7. Super, 8. Regular , 9. StartPump, "
					+ "10. PumpGallon , 11. StopPump , q. Quit");
			System.out.println("****************************************************");
			Scanner scanner=new Scanner(System.in);
			try{
				input=scanner.nextLine();
				if(input.equalsIgnoreCase("q")){
					break;
				}
				choice=Integer.parseInt(input);
				switch(choice){
				case 1 : System.out.println(" Operation : Activate(float a, float b)");
				if(counter1<1){
					System.out.println("Please enter the value of a");
					try{
						counter1+=1;
						a=scanner.nextFloat();

						System.out.println("Please enter the value of b");
						b=scanner.nextFloat();

						gasPump2.activate(a,b);
						break;
					}
					catch (InputMismatchException e) {
						System.out.println("Float values have to be entered for a and b");
						break;
					}
				}else{
					System.out.println("Invalid operation on this state");
					break;
				}
				case 2 : System.out.println("Operation : Start()");
				gasPump2.start();
				break;

				case 3: System.out.println("Operation : PayCredit()");
				gasPump2.payCredit();
				break;

				case 4: System.out.println("Operation : Reject()");
				gasPump2.reject();
				break;

				case 5: System.out.println(" Operation : Cancel()");
				gasPump2.cancel();
				break;

				case 6 : System.out.println("Operation : Approved()");
				gasPump2.approved();
				break;

				case 7 : System.out.println("Operation : Super()");
				gasPump2.Super();
				break;

				case 8: System.out.println("Operation : Regular()");
				gasPump2.regular();
				break;

				case 9 :System.out.println("Operation : StartPump()");
				gasPump2.startPump();
				break;
				case 10: System.out.println("Operation : PumpGallon()");
				gasPump2.pumpGallon();
				break;
				case 11 : System.out.println("Operation : StopPump()");
				gasPump2.stopPump();
				break;
				default : System.out.println(" Invalid choice of operation");
				break;
				}
				//scanner.close();
			}catch(Exception e){
				System.out.println("Exception occured " + e.getMessage());
			}
		}System.out.println("Thanks for using GasPump2");
	}

}
