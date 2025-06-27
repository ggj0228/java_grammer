package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.readString;


public class C03JsonParsing {
    public static void main(String[] args) throws IOException {
        // ObjectMapper : json 직렬화 역직렬화를 위한 라이브러리
        ObjectMapper o1 = new ObjectMapper();
        // 사용법 : 클래스명 객체명 = o1.readValue(문자열, 클래스명);
//        Path filePath = Paths.get("/Users/wooyoungking/Workspace/Beyond_SW/java_grammer/src/C07ExceptionFileParsing/myjson1.json");
//        String st1 = readString(filePath);
//        Map<String, String> myMap = o1.readValue(st1, Map.class);
//        System.out.println(myMap.get("name"));
//        Student s1 = o1.readValue(st1, Student.class);
//        System.out.println(st1);
//
//
//        Path filePath2 = Paths.get("/Users/wooyoungking/Workspace/Beyond_SW/java_grammer/src/C07ExceptionFileParsing/myjson2.json");
//        String st2 = readString(filePath);

        // 사용법 2. 트리구조의 JsonNode로 변환 : JsonNode 객체명 = o1.readTree(문자열);
        // 복잡한 json자료구조일 경우에 트리구조의 JsonNode사용
//        JsonNode jsonNodes = o1.readTree(st1);
//        Map<String, String> myMap2 = new HashMap<>();
//        myMap2.put("id", jsonNodes.get("id").asText());
//        myMap2.put("name", jsonNodes.get("name").asText());
//        myMap2.put("classNumber", jsonNodes.get("classNumber").asText());
//        myMap2.put("city", jsonNodes.get("city").asText());
//        System.out.println(myMap2);

        // 실습: myjson2를 가지고 List<Student>객체 형식으로 변환
        Path filePath3 = Paths.get("/Users/wooyoungking/Workspace/Beyond_SW/java_grammer/src/C07ExceptionFileParsing/myjson2.json");
        String st3 = readString(filePath3);
        JsonNode jsonNodes = o1.readTree(st3);
        List<Student> studentList = new ArrayList<>();
        for(JsonNode j : jsonNodes){
            Student s1 = o1.readValue(j.toString(), Student.class);
            studentList.add(s1);

        }
        System.out.println(studentList);

        //json 직렬화 -> json 변환,  writeValuesAsString
        String returnSt = o1.writeValueAsString(studentList);
        System.out.println(returnSt);

    }
}
// 실제 값의 setting은 private이라 할 지라도 직접 접근하여 setting.(reflection 기술을 활용하여 접근)
// objectmapper는 getter의 메서드명을 통해 필드값을 유추하므로, 반드시 기본생성자 + getter는 있어야한다.
class Student {
   private Long id;
    private String name;
    private String classNumber;
    private String city;


    // json 파일을 파싱하기 위해서는
    // 클래스에 기본 생성자, getter가 있어야 함
    public Student(String name, String classNumber, String city) {
        this.name = name;
        this.classNumber = classNumber;
        this.city = city;
    }

    public Student() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getclassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classGrade='" + classNumber + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
