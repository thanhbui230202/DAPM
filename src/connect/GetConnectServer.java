
package connect;

import control.QuanLyUser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import model.User;

public class GetConnectServer {
    public static Connection Connectionn(String may,String userName,String password){
        String url="jdbc:sqlserver://"+may+"\\SQLEXPRESS:1433;databaseName=QuanLyBienSoXe";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            return DriverManager.getConnection(url,userName,password);
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Ket noi loi");
            System.out.println(e);
        }
        return null;
    }
    
    public static Connection getConnection()
    {
        return GetConnectServer.Connectionn("DESKTOP-T6COLHJ","sa","popdaica123");
    }
    
    
   
    public static void main(String[] args) throws SQLException {
        Connection connection = GetConnectServer.getConnection();
        String sql = "SELECT * FROM Account";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        QuanLyUser user = new QuanLyUser();
        ResultSet rs = pstmt.executeQuery();

        while( rs.next()) {
            System.out.println(rs.getString(1));
       }
        
        User users = new User();
        users = user.checkUser("090","1");
        System.out.println(users.getCccd());
    }
//    
    
}
