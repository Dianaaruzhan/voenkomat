import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBase {
    Connection dbconnection;
    public Connection getDbconnection() throws ClassNotFoundException, SQLException {
     String connect = "jdbc:mysql:localhost:3306/database?useUnicode=true&serverTimezone=UTC";
     Class.forName("com.mysql.cj.jdbc.Driver");
     dbconnection = DriverManager.getConnection(connect,"root","");
        return dbconnection;
    }

    public void add(Person person){
        String insert = "INSERT INTO users ( name, surname, age, region) VALUES (?,?,?,?)";
        try{
            PreparedStatement pr = getDbconnection().prepareStatement(insert);
            pr.setString(1,person.getName());
            pr.setString(2,person.getSurname());
            pr.setString(3,person.getAge());
            pr.setString(4,person.getRegion());
            pr.executeUpdate();
            pr.close();
        } catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}