package Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    //Buttons
    JRadioButton r1, r2, r3, m1, m2, m3;
    JButton next;

    //TextField
    JTextField textName, textFName, textEmail, textAdd, textCity, textPCode, textState;
    JDateChooser datechooser;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    SignUp(){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160,20,600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(370,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(320, 110, 600,30);
        add(label3);


        //Name

        JLabel labelName = new JLabel("Full Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100,190,200,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300,190,400,30);
        add(textName);

        //Father Name

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 240, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300,240,400,30);
        add(textFName);

        //Date of Birth

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 340, 200, 30);
        add(DOB);

        datechooser = new JDateChooser();
        datechooser.setForeground(new Color(105,105,105));
        datechooser.setBounds(300,340,400,30);
        add(datechooser);

        //Gender

        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Ralway", Font.BOLD, 20));
        labelG.setBounds(100,290,200,30);
        add(labelG);

        //Buttons

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(179,235,242));
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setBackground(new Color(179,235,242));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(400,290,90,30);
        add(r2);

        r3 = new JRadioButton("Non Binary");
        r3.setBackground(new Color(179,235,242));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(525,290,120,30);
        add(r3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        //EMail

        JLabel labelEmail = new JLabel("Email address :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        //Married Status

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        //Buttons

        m1 = new JRadioButton("Married");
        m1.setBackground(new Color(179,235,242));
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBackground(new Color(179,235,242));
        m2.setBounds(400,440,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBackground(new Color(179,235,242));
        m3.setBounds(525,440,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        //Address

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        //City

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300,540,400,30);
        add(textCity);

        //PinCode

        JLabel labelPCode = new JLabel("Pin Code :");
        labelPCode.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPCode.setBounds(100,590,200,30);
        add(labelPCode);

        textPCode = new JTextField();
        textPCode.setFont(new Font("Raleway", Font.BOLD, 14));
        textPCode.setBounds(300,590,400,30);
        add(textPCode);

        //State

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100,640,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300,640,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,710, 80,30);
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(179,235,242));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        }else if(r2.isSelected()){
            gender = "Female";
        }else if(r3.isSelected()){
            gender = "Non-Binary";
        }

        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital = "Married";
        }else if(m2.isSelected()){
            marital = "Unmarried";
        }else if(m3.isSelected()){
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPCode.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields.");
            }else{
                Con con1 = new Con();
                String q = "insert into signup values('"+formno+"', '"+ name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+ city+"', '"+pincode+"', '"+state+"')";
                con1.statement.executeUpdate(q);

                new SignUp2(formno);
                setVisible(false);

            }

        }catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new SignUp();
    }
}
