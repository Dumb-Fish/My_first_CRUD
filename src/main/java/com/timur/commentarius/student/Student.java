
package com.timur.commentarius.student;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name="students")
@Data
public class Student {

    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private int id;

    @Column(name="name")
    private String name;

    @Transient
    private Integer age;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name="birth_data")
    private LocalDate birth_data;

    @Column(name="email")
    private String email;

    public Student(){}

    public Student(int id, String name, LocalDate birthday, String email) {
        this.id = id;
        this.name = name;
        this.birth_data = birthday;
        this.email = email;
    }

    public Student(String name, LocalDate birthday, String email) {
        this.name = name;
        this.birth_data = birthday;
        this.email = email;

    }
    public Integer getAge() {
        return Period.between(this.birth_data, LocalDate.now()).getYears();
    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setBirth_data(String birth_data) {
//        this.birth_data = birth_data;
//    }
//
//    public String getBirth_data() {
//        return birth_data;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getEmail() {
//        return email;
//    }

    @Override
        public String toString() {
        return "id: " + id + " name: " + name + " age: " + age + " birthday: " + birth_data + " email: " + email;
    }
}