package driver;

import java.util.InputMismatchException;
import java.util.Scanner;

import outputProcessor.OutputProcessor;
import inputProcessor.GasPump1;
import mdaEFSM.MDAEFSM;
import dataStore.DataStore1;
import factory.GasPump1ConcreteFactory;
//Driver for GasPump1
public class GasPump1Driver {
	// Instantiate the corresponding concrete factory and data store objects
	public static GasPump1ConcreteFactory factory1=new GasPump1ConcreteFactory();
	public static DataStore1 ds1= ((DataStore1)factory1.getDataStoreObject());

	public void createGasPump1Driver(){
		// Variables to store the choice of operation on the gas pump, price per gallon of gas(a) and cash (c) if paid 
		int choice,a,c=0;
		String input=null;
		GasPump1 gasPump1=new GasPump1();
		System.out.println("*************************************");
		System.out.println("            GASPUMP-1      ");
		System.out.println("          MENU of Operations" );
		System.out.println("          1. Activate(int a)");
		System.out.println("          2. Start()");
		System.out.println("          3. PayCredit()");
		System.out.println("          4. Reject()");
		System.out.println("          5. Cancel()");
		System.out.println("          6. Approved()");
		System.out.println("          7. PayCash(int c)");
		System.out.println("          8. StartPump()");
		System.out.println("          9. PumpGallon()");
		System.out.println("         10. StopPump()");
		System.out.println("         q. Quit the Program");
		System.out.println("*************************************\n\n");
		System.out.println("Please make a note of these operations");
		System.out.println("GasPump-1 Execution\n");
		Scanner scanner=null;
		while(true){
			System.out.println("Select operation");
			System.out.println("1. Activate , 2. Start ,3. PayCredit , 4. Reject , "
					+ "5. Cancel, 6.Approved , 7. PayCash, 8. StartPump, "
					+ "9. PumpGallon , 10. StopPump , q. Quit");
			 scanner=new Scanner(System.in);
			try{
				input=scanner.nextLine();
				if(input.equalsIgnoreCase("q")){
					break;
				}
				choice=Integer.parseInt(input);
				switch(choice){
				// The first operation on the gas pump and the input is price per gallon
				case 1 : System.out.println(" Operation : Activate(int a)");
				System.out.println("Please enter the value of a");
				try{
					a=scanner.nextInt();
					// Call the input processor 
					gasPump1.activate(a);
					break;
				}
				// Error handling
				catch (InputMismatchException e) {
					System.out.println("Only integers can be entered");
					break;
				}
				case 2 : System.out.println("Operation : Start()");
				gasPump1.start();
				break;

				case 3: System.out.println("Operation : PayCredit()");
				gasPump1.payCredit();
				break;

				case 4: System.out.println("Operation : Reject()");
				gasPump1.reject();
				break;

				case 5: System.out.println(" Operation : Cancel()");
				gasPump1.cancel();
				break;

				case 6 : System.out.println("Operation : Approved()");
				gasPump1.approved();
				break;

				case 7 : System.out.println("Operation : Paycash(int c)");

				try{
					// Store cash
					c=scanner.nextInt();
					gasPump1.payCash(c);
					break;
				}
				catch (NumberFormatException e) {
					System.out.println("Only integers can be entered");
				}
				break;
				case 8 :System.out.println("Operation : StartPump()");
				gasPump1.startPump();
				break;
				case 9: System.out.println("Operation : PumpGallon()");
				gasPump1.pumpGallon();
				break;
				case 10 : System.out.println("Operation : StopPump()");
				gasPump1.stopPump();
				break;
				default : System.out.println(" Invalid choice of operation");
				break;
				}
			}catch(NumberFormatException e){
				System.out.println("Only integers need to be entered");
			}
		}
		scanner.close();
		System.out.println(" Thanks for using the Gas Pump-1");
	}
}