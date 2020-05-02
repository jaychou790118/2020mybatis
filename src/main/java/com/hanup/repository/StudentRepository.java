package com.hanup.repository;

import com.hanup.entity.Student;

public interface StudentRepository {
    public Student findById(long id);
}
