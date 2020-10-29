import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JLabel firstLabel;
  JLabel secondLabel;
  JLabel thirdLabel;

  JTextField firstInput;
  JTextField secondInput;
  JTextField thirdInput;

  JButton validateButton;
  JButton resetButton;

  JTextArea outputTextArea;
  JTextArea instructionTextArea;

  JPanel mainPanel;
  
 
 
 
    // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // initialize the main panel
  mainPanel = new JPanel();
  // tell the main panel we will do a manual layout
  mainPanel.setLayout(null);

  // initialize the first label 
  firstLabel = new JLabel("Enter the first side:");
  // set bounds of the first label
  firstLabel.setBounds(10, 10, 200, 20);
 
  // finish off the last two labels
  secondLabel = new JLabel("Enter the second side:");
  secondLabel.setBounds(10, 40, 200, 20);
  thirdLabel = new JLabel("Enter the third side:");
  thirdLabel.setBounds(10, 70, 200, 20);

  // create the text boxes
  firstInput = new JTextField();
  firstInput.setBounds(220, 10, 150, 20);
  secondInput = new JTextField();
  secondInput.setBounds(220, 40, 150, 20);
  thirdInput= new JTextField();
  thirdInput.setBounds(220, 70, 150, 20);

  // initialize the buttons
  validateButton = new JButton("Validate");
  validateButton.setBounds(380, 10, 100, 35);
  resetButton = new JButton("Reset");
  resetButton.setBounds(380, 55, 100, 35);
  
  // initialize the text areas
  outputTextArea = new JTextArea();
  outputTextArea.setBounds(10, 100, 780, 240);
  instructionTextArea = new JTextArea();
  instructionTextArea.setBounds(10, 350, 780, 240);

  // make it so they cant type in the areas
  outputTextArea.setEnabled(false);
  instructionTextArea.setEnabled(false);
  // add the labels to the main panel
  mainPanel.add(firstLabel);
  mainPanel.add(secondLabel);
  mainPanel.add(thirdLabel);

 // add the input to the panel
  mainPanel.add(firstInput);
  mainPanel.add(secondInput);
  mainPanel.add(thirdInput);

 // add the buttons to the panel
 mainPanel.add(validateButton);
 mainPanel.add(resetButton);

  
 // add the text areas 
  mainPanel.add(outputTextArea);
  mainPanel.add(instructionTextArea);

  // add the main panel to the screen
  frame.add(mainPanel);
  
  }
  

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
