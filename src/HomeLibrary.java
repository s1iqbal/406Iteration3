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
import java.awt.Window;

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

public class HomeLibrary extends Database {

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
	private JTextField textField_1;
	 final JLabel label_11 = new JLabel("City of Toronto");
	 final JLabel label_7 = new JLabel("City of Toronto");
	 final JLabel label_7CI = new JLabel("City of Toronto");
	 final JLabel label_3 = new JLabel("City of Toronto");
	 final JLabel lblCity = new JLabel("City of Toronto");
	 public static final Profile profile = new Profile("","","","          ","","","");
	 public Profile currentlyLoggedInUser = profile;
	 

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
	    
	    final JPanel reportPanel = new JPanel();
	    reportPanel.setBounds(0, 0, 694, 421);
	    frmLibraryManagingSystem.getContentPane().add(reportPanel);
	    reportPanel.setLayout(null);
	    reportPanel.setVisible(false);
	    
	    final JPanel registerPanel = new JPanel();
	    registerPanel.setBounds(0, 0, 694, 421);
	    frmLibraryManagingSystem.getContentPane().add(registerPanel);
	    registerPanel.setLayout(null);
	    registerPanel.setVisible(false);
	    
	    final JPanel MainPage = new JPanel();
	    MainPage.setBounds(0, 0, 694, 421);
	    frmLibraryManagingSystem.getContentPane().add(MainPage);
	    MainPage.setLayout(null);
	    MainPage.setVisible(true);
	    
	    final JPanel portalPanel = new JPanel();
		portalPanel.setBounds(0, 0, 694, 421);
		frmLibraryManagingSystem.getContentPane().add(portalPanel);
		portalPanel.setLayout(null);
		portalPanel.setVisible(false);
		
		final JPanel LoginPanel = new JPanel();
		LoginPanel.setBounds(0, 0, 694, 421);
		frmLibraryManagingSystem.getContentPane().add(LoginPanel);
		LoginPanel.setLayout(null);
		LoginPanel.setVisible(false);
	    
		
		final JPanel changeInfoPanel = new JPanel();
		changeInfoPanel.setBounds(0, 0, 694, 421);
		frmLibraryManagingSystem.getContentPane().add(changeInfoPanel);
		changeInfoPanel.setLayout(null);
		changeInfoPanel.setVisible(false);
		
		final JPanel contactPanel = new JPanel();
 		contactPanel.setBounds(0,0,694,421);
 		frmLibraryManagingSystem.getContentPane().add(contactPanel);
 		contactPanel.setLayout(null);
 		contactPanel.setVisible(false);
 		
 		JLabel contactLabel = new JLabel("Contact");
 		contactLabel.setBounds(27, 11, 121, 29);
 		contactLabel.setFont(new Font("Arial", Font.BOLD, 25));
 		contactPanel.add(contactLabel);
 		
 		JTextPane contactPane = new JTextPane();
 		
 		contactPane.setFont(new Font("Tahoma", Font.BOLD, 15));
 		contactPane.setBackground(SystemColor.control);
 		contactPane.setText("Amit Rambaran\n" +"City Official \n" +"Operations and Logistics\n"+ "416-333-3366\n" +"amit.r@on.gov.ca");
 		//ADD RESPECTIVE CONTACT INFO HERE
 		contactPane.setEditable(false);
 		contactPane.setBounds(20, 100, 662, 500);
 		contactPanel.add(contactPane);
 		
 		
 		final JPanel faqPanel = new JPanel();
 		faqPanel.setBounds(0, 0, 694, 421);
 		frmLibraryManagingSystem.getContentPane().add(faqPanel);
 		faqPanel.setLayout(null);
 		faqPanel.setVisible(false);
 		
