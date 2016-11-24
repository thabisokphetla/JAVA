package starSigns;

/**
 * @author Thabiso K Phetla
 *
 */
public class Main {
	public static void main(String[] args)  {
		@SuppressWarnings("unused")
		Stars s = new Stars();
		boolean errorFlag = true;
		System.out.println("\tToday's Star Sign " +Stars.veiwSign());
		do {
			try{
				UserInteraction.userInformation();
				System.out.println("\n\t Your Star Sign \n\t"+ Stars.veiwSign());
			}catch (Exception e) {
				System.err.println(e.getMessage()+'\n');
				errorFlag = false;
			}
		}while(errorFlag == false);

	}
}