package atm.simulator.system;
import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c=DriverManager.getConnection("jdbc:mysql:///atm_simulator_system","root","Ssahil@4697");
            s=c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
