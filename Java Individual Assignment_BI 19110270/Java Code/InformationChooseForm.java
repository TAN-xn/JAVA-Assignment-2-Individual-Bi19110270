// OOP Java Individual Assignment 2 (BI 1911270 TAN XUAN NI)
// COVID-19 2020 Volunteer Registration Form

//Let the user choose and click on the button that the field of volunteer they want to join 

// Import statements
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*;


// Begin the InformationChooseForm class  
class InformationChooseForm extends JFrame
{    
     // Create component classes
     private JLabel label, label1;
     private JPanel panel;
     private JButton doctor, nurse;
     private ImageIcon icon, icon1;
     
     // Begin the InformationChooseForm constructor
     public InformationChooseForm()
     {   
         // Create a new JFrame Container
         // Specify the size and the location of the frame
         // Let the frame resizeable
         JFrame frame = new JFrame("COVID-19 VOLUNTEER Registration(Choose Field)"); 
         frame.setBounds(550, 250, 500, 300);  
         frame.setResizable(true);   

         // Terminate the program when the user closes the application
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
         
         // Create a new JPanel
         // Set the layout of the panel
         // Add it to the frame
         panel = new JPanel();   
         panel.setLayout(null);
         frame.add(panel); 
         
         // Create a new label
         // Set the font, size, and location of label
         // Add it to the panel         
         label = new JLabel("COVID-19 2020 VOLUNTEER ONLINE REGISTRATION");   
         label.setFont(new Font("Arial", Font.BOLD, 15));   
         label.setSize(500, 20); 
         label.setLocation(50, 50);
         panel.add(label); 

         // Create a label1
         // Set the font, size, and location of label1
         // Add it to the panel         
         label1 = new JLabel("Please choose the field of volunteer you want to be.\n Thank You !");
         label1.setFont(new Font("Arial", Font.BOLD, 13));
         label1.setSize(500, 20);
         label1.setLocation(40, 80);
         panel.add(label1);
         
         // Create an new icon for the buttons
         // Resize the icon
         icon = new ImageIcon("doctor.png");
         Image newicon = icon.getImage();
         Image modifynewicon = newicon.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
         icon = new ImageIcon(modifynewicon);
        
         icon1 = new ImageIcon("nurse.png");
         Image newicon1 = icon1.getImage();
         Image modifynewicon1 = newicon1.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
         icon1 = new ImageIcon(modifynewicon1);

         // Create an icon and a doctor button to let the user press the field they want to join
         // Set the font, size and location of the button
         // Add action listener
         doctor = new JButton("Doctor", icon);
         doctor.setSize(150, 50);
         doctor.setLocation(80, 130);
         doctor.addActionListener(new ActionListener()   //Anonymous Inner class 
         { public void actionPerformed(ActionEvent e)
            {   
                // After press the Doctor button, it will move to MyDoctorForm class 
                new MyDoctorForm();
             }
           
          });
          // Add it to the panel
          panel.add(doctor); 
          
          // Create an icon and a nurse button to let the user press the field they want to join
          // Set the font, size and location of the button
          // Add action listener        
          nurse = new JButton("Nurse", icon1);
          nurse.setSize(150, 50); 
          nurse.setLocation(260, 130);
          nurse.addActionListener(new ActionListener()   //Anonymous Inner class
          { public void actionPerformed(ActionEvent e)
            { 
              // After press the Nurse button, it will move to MyNurseForm class 
              new MyNurseForm();
             }
           
           });
          // Add it to the panel
          panel.add(nurse);

          // Display the frame
          frame.setVisible(true);
     }
}            
                     
// Driver class
class Choose 
{ 
    public static void main(String[] args) throws Exception 
    { 
        InformationChooseForm chooseform = new InformationChooseForm(); 
    } 
} 
