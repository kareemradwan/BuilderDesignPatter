package studentBuilder;

public class StudentMain {

    public static void main(String[] args) {
        Student student = StudentStepBuilder
                .newBuilder()
                .setId(32)
                .setNmae("sdsa")
                .setMajor("dsa")
                .setMobile("32")
                .setSalary(32)
                .build();

    }
}


