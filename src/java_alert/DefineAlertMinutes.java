package java_alert;

import javax.swing.JOptionPane;

public class DefineAlertMinutes {
	
	private static int MINUTES;
	private static String SUBJECT;
	
	public static long getMINUTES() {
		return MINUTES;
	}

	public static void setMINUTES(){
		try{
			
			do {
				MINUTES = (  Integer.valueOf ( JOptionPane.showInputDialog("In How Many Minutes "
					+ "would you like to recevie the alert? \n\n") ) * 60000 );
		}while ( MINUTES <= 0 );
	
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Unfortunately we had a problem\n"
					+ "We got a value not expected from your response...\n\n");
		}
		
	}
	
	public static String getSUBJECT() {
		return SUBJECT;
	}
	
	public static void setSUBJECT() {
		SUBJECT = JOptionPane.showInputDialog("What is the Subject?");
	}

}
