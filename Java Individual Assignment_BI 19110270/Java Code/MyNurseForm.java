// OOP Java Individual Assignment 2 (BI 1911270 TAN XUAN NI)
// COVID-19 2020 Volunteer Registration Form 

// Let the user fill the COVID-19 2020 Volunteer Registration Form (Nurse)

// Import statements
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
import java.io.*;

// Begin the MyDoctorForm class   
class MyNurseForm extends JFrame implements ActionListener { 
      
    //Create component classes
    private JLabel title, title1, state, name, ic, phone, gender, birth, address, email, remind, remind1; 
    private JTextField myname,  myic, myphone, myaddress, myaddress1, myaddress2, myemail; 
    private JRadioButton male, female; 
    private ButtonGroup mybutton; 
    private JComboBox choosenstate, day, month, year;  
    private JCheckBox term; 
    private JButton register, reset; 
    private JTextArea mybox; 
    private ImageIcon icon, icon1, icon2, icon3, icon4, icon5, icon6, icon7;
    FileWriter writer;
       
    private String states[] // Create an array of state of hospital
    = { "Kedah", "Perlis", "Pulau Pinang", "Perak", "Kelantan", "Terengganu", "Selangor", 
      "Negeri Sembilan", "Melaka", "Pahang", "Johor", "Sabah", "Sarawak"};  
  
