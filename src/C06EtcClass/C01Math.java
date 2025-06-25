package C06EtcClass;

public class C01Math {
    public static void main(String[] args) {
        // Math.random() : 임의의 수 반환
        System.out.println(Math.random());
        // 로또번호 7개 뽑기 : 0 ~ 99까지의 임의의 숫자
        for(int i = 0; i < 7; i++) {
            System.out.println((int) (Math.random() * 100));
        }

        // Math.abs() : 절댓값 반환
        System.out.println(Math.abs(-5));

        // Math.ceil() : 올림, Math.floor(): 내림, Math.round(): 반올림
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(5.7));
        System.out.println(Math.round(5.7));

        // Math.max(a,b) : 두수의 최댓값, Math.min(a,b) 두수의 최소값
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));

        // Math.pow(a,b) : a의 b제곱(b가 승수)
        System.out.println(Math.pow(2,3));

        // Math.sqrt(a) : a의 제곱근
        System.out.println(Math.sqrt(25));

    }
}
