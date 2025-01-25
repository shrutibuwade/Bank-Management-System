package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1,e2;
    JButton next;
    String formno;

    SignUp2( String formno){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(370,20,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(320,60,600,40);
        add(l2);

        //Religion

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(110,130,100,30);
        add(l3);

        String religion[] = {"Hinduism", "Buddhism", "Islam", "Christianity", "Judaism", "Sikhism", "Jainism", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(179,158,210));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350,130,320,30);
        add(comboBox);

        //Category

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(110,180,100,30);
        add(l4);

        String category[] = {"General", "OBC", "SC", "ST", "Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(179,158,210));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350,180,320,30);
        add(comboBox2);

        //Income

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(110,230,100,30);
        add(l5);

        String income[] = {"NULL", "<1,50,000", "<2,50,000", "5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(179,158,210));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350,230,320,30);
        add(comboBox3);

        //Education

        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(110,280,120,30);
        add(l6);

        String education[] = {"Student", "Under-Graduate", "Post-Graduaton", "Doctrate", "Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(179,158,210));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350,280,320,30);
        add(comboBox4);

        //Occupation

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(110,330,150,30);
        add(l7);

        String occupation[] = {"Salaried", "Student", "Unemployed", "Self-Employed", "Business", "Retired", "Freelencer", "Other"};
        comboBox5 = new JComboBox(occupation);
        //comboBox5.setBackground(Color.white);
        comboBox5.setBackground(new Color(179,158,210));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350,330,320,30);
        add(comboBox5);

        //Pan Details

        JLabel l8 = new JLabel("PAN Card No :");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(110,380,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(350,380,320,30);
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textPan);

        //Aadhar Number

        JLabel l9 = new JLabel("Aadhar No :");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(110,430,150,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350,430,320,30);
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
        add(textAadhar);

        // Senior Citizen

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(110,490,180,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(179,158,210));
        r1.setBounds(350,490,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(179,158,210));
        r2.setBounds(460,490,100,30);
        add(r2);

        //Existing Account

        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(110,540,180,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBackground(new Color(179,158,210));
        e1.setBounds(350,540,100,30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBackground(new Color(179,158,210));
        e2.setBounds(460,540,100,30);
        add(e2);

        //

        JLabel l12 = new JLabel("Form No: ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,110,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 640, 100, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(179, 158, 210));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = (String) textPan.getText();
        String aad = (String) textAadhar.getText();

        String scitizen = " ";
        if(r1.isSelected()){
            scitizen = "Yes";
        }else if(r2.isSelected()){
            scitizen = "No";
        }

        String existaccount = " ";
        if(r1.isSelected()){
            existaccount = "Yes";
        }else if(r2.isSelected()){
            existaccount = "No";
        }
        try{
             if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "Fill all the fields");
            }else {
                 Con c = new Con();
                 String q = "insert into SignUptwo values('"+formno+"','"+rel+"','"+cat+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aad+"','"+scitizen+"','"+existaccount+"')";
                 c.statement.executeUpdate(q);
                 new SignUp3(formno);
                 setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp2("");
    }
}
