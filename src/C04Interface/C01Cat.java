package C04Interface;

public class C01Cat implements C01AnimalInterface1, C01AnimalInterfac2{
    @Override
    public void makeSound() {
        System.out.println("먀 앜ㄹ옹");
    }

    @Override
    public String play(String a, String b) {
        return a + "와 " + b + "가 그루밍중";
    }
}
