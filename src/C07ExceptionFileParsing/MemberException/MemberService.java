package C07ExceptionFileParsing.MemberException;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.*;

public class MemberService {
    private MemberRepository memberRepository;
    private Member member;
    public MemberService() {
        this.memberRepository = new MemberRepository();
    }

    public void register(String name, String email, String password) throws KeyAlreadyExistsException {
        // DB에 email이 중복일 경우 예외 발생
        // 비밀번호가 너무 짧은 경우 예외 발생
        // 객체를 조립후 repository를 통해 register
        if (memberRepository.findByemail(email).isPresent()) {
            throw new KeyAlreadyExistsException("중복된 이메일입니다.");
        }

        memberRepository.register(new Member(name, email, password));

    }
    // 회원 상세 조회
    public Member findById(Long id) throws NoSuchElementException {
        // Optional 객체에 값이 없을 경우 예외발생. 있으면 Member 꺼내서 return
        if (memberRepository.findById(id).isPresent()) {
            return memberRepository.findById(id).get();
        } else {
            throw new NoSuchElementException("그런 id값이 없습니다.");
        }
    }

    // 회원 목록조회
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    // 회원 로그인
    public boolean logIn(String email, String password) {
        if(memberRepository.findByemail(email).isPresent()) {
            Optional<Member> m = memberRepository.findByemail(email);
            if (m.get().getPassword().equals(password)) {
                System.out.println("로그인 성공~");
                this.member = m.get();
                return true;
            } else {
                throw new NoSuchElementException("비밀번호가 틀렸습니다.");
            }
        } else {
            throw new NoSuchElementException("이메일을 잘못 입력했습니다.");
        }

    }
    // 비밀번호 확인
    public boolean checkPWD (String password) {
        if(this.member.getPassword().equals(password)){
            return true;
        } else {
            throw new NoSuchElementException("기존 비밀번호를 맞게 입력해주세요.");
        }
    }
    // 회원 비밀번호 수정
    public void modifyPwd(String before, String after) {
        memberRepository.modifyPwd(this.member,after);
    }
    // 회원 탈퇴
    public boolean fire(String password) {
        if(!this.member.getPassword().equals(password)) {
            throw new NoSuchElementException("비밀번호가 맞지 않아용");
        }
        memberRepository.fire(this.member, password);
        return true;
    }

}
