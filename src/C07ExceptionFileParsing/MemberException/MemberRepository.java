package C07ExceptionFileParsing.MemberException;
import javax.management.openmbean.KeyAlreadyExistsException;
import java.io.*;
import java.nio.file.ProviderMismatchException;
import java.util.*;
// 저장소 역할을 하는 계층
// DB에 CRUD를 수행하는 계층
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>() ;
    // 회원가입
    public void register(Member member) {
        memberList.add(member);
    }

    public Optional<Member> findByemail(String email) {
        for(Member m : memberList) {
            if(m.getEmail().equals(email)) {
                return Optional.of(m);
            }
        }
        return Optional.empty();
    }
    //회원 상세조회
    public Optional<Member> findById(Long id) {
        return memberList.stream().filter(m -> m.getId() == id).findFirst();
    }

    // 회원 목록 조회
    public List<Member> findAll() {
        return memberList;
    }



    // 회원 비밀번호 수정
    public void modifyPwd(Member member, String after) {
                member.setPassword(after);

    }
    // 회원 탈퇴
    public void fire(Member member, String password) {
            this.memberList.remove(member);
    }

}

