package com.hostelsync.service;

import com.hostelsync.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public boolean removeStudent(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
}