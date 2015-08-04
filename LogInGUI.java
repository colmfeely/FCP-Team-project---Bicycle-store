import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class LogInGUI {
	
	private Database database;

	private JFrame frame;
	private JPanel logInPanel;
	private JLabel lblStaffId, lblPassword;
	private JTextField txtStaffId, txtPassword;
	private JButton btnSubmit;
	
	public LogInGUI() {
		database = new Database();
		createEmployeeAccounts();
		initComponents();
		createLogInPanel();
		addSubmitButtonHandler();
		frame.setVisible(true);
	}
	
	private void initComponents() {
		frame = new JFrame("Bicycle Store System");
		frame.setSize(400, 400);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // set full screen
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		lblStaffId = new JLabel("Staff ID: ");
		lblPassword = new JLabel("Password: ");
		txtStaffId = new JTextField(10);
		txtPassword = new JTextField(10);
		btnSubmit = new JButton("Submit");
		
		JPanel mainPanel = new JPanel();
		logInPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		frame.add(mainPanel, BorderLayout.CENTER);
		mainPanel.add(logInPanel);
		mainPanel.add(btnSubmit);
	}
	
	private void createLogInPanel() {
		TitledBorder titleBorder = BorderFactory.createTitledBorder("Enter Log in details");
		titleBorder.setTitleJustification(TitledBorder.CENTER);
		
		logInPanel.setMaximumSize(new Dimension(250, 100));
		logInPanel.setBorder(titleBorder);
		GridLayout layout = new GridLayout(2,2);
		layout.setHgap(10);
		layout.setVgap(10);
		logInPanel.setLayout(layout);
		
		logInPanel.add(lblStaffId);
		logInPanel.add(txtStaffId);
		logInPanel.add(lblPassword);
		logInPanel.add(txtPassword);
	}
	
	private void addSubmitButtonHandler() {
		btnSubmit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String idStr = txtStaffId.getText();
				String passStr = txtPassword.getText();
				if(idStr.length() == 0 || passStr.length() == 0) {
					// no staff id or password entered, display error dialogue
					JOptionPane.showMessageDialog(null, "You must enter a staff id and password" , 
							"Incomplete content", JOptionPane.ERROR_MESSAGE);
				}
				else {
					// attempt to parse staff id from string
					try{
						int staffId = Integer.parseInt(idStr);
						// check if valid staff id and password
						if(database.isValidEmployee(staffId, passStr)) {
							// user logged in
							Employee employee = database.getEmployee(staffId);
							GUIDriver mainPage = new GUIDriver(employee);
							mainPage.setVisible(true);
							frame.dispose();
						}
						else {
							JOptionPane.showMessageDialog(null, "Staff id or password incorrect", 
									"Log in failed", JOptionPane.ERROR_MESSAGE);
						}
							
					}
					catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Staff id should only contain numeric characters" , 
								"Incorrect Format", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			}
			
		});
	}
	
	// hard code some employee accounts into database
	private void createEmployeeAccounts() {
		database.addEmployee(new Employee(10001, "Fred Flintstone", "0861234567", "password"));
		database.addEmployee(new Employee(10002, "Homer Simpson", "0869876543", "password"));
		database.addEmployee(new Employee(10003, "Peter Griffin", "0875678987", "password"));
		database.addEmployee(new Employee(10004, "barack obama", "0851239876", "password"));
		database.addEmployee(new Employee(10005, "Bill Gates", "0835432198", "password"));
	}
	
	public static void main(String[] args) {
		new LogInGUI();
	}

}