 		JLabel faqLabel = new JLabel("FAQ");
 		faqLabel.setFont(new Font("Arial", Font.BOLD, 25));
 		faqLabel.setBounds(27, 11, 121, 29);
 		faqPanel.add(faqLabel);
 		
 		
 		JTextPane faqTextPane = new JTextPane();
 		faqTextPane.setEditable(false);
 		faqTextPane.setFont(new Font("Tahoma", Font.BOLD, 15));
 		faqTextPane.setBackground(SystemColor.control);
 		faqTextPane.setText("Q: How do I change languages?\n"
 				 +"\nA: fron the main screen, select your language of preference and click 'set'.\n"
 				+ "\nQ: How do I report a problem?\n"
 				 +"\nA: From the homescreen, select 'report a problem' and click GO\n"
 				+ "\nI have a suggestion I want to make. Will my voice be heard?\n"
 				 +"\nA: The city values your opinion. You can make a suggestion ticket by clicking 'suggest' on the "
 				+"home screen and clicking 'go'.");
 		faqTextPane.setBounds(20, 100, 662, 500);
 		faqPanel.add(faqTextPane);
		
		
		
		
	    JLabel label_10 = new JLabel("CYPRESS");
	    label_10.setHorizontalAlignment(SwingConstants.CENTER);
	    label_10.setFont(new Font("Arial", Font.BOLD, 25));
	    label_10.setBounds(27, 11, 121, 29);
	    reportPanel.add(label_10);
	    
	   
	    label_11.setHorizontalAlignment(SwingConstants.CENTER);
	    label_11.setFont(new Font("Arial", Font.BOLD, 25));
	    label_11.setBounds(508, 11, 176, 29);
	    reportPanel.add(label_11);
	    
	    JLabel label_12 = new JLabel("______________________________________________________________________________________________________________");
	    label_12.setHorizontalAlignment(SwingConstants.CENTER);
	    label_12.setBounds(24, 39, 660, 14);
	    reportPanel.add(label_12);
	    
	    JButton btnReport = new JButton("Report");
	    btnReport.setBounds(215, 313, 89, 23);
	    reportPanel.add(btnReport);
	    
