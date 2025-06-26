package C07ExceptionFileParsing.MemberException;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// 사용자와 입출력을 받아 처리하는 계층
public class MemberController {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1번 : 회원가입, 2번 : 로그인");
            String input = sc.nextLine();
            if(input.equals("1")) {
                System.out.println("이름을 입력해주세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해주세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String password ="";
                do {
                     password = sc.nextLine();
                     if(password.length() < 3) {
                         System.out.println("비밀번호를 8자리 이상으로 해주세요");
                     }
                } while (password.length() < 3);
                try {
                    memberService.register(name, email, password);
                } catch (KeyAlreadyExistsException e) {
                    System.out.println(e.getMessage());
                }
            } else if (input.equals("2")) {
                System.out.println("이메일 입력하세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요.");
                String password = sc.nextLine();
                boolean checkLogin = false;
                try {
                    checkLogin = memberService.logIn(email, password);
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                }
                    while(true) {
                        if (!checkLogin) {
                            break;
                        }
                        System.out.println("1:회원전체목록 조회, 2: 회원 상세조회, 3: 비밀번호 변경, 4: 탈퇴");
                        String input2 = sc.nextLine();
                         if(input2.equals("1")) {
                             System.out.println("회원전체목록입니다.");
                             System.out.println(memberService.findAll());
                        } else if (input2.equals("2")) {
                            System.out.println("찾으시는 회원을 보고자 하신다면, 회원의 id를 입력하세요.");
                            Long id = Long.parseLong(sc.nextLine());
                            try {
                                System.out.println(memberService.findById(id));
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }
                        } else if(input2.equals("3")) {
                             boolean check = false;
                             String beforePWD;
                             do {
                                 System.out.println("기존 비밀번호를 입력해주세요");
                                 beforePWD = sc.nextLine();
                                 try {
                                     check = memberService.checkPWD(beforePWD);
                                 } catch (NoSuchElementException e) {
                                     System.out.println(e.getMessage());
                                 }
                             } while(!check);
                             String afterPWD = "";
                                 if (check) {

                                     do {System.out.println("변경할 비밀번호를 8자리 이상으로 해주세요");
                                         afterPWD = sc.nextLine();
                                         if (afterPWD.length() < 3) {

                                         }
                                     } while (afterPWD.length() < 3);
                                     memberService.modifyPwd(beforePWD,afterPWD);
                                 }
                         } else if(input2.equals("4")) {
                             String goodbye ="";
                             boolean goodbyecheck = false;

                                 System.out.println("비밀번호를 입력하세요");
                             do {
                                 goodbye = sc.nextLine();
                                 try {
                                     goodbyecheck = memberService.checkPWD(goodbye);
                                 } catch (NoSuchElementException e) {
                                     System.out.println(e.getMessage());
                                 }
                             } while(!goodbyecheck);
                             try {
                                 memberService.fire(goodbye);
                             } catch (NoSuchElementException e) {
                                 System.out.println(e.getMessage());
                             }
                             if(goodbyecheck) {
                                 break;
                             }
                         }

                    }
                }

            }
        }
    }

