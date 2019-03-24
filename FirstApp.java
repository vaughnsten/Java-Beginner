package HelloSwing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				new MainFrame();
				
				
			}
		});

	}

}
