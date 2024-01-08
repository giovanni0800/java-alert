package java_alert;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Main {
	
	private static int messageTurn = 0;

	public static void main(String[] args) {
		DefineAlertMinutes.setSUBJECT();
		DefineAlertMinutes.setMINUTES();

		//Make a Timer to save the charles proxys files
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				
				try {
					int option = 1;
					
					if (messageTurn == 0) {
						JOptionPane.showMessageDialog(null, "Let's Start the App!");
						messageTurn = 1;
					
					} else {
						//Executing the task according to the time set in MINUTES
						option = JOptionPane.showConfirmDialog(null, "HEY! Your time is over! "+ (DefineAlertMinutes.getMINUTES() / 60000) + " minuts have passed!!"
								+ "\n\n--> Subject: " + DefineAlertMinutes.getSUBJECT()
								+ "\n\nWould you like to finish the application?\n\n");
					}
					
					if ( option == 0 || option == 2 ) {
						timer.cancel();
					}
					
				} catch (Exception e) {
					System.out.println("Error...\n\n");
					e.printStackTrace();
				}
				
			}
			
		};
		
		timer.scheduleAtFixedRate(task, 0, DefineAlertMinutes.getMINUTES() );
		
	}

}