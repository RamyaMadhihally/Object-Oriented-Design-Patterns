package driver;



//Main class of the project
import java.util.Scanner;



/*  Driver Class has the main method, the starting point of this program */
public class Driver {
	public static void main(String[] args){

		System.out.println("CS586 PROJECT : RAMYA MADHIHALLY SREENIDHI(A20323146)");
		Scanner scanner=new Scanner(System.in);
		//Variable for the gas pump choice
		int gasPumpChosen=0;
		// Menu for choosing a gas pump
		System.out.println(" ******** Select Gas Pump *******" );
		System.out.println("          1. GasPump - 1" );
		System.out.println("          2. GasPump - 2" );
		System.out.println("          3. GasPump - 3" );
		gasPumpChosen=scanner.nextInt();
		// Instantiate Gaspump drivers based on the user's choice and call the appropriate method
		if(gasPumpChosen==1){
			GasPump1Driver gpDriver1=new GasPump1Driver();
			gpDriver1.createGasPump1Driver();
		}
		else if(gasPumpChosen==2){
			GasPump2Driver gpDriver2=new GasPump2Driver();
			gpDriver2.createGasPump2Driver();
		}
		else if(gasPumpChosen==3){
			GasPump3Driver gpDriver3=new GasPump3Driver();
			gpDriver3.createGasPump3Driver();
		}
		// Exit in case of a wrong input	
		else{
			System.out.println("Wrong choice! Has to be 1,2 or 3.Please select again");
			System.exit(0);
		}
	}
}
