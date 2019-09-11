package entity;

import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private String email;
    private int age;
    private String semester;

    public Student(String name, String email, int age, String semester) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.semester = semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", age=" + age + ", semester=" + semester + '}';
    }

   
    
}
