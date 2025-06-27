package C09NetWorking;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.*;
import java.io.*;
import java.net.*;
import java.nio.*;
import java.sql.*;
public class C04WebServerDb {
    public static void main(String[] args) throws IOException, SQLException {
        // ?id=1형태로 id를 받아서, DB를 조회하는 웹서버




//        String url = "jdbc:mysql://localhost:3300/board?useSSL=false";
//        String userName = "root";
//        String password = "test1234";
//        Connection connection = DriverManager.getConnection(url, userName, password);
//
//        ServerSocket serverSocket = new ServerSocket(8080);
//        System.out.println("서버 시작");
//        while (true) {
////            accept : 사용자의 연결 요청을 수락
////            socket객체 안에는 사용자의 정보(ip 등)
//            Socket socket = serverSocket.accept();
//            // br에 사용자의 http request 문서가 담겨있음.
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//            while (line != null && !line.isEmpty()) {
//                sb.append(line);
//                sb.append("\n");
//                line = br.readLine();
//            }
//            String requestString = sb.toString();
//            String firstLine = requestString.split("\n")[0];
//            String infos = firstLine.split(" ")[1];
//            String id = "";
//            if (infos.contains("?")) {
//                id = infos.split("=")[1];
//            }
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery("select * from post where id=" + "\"" + id + "\"");
//            String response = "HTTP/1.1 200 OKay\r\n\r\n";
//            while (rs.next()) {
//                response += "id : ";
//                rs.getInt("id");
//                response += "title : ";
//
//                rs.getString("title");
//                response += "contents : ";
//
//                rs.getString("contents");
//            }
//
//
////            사용자에게 메시지 응답
//            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
////            플러시란 일반적으로 변경사항을 확정하는 것을 의미
//            socket.getOutputStream().flush();
//            socket.close();
//
//            // 사용자에게 문자열로 출력
//        }
//        mysql드라이버 별도 다운로드 및 추가
        String url = "jdbc:mysql://localhost:3300/board?useSSL=false";
        String userName = "root";
        String password = "test1234";
        Connection connection = DriverManager.getConnection(url, userName, password);
//        Statement객체에 쿼리를 담아 db에 전달
        Statement st = connection.createStatement();
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버 시작");
        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if (infos.contains("?")) {
                id = infos.split("=")[1];
            }

            ResultSet rs = st.executeQuery("select * from post where id="+"\'"+id+"\'");
            String response = "HTTP/1.1 200 OKay\r\n\r\n";
            while (rs.next()){
                response+="id : ";
                response+=rs.getInt("id");
                response+=" title : ";
                response+=rs.getString("title");
                response+=" title : ";
                response+=rs.getString("title");
            }
            System.out.println(response);
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
        }


    }
}
