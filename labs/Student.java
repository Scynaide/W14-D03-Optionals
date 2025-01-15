public class Student {
    String name;
    int age;
    double grade;
    String city;

    public Student(String name, int age, double grade, String city) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        Student student = (Student) obj;
        return name.equals(student.getName());
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }


}

