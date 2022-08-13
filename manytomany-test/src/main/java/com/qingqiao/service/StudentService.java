package com.qingqiao.service;

import com.qingqiao.entity.Mistakes;
import com.qingqiao.entity.Student;

import java.util.List;

public interface StudentService {
    List<Mistakes> queryAllMis();

    List<Student> queryAll();

    Student queryStudentById(int parseInt);

    boolean changMis(String sid, String mids);
}
