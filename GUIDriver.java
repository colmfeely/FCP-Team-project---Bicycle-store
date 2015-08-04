import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIDriver extends JFrame{
	
	private Employee employee;
	
	public GUIDriver(Employee employee) {
		this.employee = employee;
		setTempContent();
	}
	
	private void setTempContent() {
		setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // set full screen
        setLayout(null);
        //Create a panel 
        JPanel panel = new JPanel();
        panel.setBackground(new Color(150,35,90));
        panel.setOpaque(true);
        
        JLabel label = new JLabel("You have been successfully logged in "+employee.getName());
        label.setFont(new Font("Arial",Font.BOLD, 36));
        panel.add(label);
         
        //Make it the content pane.
        setContentPane(panel);
        setVisible(true);
	}
}
