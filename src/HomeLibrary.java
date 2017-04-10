import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.Timer;
import java.awt.Button;
import java.awt.List;
import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class HomeLibrary {

	private JFrame frmLibraryManagingSystem;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField textField_firstName;
	private JTextField textField_lastName;
	private JTextField textField_Address;
	private JTextField textField_Email;
	private JTextField textField_Username;
	private JTextField textField_Password;
	private JTextField textField_Phone1;
	private JTextField textField_Phone2;
	private JTextField textField_Phone3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeLibrary window = new HomeLibrary();
					window.frmLibraryManagingSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeLibrary() {
		initialize();
	}

	/**
	 * Initialize the contents of the home library frame.
	 */
	private void initialize() {
		frmLibraryManagingSystem = new JFrame();
		frmLibraryManagingSystem.setResizable(false);
		frmLibraryManagingSystem.setTitle("Library Managing System");
		frmLibraryManagingSystem.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmLibraryManagingSystem.setBounds(100, 100, 700, 450);
		frmLibraryManagingSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibraryManagingSystem.getContentPane().setLayout(null);
	    
	    JPanel registerPanel = new JPanel();
	    registerPanel.setBounds(0, 0, 694, 421);
	    frmLibraryManagingSystem.getContentPane().add(registerPanel);
	    registerPanel.setLayout(null);
	    registerPanel.setVisible(false);
	    
	    JPanel MainPage = new JPanel();
	    MainPage.setBounds(0, 0, 694, 421);
	    frmLibraryManagingSystem.getContentPane().add(MainPage);
	    MainPage.setLayout(null);
	    MainPage.setVisible(true);
	    
	    JPanel portalPanel = new JPanel();
		portalPanel.setBounds(0, 0, 694, 421);
		frmLibraryManagingSystem.getContentPane().add(portalPanel);
		portalPanel.setLayout(null);
		portalPanel.setVisible(false);
		
		JPanel LoginPanel = new JPanel();
		LoginPanel.setBounds(0, 0, 694, 421);
		frmLibraryManagingSystem.getContentPane().add(LoginPanel);
		LoginPanel.setLayout(null);
		LoginPanel.setVisible(false);
	    
	    JLabel label_6 = new JLabel("CYPRESS");
	    label_6.setBounds(24, 11, 121, 29);
	    label_6.setHorizontalAlignment(SwingConstants.CENTER);
	    label_6.setFont(new Font("Arial", Font.BOLD, 25));
	    registerPanel.add(label_6);
	    
	    JLabel label_7 = new JLabel("City of Toronto");
	    label_7.setBounds(501, 11, 176, 29);
	    label_7.setHorizontalAlignment(SwingConstants.CENTER);
	    label_7.setFont(new Font("Arial", Font.BOLD, 25));
	    registerPanel.add(label_7);
	    
	    JLabel label_8 = new JLabel("______________________________________________________________________________________________________________");
	    label_8.setBounds(17, 39, 660, 14);
	    label_8.setHorizontalAlignment(SwingConstants.CENTER);
	    registerPanel.add(label_8);
	    
	    JLabel lblNewLabel_1 = new JLabel("Please enter information below:");
	    lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
	    lblNewLabel_1.setBounds(24, 64, 238, 28);
	    registerPanel.add(lblNewLabel_1);
	    
	    JLabel lblFirstName = new JLabel("First Name:");
	    lblFirstName.setBounds(59, 100, 71, 14);
	    registerPanel.add(lblFirstName);
	    
	    JLabel lblLastName = new JLabel("Last Name:");
	    lblLastName.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblLastName.setBounds(44, 125, 71, 14);
	    registerPanel.add(lblLastName);
	    
	    JLabel lblAdress = new JLabel("Address:");
	    lblAdress.setBounds(64, 150, 51, 14);
	    registerPanel.add(lblAdress);
	    
	    JLabel lblPhoneNumber = new JLabel("Phone Number:");
	    lblPhoneNumber.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblPhoneNumber.setBounds(10, 175, 106, 14);
	    registerPanel.add(lblPhoneNumber);
	    
	    JLabel lblEmailAdress = new JLabel("Email Adress:");
	    lblEmailAdress.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblEmailAdress.setBounds(24, 200, 91, 14);
	    registerPanel.add(lblEmailAdress);
	    
	    JLabel lblUsername = new JLabel("Username:");
	    lblUsername.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblUsername.setBounds(24, 225, 91, 14);
	    registerPanel.add(lblUsername);
	    
	    JLabel lblPassword = new JLabel("Password:");
	    lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblPassword.setBounds(24, 256, 91, 14);
	    registerPanel.add(lblPassword);
	    
	    textField_firstName = new JTextField();
	    textField_firstName.setBounds(136, 100, 200, 20);
	    registerPanel.add(textField_firstName);
	    textField_firstName.setColumns(10);
	    
	    textField_lastName = new JTextField();
	    textField_lastName.setColumns(10);
	    textField_lastName.setBounds(136, 125, 200, 20);
	    registerPanel.add(textField_lastName);
	    
	    textField_Address = new JTextField();
	    textField_Address.setColumns(10);
	    textField_Address.setBounds(136, 150, 541, 20);
	    registerPanel.add(textField_Address);
	    
	    textField_Email = new JTextField();
	    textField_Email.setColumns(10);
	    textField_Email.setBounds(136, 200, 200, 20);
	    registerPanel.add(textField_Email);
	    
	    textField_Username = new JTextField();
	    textField_Username.setColumns(10);
	    textField_Username.setBounds(136, 225, 200, 20);
	    registerPanel.add(textField_Username);
	    
	    textField_Password = new JTextField();
	    textField_Password.setColumns(10);
	    textField_Password.setBounds(136, 253, 200, 20);
	    registerPanel.add(textField_Password);
	    
	    textField_Phone1 = new JTextField();
	    textField_Phone1.setColumns(10);
	    textField_Phone1.setBounds(136, 175, 51, 20);
	    registerPanel.add(textField_Phone1);
	    
	    textField_Phone2 = new JTextField();
	    textField_Phone2.setColumns(10);
	    textField_Phone2.setBounds(219, 175, 51, 20);
	    registerPanel.add(textField_Phone2);
	    
	    textField_Phone3 = new JTextField();
	    textField_Phone3.setColumns(10);
	    textField_Phone3.setBounds(304, 175, 51, 20);
	    registerPanel.add(textField_Phone3);
	    
	    JLabel dash = new JLabel("--");
	    dash.setBounds(197, 178, 23, 14);
	    registerPanel.add(dash);
	    
	    JLabel label_9 = new JLabel("--");
	    label_9.setBounds(280, 178, 14, 14);
	    registerPanel.add(label_9);
	    
	    JButton btnRegister = new JButton("Register");
	    btnRegister.setBounds(121, 315, 89, 23);
	    registerPanel.add(btnRegister);
	    
	    JButton btnCancel_1 = new JButton("Cancel");
	    btnCancel_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		portalPanel.setVisible(true);
	    		registerPanel.setVisible(false);
	    		
	    	}
	    });
	    btnCancel_1.setBounds(286, 315, 89, 23);
	    registerPanel.add(btnCancel_1);
	    
	    JButton btnFaq_1 = new JButton("FAQ");
	    btnFaq_1.setBounds(620, 387, 64, 23);
	    registerPanel.add(btnFaq_1);
		

	    
	    
	    																JLabel Cypress = new JLabel("CYPRESS");
	    																Cypress.setBounds(267, 39, 171, 43);
	    																Cypress.setHorizontalAlignment(SwingConstants.CENTER);
	    																Cypress.setFont(new Font("Arial", Font.BOLD, 36));
	    																MainPage.add(Cypress);
	    																
	    																JLabel lblNewLabel = new JLabel("");
	    																lblNewLabel.setBackground(Color.BLACK);
	    																Image img = new ImageIcon(this.getClass().getResource("/image.png")).getImage();
	    																lblNewLabel.setIcon(new ImageIcon(img));
	    																lblNewLabel.setBounds(109, 93, 520, 171);
	    																MainPage.add(lblNewLabel);
	    																
	    																JLabel CityOfToronto = new JLabel("City Of Toronto");
	    																CityOfToronto.setHorizontalAlignment(SwingConstants.CENTER);
	    																CityOfToronto.setFont(new Font("Arial", Font.BOLD, 19));
	    																CityOfToronto.setBounds(219, 275, 293, 43);
	    																MainPage.add(CityOfToronto);
	    																
	    																JButton btnEnglish = new JButton("English");
	    																btnEnglish.addActionListener(new ActionListener() {
	    																	public void actionPerformed(ActionEvent arg0) {
	    																		LoginPanel.setVisible(false);
	    																		MainPage.setVisible(false);
	    																		portalPanel.setVisible(true);
	    																	}
	    																});
	    																btnEnglish.setBounds(171, 329, 89, 23);
	    																MainPage.add(btnEnglish);
	    																
	    																JButton btnFrench = new JButton("French");
	    																btnFrench.setBounds(466, 329, 89, 23);
	    																MainPage.add(btnFrench);
		
		
		
		JLabel label = new JLabel("CYPRESS");
		label.setBounds(20, 11, 130, 29);
		portalPanel.add(label);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 25));
		
		JLabel label_3 = new JLabel("City of Toronto");
		label_3.setBounds(483, 11, 201, 29);
		portalPanel.add(label_3);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Arial", Font.BOLD, 25));
		
		JLabel label_4 = new JLabel("______________________________________________________________________________________________________________");
		label_4.setBounds(10, 39, 674, 14);
		portalPanel.add(label_4);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblQuick = new JLabel("Quick Links>>");
		lblQuick.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuick.setFont(new Font("Arial", Font.BOLD, 20));
		lblQuick.setBounds(10, 69, 170, 29);
		portalPanel.add(lblQuick);
		
		JRadioButton rdbtnRegister = new JRadioButton("Register");
		JRadioButton rdbtnReport = new JRadioButton("Report a Problem");
		JRadioButton rdbtnLogin = new JRadioButton("Login");
		JRadioButton rdbtnSuggest = new JRadioButton("Suggest");
		JRadioButton rdbtnVote = new JRadioButton("Vote");
		JRadioButton rdbtnFaq = new JRadioButton("FAQ");
		JRadioButton rdbtnContact = new JRadioButton("Contact");
		
		ButtonGroup myButtonGroup = new ButtonGroup();
		 myButtonGroup.add(rdbtnRegister);
		 myButtonGroup.add( rdbtnReport);
		 myButtonGroup.add(rdbtnLogin);
		 myButtonGroup.add(rdbtnSuggest);
		 myButtonGroup.add(rdbtnVote);
		 myButtonGroup.add(rdbtnFaq);
		 myButtonGroup.add(rdbtnContact);
		 
		 
		rdbtnRegister.setBounds(26, 121, 109, 23);
		portalPanel.add(rdbtnRegister);
		
		
		rdbtnLogin.setBounds(26, 150, 109, 23);
		portalPanel.add(rdbtnLogin);
		
		
		rdbtnReport.setBounds(26, 176, 124, 23);
		portalPanel.add(rdbtnReport);
		
	
		rdbtnSuggest.setBounds(26, 201, 109, 23);
		portalPanel.add(rdbtnSuggest);
		
		
		rdbtnVote.setBounds(26, 227, 109, 23);
		portalPanel.add(rdbtnVote);
		
		
		rdbtnFaq.setBounds(26, 253, 109, 23);
		portalPanel.add(rdbtnFaq);
		
		
		rdbtnContact.setBounds(26, 279, 109, 23);
		portalPanel.add(rdbtnContact);
		
		JButton btnO = new JButton("GO");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnReport.isSelected()) {
					
				}
				else if (rdbtnLogin.isSelected()) {
					LoginPanel.setVisible(true);
					portalPanel.setVisible(false);
				}
				else if (rdbtnSuggest.isSelected()) {
					
				}
				else if (rdbtnRegister.isSelected()) {
					registerPanel.setVisible(true);		
					portalPanel.setVisible(false);
				}
				else if (rdbtnSuggest.isSelected()) {
					registerPanel.setVisible(true);		
					portalPanel.setVisible(false);
				}
				else if (rdbtnVote.isSelected()) {
					registerPanel.setVisible(true);		
					portalPanel.setVisible(false);
				}
				else if (rdbtnFaq.isSelected()) {
					registerPanel.setVisible(true);		
					portalPanel.setVisible(false);
				}
				
				
				
			}
		});
		btnO.setBounds(135, 302, 69, 23);
		portalPanel.add(btnO);
		
		JButton button = new JButton("FAQ");
		button.setBounds(575, 381, 109, 29);
		portalPanel.add(button);
		
		JLabel lblKeep = new JLabel("Keeping Our City Streets Clean and Safe...");
		lblKeep.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeep.setFont(new Font("Arial", Font.BOLD, 14));
		lblKeep.setBounds(296, 313, 317, 29);
		portalPanel.add(lblKeep);
		
		JLabel label_5 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/image2.jpg")).getImage();
		label_5.setIcon(new ImageIcon(img2));
		
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(250, 105, 330, 171);
		portalPanel.add(label_5);
		
		
		
		
				
		

					
