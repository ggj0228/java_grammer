package C07ExceptionFileParsing.MemberException;

public class Member {
    private static Long staticID = 0L;

     private Long id;

     private String name;

     private String email;

     private String password;

    public Member(String name, String email, String password) {
        this.id = staticID;
        this.name = name;
        this.email = email;
        this.password = password;
        staticID++;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
