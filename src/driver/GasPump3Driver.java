package driver;

import java.util.InputMismatchException;
import java.util.Scanner;




import inputProcessor.GasPump3;
import dataStore.DataStore3;
import factory.GasPump3ConcreteFactory;
//driver for gaspump3
public class GasPump3Driver {
	// Instantiate the corresponding concrete factory and data store objects
	public static GasPump3ConcreteFactory factory3=new GasPump3ConcreteFactory();
	public static DataStore3 ds3= ((DataStore3)factory3.getDataStoreObject());
	// counter variable to check if activate method was called
	static int counter2=0;
	public void createGasPump3Driver(){
		// Choice of operation on the pump
		int choice=0;
		//cash if any paid
		float c=0;
		//a is the price per gallon of regular gas and b of premium gas
		float a,b=0;
		String input=null;
		GasPump3 gasPump3=new GasPump3();
		System.out.println("*************************************");
		System.out.println("            GASPUMP-3      ");
		System.out.println("          MENU of Operations" );
		System.out.println("          1. Activate(float a, float b)");
		System.out.println("          2. Start()");
		System.out.println("          3. PayCash(float c)");
		System.out.println("          4. Cancel()");
		System.out.println("          5. Premium()");
		System.out.println("          6. Regular()");
		System.out.println("          7. StartPump()");
		System.out.println("          8. PumpLiter()");
		System.out.println("         9. StopPump()");
		System.out.println("         10. Receipt()");
		System.out.println("         11. NoReceipt()");
		System.out.println("         q. Quit the Program");
		System.out.println("*************************************\n\n");
		System.out.println("Please make a note of these operations");
		System.out.println("GasPump-3 Execution\n\n");
		while(true){
			System.out.println("Select operation");
			System.out.println("****************************************************");
			System.out.println("1. Activate , 2. Start , 3. PayCash , 4.Cancel"
					+ "5. Premium, 6.Regular , 7. StartPump, 8. PumpLiter , 9. StopPump, "
					+ "10. Receipt , 11.NoReceipt , q. Quit");
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
				if(counter2<1){	
					System.out.println("Please enter the value of a");
					try{
						counter2+=1;
						a=Float.parseFloat(scanner.nextLine());
						//System.out.println("a in input"+a);
						System.out.println("Please enter the value of b");
						b=Float.parseFloat(scanner.nextLine());
						gasPump3.activate(a,b);
						break;
					}
					catch (InputMismatchException e) {
						System.out.println("Float values have to be entered for a and b");
						break;
					}
				}
				else{
					System.out.println("Invalid Operation on this state");
					break;
				}
				case 2 : System.out.println("Operation : Start()");
				gasPump3.start();
				break;

				case 3: System.out.println("Operation : PayCash()");
				System.out.println("Please enter the value of cash");
				try{
					c=scanner.nextFloat();
					gasPump3.payCash(c);
					break;
				}
				catch (NumberFormatException e) {
					System.out.println("Only integers can be entered");
				}
				break;

				case 4: System.out.println(" Operation : Cancel()");
				gasPump3.cancel();
				break;

				case 5 : System.out.println("Operation : Premium()");
				gasPump3.premium();
				break;

				case 6: System.out.println("Operation : Regular()");
				gasPump3.regular();
				break;

				case 7 :System.out.println("Operation : StartPump()");
				gasPump3.startPump();
				break;
				case 8: System.out.println("Operation : PumpLiter()");
				gasPump3.pumpLiter();
				break;
				case 9 : System.out.println("Operation : StopPump()");
				gasPump3.stopPump();
				break;
				case 10 : System.out.println("Operation : Receipt()");
				gasPump3.receipt();
				break;
				case 11 : System.out.println("Operation : NoReceipt()");
				gasPump3.noReceipt();
				break;
				default : System.out.println(" Invalid choice of operation");
				break;
				}
			}catch(Exception e){
				System.out.println("Exception occured " + e.getMessage());
			}
		}
		System.out.println("Thanks for using GasPump3");
	}
}