//LOGIN PANEL
				
				
				JLabel label_1 = new JLabel("Username:");
				label_1.setHorizontalAlignment(SwingConstants.LEFT);
				
					label_1.setBounds(151, 157, 84, 14);
					LoginPanel.add(label_1);
					
					JLabel label_2 = new JLabel("Password:");
					label_2.setBounds(151, 188, 84, 14);
					LoginPanel.add(label_2);
					
					passwordField = new JPasswordField();
					passwordField.setBounds(260, 185, 109, 20);
					LoginPanel.add(passwordField);
					
					textField = new JTextField();
					textField.setBounds(260, 154, 109, 20);
					textField.setColumns(10);
					LoginPanel.add(textField);
					
					JLabel CYPRESS = new JLabel("CYPRESS");
					CYPRESS.setHorizontalAlignment(SwingConstants.CENTER);
					CYPRESS.setBounds(22, 11, 130, 29);
					LoginPanel.add(CYPRESS);
					CYPRESS.setFont(new Font("Arial", Font.BOLD, 25));
					
					//LOGIN INFORMATION FOR ADMIN STORED HERE
										JButton EnterLogin = new JButton("Login");
										EnterLogin.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
											String key = "admin";
											String key2 = "password";
											String username = textField.getText();
											String pass = passwordField.getText(); //hidden for security reasons
										
											if (username.contains(key) && pass.contains(key2) ) {
												//AdminPanel.setVisible(true);
												LoginPanel.setVisible(false);
											}
											else {
												//shittiest way to print out a error message LOL
												//errormessage.setText("Please Enter the correct login information");
												ActionListener taskPerformer = new ActionListener() {
												       public void actionPerformed(ActionEvent evt) {
												    //	   errormessage.setText("");
												       }
												   };
												 new Timer(2000, taskPerformer).start();
												//errormessage.setText("Please Enter the correct login information");
												
												
												}
											}
										});
										
										JLabel lblCity = new JLabel("City of Toronto");
										lblCity.setHorizontalAlignment(SwingConstants.CENTER);
										lblCity.setFont(new Font("Arial", Font.BOLD, 25));
										lblCity.setBounds(483, 11, 201, 29);
										LoginPanel.add(lblCity);
										
										JLabel lblNewLabel_2 = new JLabel("______________________________________________________________________________________________________________");
										lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
										lblNewLabel_2.setBounds(10, 37, 674, 14);
										LoginPanel.add(lblNewLabel_2);
										EnterLogin.setBounds(259, 244, 91, 20);
										LoginPanel.add(EnterLogin);
										
										JTextPane txtpnYouAreCurrently = new JTextPane();
										txtpnYouAreCurrently.setFont(new Font("Tahoma", Font.BOLD, 15));
										txtpnYouAreCurrently.setBackground(SystemColor.control);
										txtpnYouAreCurrently.setText("You are currently at the Cypress Login Page. By logging into this system, you will be able to report a variety of problems as you have witnessed on the streets of Toronto.");
										txtpnYouAreCurrently.setBounds(22, 62, 662, 73);
										LoginPanel.add(txtpnYouAreCurrently);
										
										JButton btnCancel = new JButton("Cancel");
										btnCancel.setBounds(379, 244, 91, 20);
										LoginPanel.add(btnCancel);
										
										JLabel lblNewLabel_3 = new JLabel("@cypress.on.ca");
										lblNewLabel_3.setBounds(379, 157, 102, 14);
										LoginPanel.add(lblNewLabel_3);
										
										JButton btnFaq = new JButton("FAQ");
										btnFaq.setBounds(575, 381, 109, 29);
										LoginPanel.add(btnFaq);
	   
																		//Image img2 = new ImageIcon(this.getClass().getResource("/image.png")).getImage();
										
										
										
									
								
																	
																	
	}
}

