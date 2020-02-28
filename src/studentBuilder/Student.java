package studentBuilder;

public class Student {

    private int id;
    private String name;
    private String major;
    private String mobileNumber;
    private double salary;

    // Optional Private Constructor
    public Student(int id, String name, String major, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.mobileNumber = mobileNumber;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static   class SimpleStudentBuilder {

        private int id;
        private String name;
        private String major;
        private String mobileNumber;
        private double salary;


        public SimpleStudentBuilder() {
        }

        public SimpleStudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public SimpleStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SimpleStudentBuilder setMajor(String major) {
            this.major = major;
            return this;
        }

        public SimpleStudentBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public SimpleStudentBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Student build() {
            // TODO : Check All Require Parameters is not null
            if (id == 0)
                throw new NullPointerException("Id Can't be with out value");

            if (name == null)
                throw new NullPointerException("Name Can't be Null");

            if (major == null)
                throw new NullPointerException("Major Can't be Null");

            if (mobileNumber == null)
                throw new NullPointerException("Mobile Number Can't be Null");

            Student student = new Student(id, name, major, mobileNumber);
            student.salary = salary;

            return student;
        }
    }
}