	    JButton btnCancel_2 = new JButton("Cancel");
	    btnCancel_2.setBounds(370, 313, 89, 23);
	    reportPanel.add(btnCancel_2);
	    btnCancel_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				reportPanel.setVisible(false);
				portalPanel.setVisible(true);
				
			}
	    	
	    });
	    
	    textField_1 = new JTextField();
	    textField_1.setBounds(106, 97, 533, 20);
	    reportPanel.add(textField_1);
	    textField_1.setColumns(10);
	    
	    JLabel lblAddress = new JLabel("Address:");
	    lblAddress.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblAddress.setBounds(28, 100, 57, 14);
	    reportPanel.add(lblAddress);
	    
	    JButton btnLogout = new JButton("Logout");
	    btnLogout.setBounds(595, 63, 89, 23);
	    portalPanel.add(btnLogout);
	    btnLogout.addActionListener(new ActionListener (){

			public void actionPerformed(ActionEvent arg0) {
				reportPanel.setVisible(false);
				portalPanel.setVisible(true);
				label_11.setText("City of Toronto");
				label_3.setText("City of Toronto");
				label_7.setText("City of Toronto");
				lblCity.setText("City of Toronto");
				currentlyLoggedInUser=profile;
				
			}
			
	    } );
	    
	    JLabel label_13 = new JLabel("______________________________________________________________________________________________________");
	    label_13.setHorizontalAlignment(SwingConstants.LEFT);
	    label_13.setBounds(40, 155, 644, 14);
	    reportPanel.add(label_13);
	    
	    JLabel lblProblemsAtThe = new JLabel("PROBLEMS AT THE SITE:");
	    lblProblemsAtThe.setBounds(40, 144, 235, 14);
	    reportPanel.add(lblProblemsAtThe);
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("Utility Failure");
	    rdbtnNewRadioButton.setBounds(39, 196, 109, 23);
	    reportPanel.add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnPotholes = new JRadioButton("Potholes");
	    rdbtnPotholes.setBounds(40, 222, 109, 23);
	    reportPanel.add(rdbtnPotholes);
	    
	    JRadioButton rdbtnCity = new JRadioButton("City Property Vandalism");
	    rdbtnCity.setBounds(39, 248, 162, 23);
	    reportPanel.add(rdbtnCity);
	    
	    JRadioButton rdbtnErodedStreet = new JRadioButton("Eroded Street");
	    rdbtnErodedStreet.setBounds(40, 274, 109, 23);
	    reportPanel.add(rdbtnErodedStreet);
	    
	    JRadioButton rdbtnTreeCollpase = new JRadioButton("Tree Collapse");
	    rdbtnTreeCollpase.setBounds(272, 196, 109, 23);
	    reportPanel.add(rdbtnTreeCollpase);
	    
	    JRadioButton rdbtnFloodedStreets = new JRadioButton("Flooded Streets");
	    rdbtnFloodedStreets.setBounds(272, 222, 200, 23);
	    reportPanel.add(rdbtnFloodedStreets);
	    
	    JRadioButton rdbtnMouldAndSp = new JRadioButton("Mould and Spore Growth");
	    rdbtnMouldAndSp.setBounds(272, 248, 187, 23);
	    reportPanel.add(rdbtnMouldAndSp);
	    
	    JRadioButton rdbtnGarbageOrAny = new JRadioButton("Garbage or any Other Road Blocking Objects");
	    rdbtnGarbageOrAny.setBounds(272, 274, 300, 23);
	    reportPanel.add(rdbtnGarbageOrAny);
	    
	
	    /** Register form *******************************************************/

	    
	    JLabel label_6 = new JLabel("CYPRESS");
	    label_6.setBounds(24, 11, 121, 29);
	    label_6.setHorizontalAlignment(SwingConstants.CENTER);
	    label_6.setFont(new Font("Arial", Font.BOLD, 25));
	    registerPanel.add(label_6);
	    
	   
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
	    btnRegister.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	 addProfile(textField_firstName.getText(), textField_lastName.getText(), textField_Address.getText(), textField_Phone1.getText() + textField_Phone2.getText()+ textField_Phone3.getText() ,textField_Email.getText(), textField_Username.getText(),textField_Password.getText());
	    	 registerPanel.setVisible(false);
	    	 portalPanel.setVisible(true);
	    	 System.out.println(storage.toString());
	    	}
	    });
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
	    
	/**   CHANGE INFO PANEL  ******************************************************/
	    

	    JLabel label_6CI = new JLabel("CYPRESS");
	    label_6CI.setBounds(24, 11, 121, 29);
	    label_6CI.setHorizontalAlignment(SwingConstants.CENTER);
	    label_6CI.setFont(new Font("Arial", Font.BOLD, 25));
	    changeInfoPanel.add(label_6CI);
	    
	   
	    label_7CI.setBounds(501, 11, 176, 29);
	    label_7CI.setHorizontalAlignment(SwingConstants.CENTER);
	    label_7CI.setFont(new Font("Arial", Font.BOLD, 25));
	    changeInfoPanel.add(label_7CI);
	    
	    JLabel label_8CI = new JLabel("______________________________________________________________________________________________________________");
	    label_8CI.setBounds(17, 39, 660, 14);
	    label_8CI.setHorizontalAlignment(SwingConstants.CENTER);
	    changeInfoPanel.add(label_8CI);
	    
	    JLabel lblNewLabel_1CI = new JLabel("Please enter information below:");
	    lblNewLabel_1CI.setFont(new Font("Arial", Font.BOLD, 14));
	    lblNewLabel_1CI.setBounds(24, 64, 238, 28);
	    changeInfoPanel.add(lblNewLabel_1CI);
	    
	    JLabel lblFirstNameCI = new JLabel("First Name:");
	    lblFirstNameCI.setBounds(59, 100, 71, 14);
	    changeInfoPanel.add(lblFirstNameCI);
	    
	    JLabel lblLastNameCI = new JLabel("Last Name:");
	    lblLastNameCI.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblLastNameCI.setBounds(44, 125, 71, 14);
	    changeInfoPanel.add(lblLastNameCI);
	    
	    JLabel lblAdressCI = new JLabel("Address:");
	    lblAdressCI.setBounds(64, 150, 51, 14);
	    changeInfoPanel.add(lblAdressCI);
	    
	    JLabel lblPhoneNumberCI = new JLabel("Phone Number:");
	    lblPhoneNumberCI.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblPhoneNumberCI.setBounds(10, 175, 106, 14);
	    changeInfoPanel.add(lblPhoneNumberCI);
	    
	    JLabel lblEmailAdressCI = new JLabel("Email Adress:");
	    lblEmailAdressCI.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblEmailAdressCI.setBounds(24, 200, 91, 14);
	    changeInfoPanel.add(lblEmailAdressCI);
	    
	    JLabel lblUsernameCI = new JLabel("Username:");
	    lblUsernameCI.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblUsernameCI.setBounds(24, 225, 91, 14);
	    changeInfoPanel.add(lblUsernameCI);
	    
	    JLabel lblPasswordCI = new JLabel("Password:");
	    lblPasswordCI.setHorizontalAlignment(SwingConstants.TRAILING);
	    lblPasswordCI.setBounds(24, 256, 91, 14);
	    changeInfoPanel.add(lblPasswordCI);
	    
	    final JTextField textField_firstNameCI = new JTextField();
	    textField_firstNameCI.setBounds(136, 100, 200, 20);
	    changeInfoPanel.add(textField_firstNameCI);
	    textField_firstNameCI.setColumns(10);
	    textField_firstNameCI.setText(currentlyLoggedInUser.getFName());
	    
	    final JTextField textField_lastNameCI = new JTextField();
	    textField_lastNameCI.setColumns(10);
	    textField_lastNameCI.setBounds(136, 125, 200, 20);
	    changeInfoPanel.add(textField_lastNameCI);
	    textField_lastNameCI.setText(currentlyLoggedInUser.getLName());
	    
	    final JTextField textField_AddressCI = new JTextField();
	    textField_AddressCI.setColumns(10);
	    textField_AddressCI.setBounds(136, 150, 541, 20);
	    changeInfoPanel.add(textField_AddressCI);
	    textField_AddressCI.setText(currentlyLoggedInUser.getAddress());
	    
	    
	    final JTextField textField_EmailCI = new JTextField();
	    textField_EmailCI.setColumns(10);
	    textField_EmailCI.setBounds(136, 200, 200, 20);
	    changeInfoPanel.add(textField_EmailCI);
	    textField_EmailCI.setText(currentlyLoggedInUser.getEmail());
	    
	    
	    final   JTextField textField_UsernameCI = new JTextField();
	    textField_UsernameCI.setColumns(10);
	    textField_UsernameCI.setBounds(136, 225, 200, 20);
	    changeInfoPanel.add(textField_UsernameCI);
	    textField_UsernameCI.setEditable(false);
	    textField_UsernameCI.setText(currentlyLoggedInUser.getUsername());
	    
	    
	    final JTextField textField_PasswordCI = new JTextField();
	    textField_PasswordCI.setColumns(10);
	    textField_PasswordCI.setBounds(136, 253, 200, 20);
	    changeInfoPanel.add(textField_PasswordCI);
	    textField_PasswordCI.setText(currentlyLoggedInUser.getpassword());
	    
	    final  JTextField  textField_Phone1CI = new JTextField();
	    textField_Phone1CI.setColumns(10);
	    textField_Phone1CI.setBounds(136, 175, 51, 20);
	    changeInfoPanel.add(textField_Phone1CI);
	    textField_Phone1CI.setText(currentlyLoggedInUser.getPhone().substring(0,2));
	    
	    final JTextField textField_Phone2CI = new JTextField();
	    textField_Phone2CI.setColumns(10);
	    textField_Phone2CI.setBounds(219, 175, 51, 20);
	    changeInfoPanel.add(textField_Phone2CI);
	    textField_Phone2CI.setText(currentlyLoggedInUser.getPhone().substring(3,5));
	    
	    final JTextField textField_Phone3CI = new JTextField();
	    textField_Phone3CI.setColumns(10);
	    textField_Phone3CI.setBounds(304, 175, 51, 20);
	    changeInfoPanel.add(textField_Phone3CI);
	    textField_Phone3CI.setText(currentlyLoggedInUser.getPhone().substring(6,8));
	   
	    
	    JLabel dashCI = new JLabel("--");
	    dashCI.setBounds(197, 178, 23, 14);
	    changeInfoPanel.add(dashCI);
	    
	    JLabel label_9CI = new JLabel("--");
	    label_9CI.setBounds(280, 178, 14, 14);
	    changeInfoPanel.add(label_9CI);
	    
	    JButton btnRegisterCI = new JButton("Change Info");
	    btnRegisterCI.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	
	    	editProfile(textField_firstNameCI.getText(), textField_lastNameCI.getText(), textField_AddressCI.getText(), textField_Phone1CI.getText() + textField_Phone2CI.getText()+ textField_Phone3CI.getText() ,textField_EmailCI.getText(), textField_UsernameCI.getText(),textField_PasswordCI.getText());
	    	 
	    	 changeInfoPanel.setVisible(false);
	    	 portalPanel.setVisible(true);
	    	 System.out.println(storage.toString());
	    	}
	    });
	    btnRegisterCI.setBounds(121, 315, 120, 23);
	    changeInfoPanel.add(btnRegisterCI);
	    
	    JButton btnCancel_1CI = new JButton("Cancel");
	    btnCancel_1CI.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		portalPanel.setVisible(true);
	    		changeInfoPanel.setVisible(false);
	    		
	    	}
	    });
	    btnCancel_1CI.setBounds(286, 315, 89, 23);
	    changeInfoPanel.add(btnCancel_1CI);
	    
	    
	    /* END CHANGe INFO PANEL *******************************************************************/

	    
	    
	    																JLabel Cypress = new JLabel("CYPRESS");
	    																Cypress.setBounds(267, 39, 171, 43);
	    																Cypress.setHorizontalAlignment(SwingConstants.CENTER);
	    																Cypress.setFont(new Font("Arial", Font.BOLD, 36));
	    																MainPage.add(Cypress);
	    																
	    																JLabel lblNewLabel = new JLabel("");
	    																lblNewLabel.setBackground(Color.BLACK);
	    																Image img = new ImageIcon(this.getClass().getResource("image.png")).getImage();
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
		
		final JRadioButton rdbtnRegister = new JRadioButton("Register");
		final JRadioButton rdbtnReport = new JRadioButton("Report a Problem");
		final JRadioButton rdbtnLogin = new JRadioButton("Login");
		final JRadioButton rdbtnChangeInfo = new JRadioButton("Change Info");
		final JRadioButton rdbtnSuggest = new JRadioButton("Suggest");
		final JRadioButton rdbtnVote = new JRadioButton("Vote");
		final JRadioButton rdbtnFaq = new JRadioButton("FAQ");
		final JRadioButton rdbtnContact = new JRadioButton("Contact");
		
		ButtonGroup myButtonGroup = new ButtonGroup();
		 myButtonGroup.add(rdbtnRegister);
		 myButtonGroup.add( rdbtnReport);
		 myButtonGroup.add(rdbtnLogin);
		 myButtonGroup.add(rdbtnSuggest);
		 myButtonGroup.add(rdbtnVote);
		 myButtonGroup.add(rdbtnFaq);
		 myButtonGroup.add(rdbtnContact);
		 myButtonGroup.add(rdbtnChangeInfo);
		 
		 
		rdbtnRegister.setBounds(26, 121, 109, 23);
		portalPanel.add(rdbtnRegister);
		
		
		rdbtnLogin.setBounds(26, 150, 109, 23);
		portalPanel.add(rdbtnLogin);
		
		
		rdbtnChangeInfo.setBounds(26, 175, 118, 23);
		portalPanel.add(rdbtnChangeInfo);
		
		
		rdbtnReport.setBounds(26, 201, 124, 23);
		portalPanel.add(rdbtnReport);
		
	
		rdbtnSuggest.setBounds(26, 227, 109, 23);
		portalPanel.add(rdbtnSuggest);
		
		
		rdbtnVote.setBounds(26, 253, 109, 23);
		portalPanel.add(rdbtnVote);
		
		
		rdbtnFaq.setBounds(26, 279, 109, 23);
		portalPanel.add(rdbtnFaq);
		
		
		rdbtnContact.setBounds(26, 305, 109, 23);
		portalPanel.add(rdbtnContact);
		
		JButton btnO = new JButton("GO");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnReport.isSelected()) {
					reportPanel.setVisible(true);
					portalPanel.setVisible(false);
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
					faqPanel.setVisible(true);		
					portalPanel.setVisible(false);
				}
				else if (rdbtnContact.isSelected()){
					 				contactPanel.setVisible(true);
					 					portalPanel.setVisible(false);
			     }
				else if (rdbtnChangeInfo.isSelected()){
					changeInfoPanel.setVisible(true);
	 					portalPanel.setVisible(false);
				}
				
				
				
			}
		});
		btnO.setBounds(135, 302, 69, 23);
		portalPanel.add(btnO);
		
		
		
		JLabel lblKeep = new JLabel("Keeping Our City Streets Clean and Safe...");
		lblKeep.setHorizontalAlignment(SwingConstants.CENTER);
		lblKeep.setFont(new Font("Arial", Font.BOLD, 14));
		lblKeep.setBounds(296, 313, 317, 29);
		portalPanel.add(lblKeep);
		
		JLabel label_5 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("image2.jpg")).getImage();
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
											String pass = new String(passwordField.getPassword()); //hidden for security reasons
									
											for (Profile profiles: storage) {
												if (profiles.Username.equals(username) && profiles.password.equals(pass)) {
													currentlyLoggedInUser = profiles;
													//AdminPanel.setVisible(true);
													LoginPanel.setVisible(false);
													portalPanel.setVisible(true);
													label_11.setText(" Welcome ! " + username+ "," + pass);
													label_3.setText(" Welcome ! " + username+ "," + pass);
													label_7.setText(" Welcome ! " + username+ "," + pass);
													lblCity.setText(" Welcome ! " + username+ "," + pass);
												    textField_firstNameCI.setText(currentlyLoggedInUser.getFName());
												    textField_lastNameCI.setText(currentlyLoggedInUser.getLName());
												    textField_AddressCI.setText(currentlyLoggedInUser.getAddress());
												    textField_EmailCI.setText(currentlyLoggedInUser.getEmail());
												    textField_UsernameCI.setText(currentlyLoggedInUser.getUsername());
												    textField_PasswordCI.setText(currentlyLoggedInUser.getpassword());
												    textField_Phone1CI.setText(currentlyLoggedInUser.getPhone().substring(0,3));
												    textField_Phone2CI.setText(currentlyLoggedInUser.getPhone().substring(3,6));
												    textField_Phone3CI.setText(currentlyLoggedInUser.getPhone().substring(6,10));
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
											}
										});
										
										
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
										txtpnYouAreCurrently.setEditable(false);
										txtpnYouAreCurrently.setFont(new Font("Tahoma", Font.BOLD, 15));
										txtpnYouAreCurrently.setBackground(SystemColor.control);
										txtpnYouAreCurrently.setText("You are currently at the Cypress Login Page. By logging into this system, you will be able to report a variety of problems as you have witnessed on the streets of Toronto.");
										txtpnYouAreCurrently.setBounds(22, 62, 662, 73);
										LoginPanel.add(txtpnYouAreCurrently);
										
										JButton btnCancel = new JButton("Cancel");
										btnCancel.setBounds(379, 244, 91, 20);
										LoginPanel.add(btnCancel);
										btnCancel.addActionListener(new ActionListener(){

											public void actionPerformed(
													ActionEvent arg0) {
												LoginPanel.setVisible(false);
												portalPanel.setVisible(true);
											}
										});
										
										JLabel lblNewLabel_3 = new JLabel("@cypress.on.ca");
										lblNewLabel_3.setBounds(379, 157, 102, 14);
										LoginPanel.add(lblNewLabel_3);
										
										
	   
																		//Image img2 = new ImageIcon(this.getClass().getResource("/image.png")).getImage();
										
										
										
									
								
																	
																	
	}
}

