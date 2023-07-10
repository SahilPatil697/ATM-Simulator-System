package atm.simulator.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class SignupTwo extends JFrame implements ActionListener {
    
    JLabel additionalDetails,religion,category,income,education,qualification,occupation,pan,aadhar,senior,existaccount;
    JTextField panTextField,aadharTextField;
    JRadioButton syes,sno,eyes,eno;
    JButton next;
    JComboBox religionCB,categoryCB,incomeCB,occupationCB,educationCB;
   String formno;
   
    
    SignupTwo(String formno ){
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
       
        
        
        
        additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String [] valReligion= {"Hindu","Sikh","Christian","Other"};
        religionCB=new JComboBox(valReligion);
        religionCB.setBounds(300,140,400,30);
        religionCB.setBackground(Color.WHITE);
        add(religionCB);
        
  
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String  [] valCategory={"Open","OBC","SC","ST","Other"};
        categoryCB=new JComboBox(valCategory);
        categoryCB.setBackground(Color.WHITE);
        categoryCB.setBounds(300,190,400,30);
        add(categoryCB);
        
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String  [] incomecategory={"Null","< 1,50,000","<2,50,000","< 5,00,000","Upto 10,00,000"};
        incomeCB=new JComboBox(incomecategory);
        incomeCB.setBackground(Color.WHITE);
        incomeCB.setBounds(300,240,400,30);
        add(incomeCB);
        
        education = new JLabel("Educational:");
        education.setFont(new Font("Raleway", Font.BOLD, 20));
        education.setBounds(100,290,200,30);
        add(education);
        
        qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100,315,200,30);
        add(qualification);
        
        String  [] educationValues={"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        educationCB=new JComboBox(educationValues);
        educationCB.setBackground(Color.WHITE);
        educationCB.setBounds(300,315,400,30);
        add(educationCB);
        
        
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100,390,200,30);
        add(occupation);
        
        String  [] occupationValues={"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupationCB=new JComboBox(occupationValues);
        occupationCB.setBackground(Color.WHITE);
        occupationCB.setBounds(300,390,400,30);
        add(occupationCB);
        
        
        
        pan = new JLabel("Pan Number:");
        pan.setFont(new Font("Raleway", Font.BOLD, 20));
        pan.setBounds(100,440,200,30);
        add(pan);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
       
        
        aadhar= new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100,490,200,30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100,540,200,30);
        add(senior);
        
         syes=new JRadioButton("Yes");
         syes.setBounds(300,540,100,30);
         syes.setBackground(Color.WHITE);
         add(syes);
         
         sno=new JRadioButton("No");
         sno.setBounds(450,540,100,30);
         sno.setBackground(Color.WHITE);
         add(sno);
         
         ButtonGroup seniorgroup=new ButtonGroup();
         seniorgroup.add(syes);
         seniorgroup.add(sno);
         
         
        existaccount = new JLabel("Existing Account:");
        existaccount.setFont(new Font("Raleway", Font.BOLD, 20));
        existaccount.setBounds(100,590,200,30);
        add(existaccount);
        
         eyes=new JRadioButton("Yes");
         eyes.setBounds(300,590,100,30);
         eyes.setBackground(Color.WHITE);
         add(eyes);
         
         eno=new JRadioButton("No");
         eno.setBounds(450,590,100,30);
         eno.setBackground(Color.WHITE);
         add(eno);
         
         ButtonGroup existinggroup=new ButtonGroup();
         existinggroup.add(eyes);
         existinggroup.add(eno);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
//       
        String sreligion = (String) religionCB.getSelectedItem();
        String scategory = (String) categoryCB.getSelectedItem();
        String sincome = (String) incomeCB.getSelectedItem();
        String seducation = (String) educationCB.getSelectedItem();
        String soccupation= (String) occupationCB.getSelectedItem();
        String seniorcitizen=null;
        
        if(syes.isSelected()){ 
             seniorcitizen= "Yes";
        }else if(sno.isSelected()){ 
            seniorcitizen = "No";
        }
            
        
        String existingaccount = null;
        if(eyes.isSelected()){ 
            existingaccount = "Yes";
        }else if(eno.isSelected()){ 
            existingaccount = "No";
        }
           
        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();
        
        

        try{
           
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);//executing sql query
                
              setVisible(false);
              new SignupThree(formno).setVisible(true);
            
        }catch(Exception e){
             System.out.println(e);
        }
        
    }
    
    
    public static void main(String[] args){
        new SignupTwo("").setVisible(true);
    }
}


