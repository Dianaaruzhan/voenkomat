import java.awt.datatransfer.StringSelection;
import java.security.MessageDigest;
import java.sql.*;
import java.util.ArrayList;
public class DataBase {
    Connection dbconnection;
    public Connection getDbconnection() throws ClassNotFoundException, SQLException {
        String connect = "jdbc:mysql://localhost:3306/database?useUnicode=true&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        dbconnection = DriverManager.getConnection(connect,"root","");
        return dbconnection;
    }
    public void add(Person person){
        String insert1 = "INSERT INTO person ( name, surname, age, region) VALUES (?,?,?,?)";
        try{
            PreparedStatement pr1 = getDbconnection().prepareStatement(insert1);
            pr1.setString(1,person.getName());
            pr1.setString(2,person.getSurname());
            pr1.setInt(3,person.getAge());
            pr1.setString(4,person.getRegion());
            pr1.executeUpdate();
            pr1.close();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public ResultSet getUser(Person person){
        ResultSet resSet=null;
        String select = "SELECT * FROM person WHERE name =\"" + person.getName() + "\" AND surname =\"" + person.getSurname() + "\"";
        try{
            PreparedStatement prst = getDbconnection().prepareStatement(select);
            resSet=prst.executeQuery();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resSet;
    }
    public void add(Person person,Med med,Pt pt){
        String insert2 = "INSERT INTO med (id_person,policlinic, weight, height,vision,scoliosis,flatfeet,pulse,registered_with_a_doctor,mental_hospital) VALUES (?,?,?,?,?,?,?,?,?,?)";
        String insert3 = "INSERT INTO pt ( id_user, pullups, 100_m_run, 3_km_run) VALUES (?,?,?,?)";
        try{
            PreparedStatement pr2 = getDbconnection().prepareStatement(insert2);
            pr2.setString(1,med.getId_person());
            pr2.setString(2,med.getPoliclinic());
            pr2.setDouble(3,med.getWeight());
            pr2.setDouble(4,med.getHeight());
            pr2.setDouble(5,med.getVision());
            pr2.setString(6,med.getScoliosis());
            pr2.setString(7,med.getFlatfeet());
            pr2.setDouble(8,med.getPulse());
            pr2.setString(9,med.getWereregisteredwithadoctor());
            pr2.setString(10,med.getMentalhospital());
            pr2.executeUpdate();
            pr2.close();

            PreparedStatement pr3 = getDbconnection().prepareStatement(insert3);
            pr3.setString(1,pt.getId_user());
            pr3.setInt(2,pt.getPullups());
            pr3.setInt(3,pt.getHundredmeterrun());
            pr3.setInt(4,pt.getThreekilometerrun());
            pr3.executeUpdate();
            pr3.close();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void add(Resultablica res){
        String insert1 = "INSERT INTO result (result,id_person) VALUES (?,?)";
        try{
            PreparedStatement pr1 = getDbconnection().prepareStatement(insert1);
            pr1.setString(1,res.getResult());
            pr1.setString(2,res.getId_person());
            pr1.executeUpdate();
            pr1.close();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getResults (){
        ResultSet res = null;
        String select = "SELECT * FROM result JOIN person ON result.id_person = person.id";
        try{
            PreparedStatement prst = getDbconnection().prepareStatement(select);
            res = prst.executeQuery();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return res;
    }
}