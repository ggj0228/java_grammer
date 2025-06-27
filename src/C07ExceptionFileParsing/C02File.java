package C07ExceptionFileParsing;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class C02File {
    public static void main(String[] args) throws IOException {
        // 콘솔창 입출력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

        // 파일에서 읽기 : IO패키지
//        BufferedReader br2 = new BufferedReader(new FileReader("/Users/wooyoungking/Workspace/Beyond_SW/text.txt"));
//        String line = br2.readLine();
//        while(line != null) {
//            System.out.println(line);
//            line = br2.readLine();
//        }
        // 파일에서 읽기 : NIO패키지
//        Path filePath = Paths.get("/Users/wooyoungking/Workspace/Beyond_SW/text.txt");
//        // readString : 문자열 전체를 통째로 read
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);
//        // readAllLines : 문자열을 라인별로 split하여 list형태로 저장
//        List<String> st2 = Files.readAllLines(filePath);
//        for (String l : st2) {
//            System.out.println(l);
//        }

        // 파일 쓰기
        Path filePath = Paths.get("/Users/wooyoungking/Workspace/Beyond_SW/text1.txt");
        Files.write(filePath, "홍길동0".getBytes(), StandardOpenOption.CREATE_NEW); //새로입력
        Files.write(filePath, "홍길동1\n".getBytes(), StandardOpenOption.WRITE); //덮어쓰기
        Files.write(filePath, "홍길동2\n".getBytes(), StandardOpenOption.APPEND); //추가모드


    }
}
