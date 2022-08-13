package com.qingqiao.mapper;

import com.qingqiao.entity.Mistakes;
import com.qingqiao.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
    List<Student> queryAll();

    List<Mistakes> queryAllMis();

    int deleteSMByID(String sid);

    int addSM(@Param("sid") String sid, @Param("mid") String s);

    int updateStudent(Student student);

    Student queryStudentById(int parseInt);
}
