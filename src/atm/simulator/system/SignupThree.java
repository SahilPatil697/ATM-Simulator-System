package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener{
    JRadioButton savingaccount,fixeddeposit,currentaccount,recurringdeposit;
    JCheckBox atmcard,internetbanking,mobilebanking,emailalerts,chequebook,estatement,c7;
    JButton submit,cancel;
    String formno;
    SignupThree( String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("RaleWay",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type:");
        type.setFont(new Font("RaleWay",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        savingaccount=new JRadioButton("Saving Account");
        savingaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        savingaccount.setBackground(Color.WHITE);
        savingaccount.setBounds(100,180,150,20);
        add(savingaccount);
        
        
        fixeddeposit = new JRadioButton("Fixed Deposit Account");
        fixeddeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        fixeddeposit.setBackground(Color.WHITE);
        fixeddeposit.setBounds(350,180,250,20);
        add(fixeddeposit);
        
        currentaccount = new JRadioButton("Current Account");
        currentaccount.setFont(new Font("Raleway", Font.BOLD, 16));
        currentaccount.setBackground(Color.WHITE);
        currentaccount.setBounds(100,220,250,20);
        add(currentaccount);
        
        recurringdeposit = new JRadioButton("Recurring Deposit Account");
        recurringdeposit.setFont(new Font("Raleway", Font.BOLD, 16));
        recurringdeposit.setBackground(Color.WHITE);
        recurringdeposit.setBounds(350,220,250,20);
        add(recurringdeposit);
        
        ButtonGroup accounttype = new ButtonGroup();
        accounttype.add(savingaccount);
        accounttype.add(fixeddeposit);
        accounttype.add(currentaccount);
        accounttype.add(recurringdeposit);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("RaleWay",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("RaleWay",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetail=new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("RaleWay",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("RaleWay",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("RaleWay",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pindetail=new JLabel("Your 4 Digit Card Number");
        pindetail.setFont(new Font("RaleWay",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
        JLabel services=new JLabel("Services Required:");
        services.setFont(new Font("RaleWay",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);
        
        atmcard = new JCheckBox("ATM CARD");
        atmcard.setBackground(Color.WHITE);
        atmcard.setFont(new Font("Raleway", Font.BOLD, 16));
        atmcard.setBounds(100,500,200,30);
        add(atmcard);
        
        internetbanking = new JCheckBox("Internet Banking");
        internetbanking.setBackground(Color.WHITE);
        internetbanking.setFont(new Font("Raleway", Font.BOLD, 16));
        internetbanking.setBounds(350,500,200,30);
        add(internetbanking);
        
        mobilebanking = new JCheckBox("Mobile Banking");
        mobilebanking.setBackground(Color.WHITE);
        mobilebanking.setFont(new Font("Raleway", Font.BOLD, 16));
        mobilebanking.setBounds(100,550,200,30);
        add(mobilebanking);
        
        emailalerts = new JCheckBox("EMAIL Alerts");
        emailalerts.setBackground(Color.WHITE);
        emailalerts.setFont(new Font("Raleway", Font.BOLD, 16));
        emailalerts.setBounds(350,550,200,30);
        add(emailalerts);
        
        chequebook = new JCheckBox("Cheque Book");
        chequebook.setBackground(Color.WHITE);
        chequebook.setFont(new Font("Raleway", Font.BOLD, 16));
        chequebook.setBounds(100,600,200,30);
        add(chequebook);
        
        estatement = new JCheckBox("E-Statement");
        estatement.setBackground(Color.WHITE);
        estatement.setFont(new Font("Raleway", Font.BOLD, 16));
        estatement.setBounds(350,600,200,30);
        add(estatement);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,20);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
        String accounttype = null;
        if(savingaccount.isSelected()){ 
            accounttype = "Saving Account";
        }
        else if(fixeddeposit.isSelected()){ 
            accounttype = "Fixed Deposit Account";
        }
        else if(currentaccount.isSelected()){ 
            accounttype = "Current Account";
        }else if(recurringdeposit.isSelected()){ 
            accounttype = "Recurring Deposit Account";
        }
        
        Random random = new Random();
        String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
        
        
        String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
        
        String facility = "";
        if(atmcard.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(internetbanking.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(mobilebanking.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(emailalerts.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(chequebook.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(estatement.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";  
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin:"+ pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(true);
                 
                }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        }else if(ae.getSource()==cancel){
                setVisible(false);
                new Login().setVisible(true);
            }
        
    }
    
    
    public static void main(String [] args){
        new SignupThree("");
    }
}