    private String days[] // Create an array of days
    = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
      "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
      "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", 
      "31" }; 
            
    private String months[] // Create an array of months
    = { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JULY", "AUG", "SEPT", "OCT", "NOV", "DEC" }; 
            
    private String years[] // Create an array of years
     = { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968","1969",
       "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978","1979",
       "1980", "181", "1982", "1983", "1984", "1985", "1986", "1987", "1988","1989",
       "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999"}; 
  
    // Begin the MyDoctorForm constructor 
    public MyNurseForm() 
    {   
        // Create a new JFrame Container
        // Set the position and size of the frame 
        // Set to enable the user resizing the frame
        JFrame frame = new JFrame("Covid-19 2020 Volunteer Registration Form"); 
        frame.setBounds(280, 100, 1000, 650);   
        frame.setResizable(true);
        
        //Terminate the program when the user closes the application
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Create a new JPanel
        // Set the background colour and the layout of the panel
        // Add it to the frame
        JPanel panel = new JPanel(); 
        panel.setBackground(Color.WHITE);  
        panel.setLayout(null);
        frame.add(panel);
        
        // Create an new icon for dialogs, title and labels
        // Resize the icon
        icon = new ImageIcon("care.png"); 
        Image newicon = icon.getImage();  
        Image modifynewicon = newicon.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(modifynewicon);
        
        icon1 = new ImageIcon("register.png");  
        Image newicon1 = icon1.getImage();   
        Image modifynewicon1 = newicon1.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        icon1 = new ImageIcon(modifynewicon1);
        
        icon2 = new ImageIcon("reset.png");  
        Image newicon2 = icon2.getImage();   
        Image modifynewicon2 = newicon2.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(modifynewicon2);
        
        icon3 = new ImageIcon("health.png"); 
        Image newicon3 = icon3.getImage();   
        Image modifynewicon3 = newicon3.getScaledInstance(70, 45, java.awt.Image.SCALE_SMOOTH);
        icon3 = new ImageIcon(modifynewicon3);
        
        icon4 = new ImageIcon("tick.png");   
        Image newicon4 = icon4.getImage();   
        Image modifynewicon4 = newicon4.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        icon4 = new ImageIcon(modifynewicon4);
        
        icon5 = new ImageIcon("like.png"); 
        Image newicon5 = icon5.getImage();  
        Image modifynewicon5 = newicon5.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon5 = new ImageIcon(modifynewicon5);
        
        icon6 = new ImageIcon("copy.png"); 
        Image newicon6 = icon6.getImage();  
        Image modifynewicon6 = newicon6.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon6 = new ImageIcon(modifynewicon6);
        
        icon7 = new ImageIcon("alert.png"); 
        Image newicon7 = icon7.getImage();  
        Image modifynewicon7 = newicon7.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        icon7 = new ImageIcon(modifynewicon7);
        
        // Create an icon and a label for title
        // Set the font, size, and location of title label
        // Add it to the panel                   
        title = new JLabel("Covid-19 2020 Volunteer Registration Form", icon3, SwingConstants.CENTER); 
        title.setFont(new Font("Britannic Bold", Font.BOLD, 25)); 
        title.setSize(800, 50); 
        title.setLocation(100, 25); 
        panel.add(title); 
        
        // Create an icon and a label for title1
        // Set the font, size, and location of title1 label
        // Add it to the panel
        title1 = new JLabel("(Nurse)"); 
        title1.setFont(new Font("Britannic Bold", Font.BOLD, 20)); 
        title1.setSize(500, 40); 
        title1.setLocation(480, 65); 
        panel.add(title1); 
        
        
        // Create an icon and a label for the state question
        // Set the font, size, and location of state label
        // Add it to the panel
        state = new JLabel("Volunteer in which state of hospital?", icon4, SwingConstants.LEFT);   
        state.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        state.setSize(350, 20); 
        state.setLocation(70, 110); 
        panel.add(state); 
        
        // Create a JComboBox of choosenstate to let the user selects the state of hospital thet want from the list given
        // Set the font, size and location of the combo box
        // Add it to the panel
        choosenstate = new JComboBox(states); 
        choosenstate.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        choosenstate.setSize(220, 20); 
        choosenstate.setLocation(90, 135); 
        panel.add(choosenstate); 
        
        // Create an icon and a label for name
        // Set the font, size, and location of name label
        // Add it to the panel  
        name = new JLabel("Name", icon4, SwingConstants.LEFT); 
        name.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        name.setSize(150, 20); 
        name.setLocation(70, 180); 
        panel.add(name); 
  
        // Create a myname text field to enable the user to enter the text
        // Set the font, size and location of myname text field
        // Add it to the panel
        myname = new JTextField();  
        myname.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myname.setSize(200, 20); 
        myname.setLocation(250, 180); 
        panel.add(myname); 
        
        // Create an icon and a label for ic
        // Set the font, size, and location of ic label
        // Add it to the panel
        ic = new JLabel("IC Number", icon4, SwingConstants.LEFT); 
        ic.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        ic.setSize(200, 20); 
        ic.setLocation(70, 220); 
        panel.add(ic); 
        
        // Create a myic text field to enable the user to enter the text
        // Set the font, size and location of myic text field
        // Add it to the panel
        myic = new JTextField();
        myic.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myic.setSize(200, 20); 
        myic.setLocation(250, 220); 
        panel.add( myic); 
        
        // Create an icon and a label for phone
        // Set the font, size, and location of phone label
        // Add it to the panel
        phone = new JLabel("Phone Number", icon4, SwingConstants.LEFT); 
        phone.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        phone.setSize(200, 20); 
        phone.setLocation(70, 260); 
        panel.add(phone);
         
        // Create a myphone text field to enable the user to enter the text
        // Set the font, size and location of myphone text field
        // Add it to the panel
        myphone = new JTextField(); 
        myphone.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myphone.setSize(200, 20); 
        myphone.setLocation(250, 260); 
        panel.add(myphone); 
        
        // Create an icon and a label for gender
        // Set the font, size, and location of gender label
        // Add it to the panel
        gender = new JLabel("Gender", icon4, SwingConstants.LEFT); 
        gender.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        gender.setSize(100, 20); 
        gender.setLocation(70, 300); 
        panel.add(gender); 
        
        // Create male and female radio button to let the user select only one button at any one time
        // Set the font, size, and location of each button
        // Add them to the panel
        male = new JRadioButton("Male"); 
        male.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        male.setSelected(true); 
        male.setSize(75, 20); 
        male.setLocation(250, 300); 
        panel.add(male); 
  
        female = new JRadioButton("Female"); 
        female.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        female.setSelected(false); 
        female.setSize(80, 20); 
        female.setLocation(325, 300); 
        panel.add(female); 
        
        // Define a button group
        // Add the male and female radio button to a button group
        mybutton = new ButtonGroup(); 
        mybutton.add(male); 
        mybutton.add(female); 
        
        // Create an icon and a label of birth date
        // Set the font, size, and location of birth date label
        // Add it to the panel
        birth = new JLabel("Birth date", icon4, SwingConstants.LEFT); 
        birth.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        birth.setSize(100, 20); 
        birth.setLocation(70, 340); 
        panel.add(birth); 
        
        // Create a JComboBox of day, month and year to let the user selects their own birth date from the list given
        // Set the font, size and location of every combo box
        // Add them to the panel           
        day = new JComboBox(days); 
        day.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        day.setSize(50, 20); 
        day.setLocation(250, 340); 
        panel.add(day); 
  
        month = new JComboBox(months); 
        month.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        month.setSize(60, 20); 
        month.setLocation(320, 340); 
        panel.add(month); 
  
        year = new JComboBox(years); 
        year.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        year.setSize(60, 20); 
        year.setLocation(390, 340); 
        panel.add(year); 
        
        // Create an icon and a label for address
        // Set the font, size and location of adrress label 
        // Add it to the panel
        address = new JLabel("Address", icon4, SwingConstants.LEFT); 
        address.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        address.setSize(100, 20); 
        address.setLocation(70, 380); 
        panel.add(address); 
        
        // Create a few address text field to enable the user to enter the text
        // Set the font, size and location of every address text field
        // Add them to the panel 
        myaddress = new JTextField(); 
        myaddress.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myaddress.setSize(200, 20); 
        myaddress.setLocation(250, 380); 
        panel.add(myaddress); 
        
        myaddress1 = new JTextField(); 
        myaddress1.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myaddress1.setSize(200, 20); 
        myaddress1.setLocation(250, 410); 
        panel.add(myaddress1);
        
        myaddress2 = new JTextField(); 
        myaddress2.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myaddress2.setSize(200, 20); 
        myaddress2.setLocation(250, 440);        
        panel.add(myaddress2);
        
        // Create an icon and a label for email
        // Set the font, size and location of email label 
        // Add it to the panel
        email = new JLabel("E-mail", icon4, SwingConstants.LEFT); 
        email.setFont(new Font("Britannic Bold", Font.PLAIN, 15)); 
        email.setSize(150, 20); 
        email.setLocation(70, 480); 
        panel.add(email); 
        
        // Create a myemail text field to enable the user to enter a line of text
        // Set the font, size and location of myemail text field 
        // Add it to the panel
        myemail = new JTextField(); 
        myemail.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        myemail.setSize(200, 20); 
        myemail.setLocation(250, 480); 
        panel.add(myemail); 
        
        // Create the check box to enable the user selects or deselects the check box
        // Set the font, size and location of term check box 
        // Add it to the panel
        term = new JCheckBox("Please Agree to the Terms And Conditions."); 
        term.setFont(new Font("Arial", Font.PLAIN, 15)); 
        term.setSize(320, 20); 
        term.setLocation(120, 525); 
        panel.add(term); 
        
        
        // Create an icon and a register button to let the user press after finish filing the registration from
        // Set the font, size and location of the button
        // Add action listener
        // Add it to the panel 
        register = new JButton("REGISTER", icon1); 
        register.setFont(new Font("Arial", Font.BOLD, 12)); 
        register.setSize(140, 20); 
        register.setLocation(100, 570); 
        register.addActionListener(this); 
        panel.add(register); 
        
        // Create an icon and a reset button to let the user press after finish filing the registration from
        // Set the font, size and location of the button
        // Add action listener
        // Add it to the panel
        reset = new JButton("RESET", icon2); 
        reset.setFont(new Font("Arial", Font.BOLD, 12)); 
        reset.setSize(140, 20); 
        reset.setLocation(300, 570); 
        reset.addActionListener(this); 
        panel.add(reset); 
        
        // Create a label for remind and remind1
        // Set the font, size, and location of remind and remind1 label 
        // Add them to the panel
        remind = new JLabel("Please check your personal details."); // Create a label
        remind.setFont(new Font("Tahoma", Font.BOLD, 12)); 
        remind.setSize(400, 20); 
        remind.setLocation(550, 120); 
        panel.add(remind); 
        
        remind1 = new JLabel("Please press RESET button, if your details is wrong."); 
        remind1.setFont(new Font("Tahoma", Font.BOLD, 12)); 
        remind1.setSize(400, 20); 
        remind1.setLocation(550, 140); 
        panel.add(remind1); 

        // Create a text area of mybox to show the output of the registration form
        // Set the font, size, and location of mybox text area
        // Set the mybox text area can wrap the lines of the JTextArea if it does not fit in the JTextArea 
        // Set the mybox text area cannot be edited
        // Add it to the panel
        mybox = new JTextArea(); 
        mybox.setFont(new Font("Tahoma", Font.PLAIN, 15)); 
        mybox.setBackground(Color.ORANGE); 
        mybox.setSize(380, 400); 
        mybox.setLocation(550, 170); 
        mybox.setLineWrap(true); 
        mybox.setEditable(false); 
        panel.add(mybox); 
        
        // Display the frame 
        frame.setVisible(true); 
        
        // Create an icon and a dialog that show a message
        JOptionPane.showMessageDialog(null, " Dear Nurse,\n Thank You for Willingness to Volunteer Your Time and Skills !\n Please Fill in the Registration Form ", "Message", JOptionPane.INFORMATION_MESSAGE, icon);

    } 
  
    // Handle the button event
    // Method actionPerformed() 
    // To get the action performed by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    {   
        
        if (e.getSource() == register) 
        { 
            if (term.isSelected()) 
            {   
                // If the user press REGISTER button and select the check box after filling the form 
                // The registration output will print out on the mybox text area
                String data  = "Covid-19 2020 Volunteer Registration Form\nPersonal Detail (Nurse)\n\n";
                String data1 = "Volunteer in which state of hospital?\n" + (String)choosenstate.getSelectedItem() + "\n\n";
                String data2 = "Name : " + myname.getText() + "\n";
                String data3 ="IC Number: " + myic.getText() + "\n";
                String data4 = "Phone Number : " + myphone.getText() + "\n"; 
                String data5; 
                  if (male.isSelected()) 
                     data5 = "Gender : Male" + "\n"; 
                  else
                     data5 = "Gender : Female" + "\n"; 
                            
                String data6 = "Birth Date : " + (String)day.getSelectedItem() + " "+ (String)month.getSelectedItem() 
                                +  " " + (String)year.getSelectedItem()  + "\n"; 
  
                String data7 = "Address : " + myaddress.getText() + ", \n              " + myaddress1.getText() + ", \n              " 
                                + myaddress2.getText() + "\n" ; 
                String data8 = "E-mail : " + myemail.getText() + "\n";                
                
                mybox.setText(data + data1 + data2 + data3 + data4 + data5 + data6 + data7 + data8); 
                mybox.setEditable(false);
                
                // Create an icon and a dialog that show a message
                JOptionPane.showMessageDialog(null, "Your registration is CONFIRM !", "Message", JOptionPane.INFORMATION_MESSAGE, icon5);
                
                // Create a text file for enable to read the input from external storage file 
                // and write the output to external file
               
                try
                { writer = new FileWriter("Covid-19 Volunteer-Nurse.txt", true);
                  writer.write("Covid-19 2020 Volunteer Registration Form Personal Detail(Nurse)");
                  writer.write(System.getProperty("line.separator"));
                  writer.write(System.getProperty("line.separator"));
                  
                  writer.write(state.getText() + "\t" +(String)choosenstate.getSelectedItem());
                  writer.write(System.getProperty("line.separator"));
                  
                  writer.write(name.getText() + ": \t\t" + myname.getText());
                  writer.write(System.getProperty("line.separator"));
                 
                  writer.write(ic.getText() + ": \t" + myic.getText());
                  writer.write(System.getProperty("line.separator"));
                  
                  writer.write(phone.getText() + ": \t" + myphone.getText());
                  writer.write(System.getProperty("line.separator"));
                  
                  if (male.isSelected()) 
                     writer.write(gender.getText() + ": \t\t" + "Male");
                  else
                     writer.write(gender.getText() + ": \t\t" + "Female");
                  writer.write(System.getProperty("line.separator"));
                  
                  writer.write(birth.getText() + ": \t" + (String)day.getSelectedItem() + " "+ (String)month.getSelectedItem() 
                                +  " " + (String)year.getSelectedItem());
                  writer.write(System.getProperty("line.separator"));
                  
                  writer.write(address.getText() + ": \t" + myaddress.getText() + ", \n\t                   " + myaddress1.getText() 
                              + ", \n\t                   " + myaddress2.getText());
                  writer.write(System.getProperty("line.separator"));
                  
                  writer.write(email.getText() + ": \t" + myemail.getText());
                  writer.write(System.getProperty("line.separator"));
                             
                  writer.close();
                  
                  // Create an icon and a dialog that show a message
                  JOptionPane.showMessageDialog(null, "File Written Had Stored", "Message", JOptionPane.INFORMATION_MESSAGE, icon6);
                }  
                catch(Exception ae)
                { JOptionPane.showMessageDialog(null, "Error");
                }
            } 
            else 
            // The dialog message will pop up to remind the user select the check box
            { 
                mybox.setText(""); 
                 
                JOptionPane.showMessageDialog(null, "Please accept the terms & conditions.", "Message", JOptionPane.INFORMATION_MESSAGE, icon7);
            } 
        } 
        
        // If the user press RESET button, all the information will be clear
        else if (e.getSource() == reset) 
        { 
            String def = "";
            choosenstate.setSelectedIndex(0); 
            myname.setText(def); 
            myic.setText(def);
            myphone.setText(def); 
            day.setSelectedIndex(0); 
            month.setSelectedIndex(0); 
            year.setSelectedIndex(0); 
            myaddress.setText(def);
            myaddress1.setText(def);
            myaddress2.setText(def);
            myemail.setText(def); 
             
            mybox.setText(def); 
            term.setSelected(false); 
             
        } 
        
    } 
} 
  
// Driver Code 
class RegistrationNurse 
{ 
  
    public static void main(String[] args) throws Exception 
    { 
        MyNurseForm thisSecform = new MyNurseForm(); 
    } 
} 