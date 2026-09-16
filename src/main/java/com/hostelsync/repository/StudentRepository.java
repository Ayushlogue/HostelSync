package com.hostelsync.repository;

import com.hostelsync.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public void save(Student student) {
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

    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    public boolean deleteById(int id) {
        return students.removeIf(student -> student.getId() == id);
    }
}