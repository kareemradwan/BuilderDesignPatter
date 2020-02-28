package studentBuilder;

public class StudentStepBuilder {

    public static IdFiled newBuilder() {
        return new Steps();
    }


    public static interface IdFiled {
        NameFiled setId(int id);
    }

    public static interface NameFiled {
        MajorFiled setNmae(String name);
    }

    public static interface MajorFiled {
        MobileNumber setMajor(String major);
    }

    public static interface MobileNumber {


        BuildStep setMobile(String mobile);

    }


    public static interface BuildStep {

        BuildStep setSalary(double salary);

        Student build();
    }

    private static class Steps implements IdFiled, NameFiled, MajorFiled, MobileNumber, BuildStep {

        private int id;
        private String name;
        private String major;
        private String mobileNumber;
        private double salary;


        @Override
        public NameFiled setId(int id) {
            this.id = id;
            return this;
        }

        @Override
        public MajorFiled setNmae(String name) {
            this.name = name;
            return this;
        }

        @Override
        public MobileNumber setMajor(String major) {
            this.major = major;
            return this;
        }

        @Override
        public BuildStep setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        @Override
        public BuildStep setMobile(String mobile) {
            this.mobileNumber = mobile;
            return this;
        }

        @Override
        public Student build() {
            if (id == 0) {
                throw new NullPointerException("ID Can't be 0");
            }
            if (name == null) {
                throw new NullPointerException("Name can't be null");
            }


            if (major == null) {
                throw new NullPointerException("Major can't be null");
            }

            if (mobileNumber == null) {
                throw new NullPointerException("Mbile Number can't be null");
            }

            Student student = new Student(id, name, major, mobileNumber);
            student.setSalary(salary);

            return student;
        }


    }

}
