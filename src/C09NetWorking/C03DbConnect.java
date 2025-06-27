package C09NetWorking;

import java.sql.*;
import java.util.*;
import java.io.*;
import java.net.*;
import java.nio.*;
public class C03DbConnect {
    public static void main(String[] args) throws SQLException {

//        mysql드라이버 별도 다운로드 및 추가
        String url = "jdbc:mysql://localhost:3300/board?useSSL=false";
        String userName = "root";
        String password = "test1234";
        Connection connection = DriverManager.getConnection(url, userName, password);
//        Statement객체에 쿼리를 담아 db에 전달
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("select * from post");
//        rs.next()를 통해 데이터를 1row씩 read
        while (rs.next()){
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("title"));
            System.out.println(rs.getString("contents"));
            System.out.println("***************************************");
        }

        connection.close();
    }
}
