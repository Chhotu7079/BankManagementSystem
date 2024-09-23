package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JRadioButton radioButton1, radioButton2, m1, m2, m3;
    JButton next;
    JTextField  textName, textFname, textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    SignUp(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label = new JLabel("APPLICATION FORM NO. " + first);
        label.setBounds(160,20,600,40);
        label.setFont(new Font("raleway",Font.BOLD,38));
        add(label);

        JLabel label1 = new JLabel("Page 1");
        label1.setFont(new Font("Raleway",Font.BOLD,22));
        label1.setBounds(330,70,600,30);
        add(label1);

        JLabel label2 = new JLabel("Personal Details");
        label2.setFont(new Font("Raleway", Font.BOLD,22));
        label2.setBounds(290,90,600,30);
        add(label2);

        JLabel labelName = new JLabel("Name : ");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelfName = new JLabel("Fathers's Name : ");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth : ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel label3 = new JLabel("Gender : ");
        label3.setFont(new Font("Raleway",Font.BOLD,20));
        label3.setBounds(100,290,200,30);
        add(label3);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setFont(new Font("Raleway",Font.BOLD,14));
        radioButton1.setBackground(new Color(222,255,228));
        radioButton1.setBounds(300,290,60,30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setFont(new Font("Raleway",Font.BOLD,14));
        radioButton2.setBackground(new Color(222,255,228));
        radioButton2.setBounds(450,290,90,30);
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JLabel labelEmail = new JLabel("Email address : ");
        labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMS = new JLabel("Martial Status : ");
        labelMS.setFont(new Font("Raleway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labelAdd = new JLabel("Address : ");
        labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelCity = new JLabel("City : ");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code : ");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,590,400,30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100,640,200,30);
        add( labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD, 14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);



        setSize(850,800);
        setLocation(360,40);
        setLayout(null);
        getContentPane().setBackground(new Color(222,255,228));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fName = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if (radioButton1.isSelected()){
            gender = "Male";
        }else if(radioButton2.isSelected()){
            gender = "Female";
        }else {
            gender = "";
        }

        String email = textEmail.getText();

        String martial = null;
        if(m1.isSelected()){
            martial = "Married";
        } else if (m2.isSelected()) {
            martial = "Unmarried";
        }else if(m3.isSelected()){
            martial = "Other";
        }else {
            martial = "";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (name.equals("") || fName.equals("") || dob.equals("") || gender.equals("") || email.equals("") || martial.equals("") || address.equals("") ||
            city.equals("") || pincode.equals("") || state.equals("")){
                JOptionPane.showMessageDialog(null, "All the fields are required");
            }else {
                Conn c = new Conn();
                String query = "insert into SignUp values('"+formNo+"', '"+name+"','"+fName+"','"+dob+"','"+gender+"','"+email+"','"+martial+"', '"+address+"', '"+city+"','"+pincode+"','"+state+"' )";
                c.statement.executeUpdate(query);
                new SignUp2(formNo);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
